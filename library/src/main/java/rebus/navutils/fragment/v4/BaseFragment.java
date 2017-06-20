package rebus.navutils.fragment.v4;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.ColorInt;
import android.support.annotation.ColorRes;
import android.support.annotation.DrawableRes;
import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;
import android.support.annotation.StringRes;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import rebus.navutils.activity.BaseActivity;

/**
 * Created by Raphael on 07/10/2015.
 */
public abstract class BaseFragment extends Fragment {

    private View rootView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (setLayoutResource() != 0) {
            rootView = inflater.inflate(setLayoutResource(), container, false);
        }
        return rootView;
    }

    public Toolbar getToolbar() {
        return ((BaseActivity) getActivity()).getToolbar();
    }

    public View getToolbarShadow() {
        return ((BaseActivity) getActivity()).getToolbarShadow();
    }

    public View getRootView() {
        return rootView;
    }

    public void setIcon(@DrawableRes int icon) {
        ((BaseActivity) getActivity()).setIcon(icon);
    }

    public void setIcon(Drawable icon) {
        ((BaseActivity) getActivity()).setIcon(icon);
    }

    public void setTitle(@StringRes int title) {
        ((BaseActivity) getActivity()).setTitle(title);
    }

    public void setTitle(String title) {
        ((BaseActivity) getActivity()).setTitle(title);
    }

    public void setTitlePost(String title) {
        ((BaseActivity) getActivity()).setTitlePost(title);
    }

    public void setTitlePost(@StringRes int title) {
        ((BaseActivity) getActivity()).setTitlePost(title);
    }

    public void removeTitle() {
        ((BaseActivity) getActivity()).removeTitle();
    }

    public void setTitleColorRes(@ColorRes int color) {
        ((BaseActivity) getActivity()).setTitleColorRes(color);
    }

    @SuppressWarnings("deprecation")
    public void setTitleColor(@ColorInt int color) {
        ((BaseActivity) getActivity()).setTitleColor(color);
    }

    public void setSubtitle(@StringRes int subtitle) {
        ((BaseActivity) getActivity()).setSubtitle(subtitle);
    }

    public void setSubtitle(String subtitle) {
        ((BaseActivity) getActivity()).setSubtitle(subtitle);
    }

    public void setSubtitlePost(String subtitle) {
        ((BaseActivity) getActivity()).setSubtitlePost(subtitle);
    }

    public void setSubtitlePost(@StringRes int subtitle) {
        ((BaseActivity) getActivity()).setSubtitlePost(subtitle);
    }

    public void removeSubtitle() {
        ((BaseActivity) getActivity()).removeSubtitle();
    }

    public void setSubtitleColorRes(@ColorRes int color) {
        ((BaseActivity) getActivity()).setSubtitleColorRes(color);
    }

    public void setSubtitleColor(@ColorInt int color) {
        ((BaseActivity) getActivity()).setSubtitleColor(color);
    }

    public void setNavigationIcon(@DrawableRes int icon) {
        ((BaseActivity) getActivity()).setNavigationIcon(icon);
    }

    public void setNavigationIcon(Drawable icon) {
        ((BaseActivity) getActivity()).setNavigationIcon(icon);
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        ((BaseActivity) getActivity()).setNavigationOnClickListener(onClickListener);
    }

    public void setStatusBarColor(@ColorInt int color) {
        ((BaseActivity) getActivity()).setStatusBarColor(color);
    }

    public void setStatusBarColorRes(@ColorRes int color) {
        ((BaseActivity) getActivity()).setStatusBarColorRes(color);
    }

    public View findViewById(@IdRes int id) {
        if (rootView == null || id < 0) return null;
        return rootView.findViewById(id);
    }

    public FragmentManager getSupportFragmentManager() {
        return getFragmentManager();
    }

    @LayoutRes
    protected abstract int setLayoutResource();

    public boolean onSupportBackPressed(Bundle bundle) {
        return false;
    }

}
