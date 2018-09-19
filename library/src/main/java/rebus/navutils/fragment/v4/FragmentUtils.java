package rebus.navutils.fragment.v4;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.AnimRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import rebus.navutils.NavUtils;
import rebus.navutils.R;

/**
 * Created by raphaelbussa on 06/02/17.
 */

public class FragmentUtils {

    private FragmentManager fragmentManager;
    private int frameId;

    @NavUtils.Anim
    private int animationType = NavUtils.SYSTEM;
    private boolean noEnterAnimations = false;
    private boolean noExitAnimations = false;
    private boolean addToBackStack = false;
    private String tag = null;
    private Bundle bundle = null;
    private boolean customAnimation = false;
    private int enterResId = 0;
    private int exitResId = 0;
    private int popEnterResId = 0;
    private int popExitResId = 0;

    public FragmentUtils(FragmentManager fragmentManager, int frameId) {
        this.fragmentManager = fragmentManager;
        this.frameId = frameId;
    }

    public static FragmentUtils Builder(@NonNull FragmentManager fragmentManager, @IdRes int frameId) {
        return new FragmentUtils(fragmentManager, frameId);
    }

    public FragmentUtils animationType(@NavUtils.Anim int animationType) {
        this.animationType = animationType;
        return this;
    }

    public FragmentUtils customAnimation(@AnimRes int enterResId, @AnimRes int exitResId, @AnimRes int popEnterResId, @AnimRes int popExitResId) {
        this.customAnimation = true;
        this.enterResId = enterResId;
        this.exitResId = exitResId;
        this.popEnterResId = popEnterResId;
        this.popExitResId = popExitResId;
        return this;
    }

    public FragmentUtils noEnterAnimations(boolean noEnterAnimations) {
        this.noEnterAnimations = noEnterAnimations;
        return this;
    }

    public FragmentUtils noExitAnimations(boolean noExitAnimations) {
        this.noExitAnimations = noExitAnimations;
        return this;
    }

    public FragmentUtils addToBackStack() {
        this.addToBackStack = true;
        return this;
    }

    public FragmentUtils tag(String tag) {
        this.tag = tag;
        return this;
    }

    public FragmentUtils arguments(Bundle bundle) {
        this.bundle = bundle;
        return this;
    }

    public void add(Fragment fragment) {
        if (tag == null) tag = fragment.getClass().getName().toUpperCase();
        commit(fragment, false);
    }

    public void add(Context context, Class clazz) {
        add(Fragment.instantiate(context, clazz.getName()));
    }

    public void replace(Fragment fragment) {
        if (tag == null) tag = fragment.getClass().getName().toUpperCase();
        commit(fragment, true);
    }

    public void replace(Context context, Class clazz) {
        replace(Fragment.instantiate(context, clazz.getName()));
    }

    private void commit(Fragment fragment, boolean replace) {
        if (bundle != null) fragment.setArguments(bundle);
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        if (customAnimation) {
            transaction.setCustomAnimations(noEnterAnimations ? 0 : enterResId, noExitAnimations ? 0 : exitResId, noEnterAnimations ? 0 : popEnterResId, noExitAnimations ? 0 : popExitResId);
        } else {
            switch (animationType) {
                case NavUtils.HORIZONTAL_RIGHT:
                    transaction.setCustomAnimations(noEnterAnimations ? 0 : R.anim.view_flipper_transition_in_left, noExitAnimations ? 0 : R.anim.view_flipper_transition_out_left, noEnterAnimations ? 0 : R.anim.view_flipper_transition_in_right, noExitAnimations ? 0 : R.anim.view_flipper_transition_out_right);
                    break;
                case NavUtils.HORIZONTAL_LEFT:
                    transaction.setCustomAnimations(noEnterAnimations ? 0 : R.anim.view_flipper_transition_in_right, noExitAnimations ? 0 : R.anim.view_flipper_transition_out_right, noEnterAnimations ? 0 : R.anim.view_flipper_transition_in_left, noExitAnimations ? 0 : R.anim.view_flipper_transition_out_left);
                    break;
                case NavUtils.VERTICAL_BOTTOM:
                    transaction.setCustomAnimations(noEnterAnimations ? 0 : R.anim.view_flipper_transition_in_bottom, noExitAnimations ? 0 : R.anim.view_flipper_transition_out_bottom, noEnterAnimations ? 0 : R.anim.view_flipper_transition_in_top, noExitAnimations ? 0 : R.anim.view_flipper_transition_out_top);
                    break;
                case NavUtils.VERTICAL_TOP:
                    transaction.setCustomAnimations(noEnterAnimations ? 0 : R.anim.view_flipper_transition_in_top, noExitAnimations ? 0 : R.anim.view_flipper_transition_out_top, noEnterAnimations ? 0 : R.anim.view_flipper_transition_in_bottom, noExitAnimations ? 0 : R.anim.view_flipper_transition_out_bottom);
                    break;
                case NavUtils.NONE:
                    transaction.setCustomAnimations(0, 0, 0, 0);
                    break;
                case NavUtils.SYSTEM:
                    transaction.setCustomAnimations(noEnterAnimations ? 0 : R.anim.fade_in, noExitAnimations ? 0 : R.anim.fade_out, noEnterAnimations ? 0 : R.anim.fade_in, noExitAnimations ? 0 : R.anim.fade_out);
                default:
                    break;
            }
        }
        if (replace) {
            if (tag != null) {
                transaction.replace(frameId, fragment, tag);
            } else {
                transaction.replace(frameId, fragment);
            }
        } else {
            if (tag != null) {
                transaction.add(frameId, fragment, tag);
            } else {
                transaction.add(frameId, fragment);
            }
        }
        if (addToBackStack) {
            transaction.addToBackStack(tag);
        }
        transaction.setReorderingAllowed(true);
        transaction.commit();
    }

}
