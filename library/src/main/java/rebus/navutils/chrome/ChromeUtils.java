package rebus.navutils.chrome;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.AnimRes;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.app.BundleCompat;
import androidx.core.content.ContextCompat;

import rebus.navutils.NavUtils;
import rebus.navutils.R;

/**
 * Created by rebus007 on 27/09/17.
 * ChromeUtils.Builder(getActivity())
 * .setShowTitle(true)
 * .setStartAnimations(R.anim.slide_in_from_bottom, R.anim.fade_out)
 * .setExitAnimations(R.anim.fade_in, R.anim.slide_out_to_bottom)
 * .setToolbarColorRes(R.color.accent)
 * .load("https://google.com");
 */

public class ChromeUtils {

    private static final int NO_TITLE = 0;
    private static final int SHOW_PAGE_TITLE = 1;

    private static final String EXTRA_SESSION = "android.support.customtabs.extra.SESSION";
    private static final String EXTRA_CLOSE_BUTTON_ICON = "android.support.customtabs.extra.CLOSE_BUTTON_ICON";
    private static final String EXTRA_TOOLBAR_COLOR = "android.support.customtabs.extra.TOOLBAR_COLOR";
    private static final String EXTRA_TITLE_VISIBILITY_STATE = "android.support.customtabs.extra.TITLE_VISIBILITY";
    private static final String EXTRA_EXIT_ANIMATION_BUNDLE = "android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE";
    private static final String EXTRA_DEFAULT_SHARE_MENU_ITEM = "android.support.customtabs.extra.SHARE_MENU_ITEM";
    private Context context;
    @NavUtils.Anim
    private int animationType = NavUtils.SYSTEM;
    @ColorInt
    private int color = 0;
    private Bitmap icon = null;
    private boolean showTitle = false;
    private Bundle bundleStartAnimations = Bundle.EMPTY;
    private Bundle bundleExitAnimations = Bundle.EMPTY;
    private boolean showDefaultShareMenuItem = false;

    private ChromeUtils(@NonNull Context context) {
        this.context = context;
    }

    private static boolean isChromeInstalled(Context context) {
        PackageManager packageManager = context.getPackageManager();
        try {
            packageManager.getPackageInfo("com.android.chrome", PackageManager.GET_ACTIVITIES);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    public static ChromeUtils Builder(Context context) {
        return new ChromeUtils(context);
    }

    public ChromeUtils setToolbarColorRes(@ColorRes int color) {
        this.color = ContextCompat.getColor(context, color);
        return this;
    }

    public ChromeUtils setToolbarColor(@ColorInt int color) {
        this.color = color;
        return this;
    }

    public ChromeUtils setShowTitle(boolean showTitle) {
        this.showTitle = showTitle;
        return this;
    }

    public ChromeUtils setCloseButtonIcon(@NonNull Bitmap icon) {
        this.icon = icon;
        return this;
    }

    public ChromeUtils setStartAnimations(@AnimRes int enterResId, @AnimRes int exitResId) {
        bundleStartAnimations = ActivityOptionsCompat.makeCustomAnimation(context, enterResId, exitResId).toBundle();
        return this;
    }

    public ChromeUtils setExitAnimations(@AnimRes int enterResId, @AnimRes int exitResId) {
        bundleExitAnimations = ActivityOptionsCompat.makeCustomAnimation(context, enterResId, exitResId).toBundle();
        return this;
    }

    public ChromeUtils animationType(@NavUtils.Anim int animationType) {
        switch (animationType) {
            case NavUtils.HORIZONTAL_RIGHT:
                bundleStartAnimations = ActivityOptionsCompat.makeCustomAnimation(context, R.anim.horizontal_right_start_enter, R.anim.horizontal_right_start_exit).toBundle();
                bundleExitAnimations = ActivityOptionsCompat.makeCustomAnimation(context, R.anim.horizontal_right_finish_enter, R.anim.horizontal_right_finish_exit).toBundle();
                break;
            case NavUtils.HORIZONTAL_LEFT:
                bundleStartAnimations = ActivityOptionsCompat.makeCustomAnimation(context, R.anim.horizontal_left_start_enter, R.anim.horizontal_left_start_exit).toBundle();
                bundleExitAnimations = ActivityOptionsCompat.makeCustomAnimation(context, R.anim.horizontal_left_finish_enter, R.anim.horizontal_left_finish_exit).toBundle();
                break;
            case NavUtils.VERTICAL_BOTTOM:
                bundleStartAnimations = ActivityOptionsCompat.makeCustomAnimation(context, R.anim.vertical_bottom_start_enter, R.anim.fade_out).toBundle();
                bundleExitAnimations = ActivityOptionsCompat.makeCustomAnimation(context, R.anim.fade_in, R.anim.vertical_bottom_finish_exit).toBundle();
                break;
            case NavUtils.VERTICAL_TOP:
                bundleStartAnimations = ActivityOptionsCompat.makeCustomAnimation(context, R.anim.vertical_top_start_enter, R.anim.fade_out).toBundle();
                bundleExitAnimations = ActivityOptionsCompat.makeCustomAnimation(context, R.anim.fade_in, R.anim.vertical_top_finish_exit).toBundle();
                break;
            case NavUtils.NONE:
                bundleStartAnimations = ActivityOptionsCompat.makeCustomAnimation(context, 0, 0).toBundle();
                bundleExitAnimations = ActivityOptionsCompat.makeCustomAnimation(context, 0, 0).toBundle();
                break;
            case NavUtils.SYSTEM:
            default:
                bundleStartAnimations = Bundle.EMPTY;
                bundleExitAnimations = Bundle.EMPTY;
                break;
        }
        return this;
    }

    public ChromeUtils setShowDefaultShareMenuItem(boolean showDefaultShareMenuItem) {
        this.showDefaultShareMenuItem = showDefaultShareMenuItem;
        return this;
    }

    public void load(String url) {
        load(Uri.parse(url));
    }

    public void load(Uri uri) {
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        if (isChromeInstalled(context)) {
            Bundle bundle = new Bundle();
            BundleCompat.putBinder(bundle, EXTRA_SESSION, null);
            intent.setPackage("com.android.chrome");
            intent.putExtra(EXTRA_CLOSE_BUTTON_ICON, icon);
            intent.putExtra(EXTRA_TOOLBAR_COLOR, color);
            intent.putExtra(EXTRA_EXIT_ANIMATION_BUNDLE, bundle);
            intent.putExtra(EXTRA_TITLE_VISIBILITY_STATE, showTitle ? SHOW_PAGE_TITLE : NO_TITLE);
            intent.putExtra(EXTRA_EXIT_ANIMATION_BUNDLE, bundleExitAnimations);
            intent.putExtra(EXTRA_DEFAULT_SHARE_MENU_ITEM, showDefaultShareMenuItem);
            intent.putExtras(bundle);
        }
        ActivityCompat.startActivity(context, intent, bundleStartAnimations);
    }

}
