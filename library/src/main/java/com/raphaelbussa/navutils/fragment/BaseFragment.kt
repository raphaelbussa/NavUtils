package com.raphaelbussa.navutils.fragment

import android.annotation.SuppressLint
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.*
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.raphaelbussa.navutils.activity.BaseActivity

abstract class BaseFragment : Fragment() {

    var rootView: View? = null
        private set

    val toolbar: Toolbar?
        get() = (activity as BaseActivity).toolbar

    val toolbarShadow: View?
        get() = (activity as BaseActivity).toolbarShadow

    val supportFragmentManager: FragmentManager?
        get() = fragmentManager

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        if (setLayoutResource() != 0) {
            rootView = inflater.inflate(setLayoutResource(), container, false)
        }
        return rootView
    }

    fun setIcon(@DrawableRes icon: Int) {
        (activity as BaseActivity).setIcon(icon)
    }

    fun setIcon(icon: Drawable) {
        (activity as BaseActivity).setIcon(icon)
    }

    fun setTitle(@StringRes title: Int) {
        (activity as BaseActivity).setTitle(title)
    }

    fun setTitle(title: String) {
        (activity as BaseActivity).setTitle(title)
    }

    fun setTitlePost(title: String) {
        (activity as BaseActivity).setTitlePost(title)
    }

    fun setTitlePost(@StringRes title: Int) {
        (activity as BaseActivity).setTitlePost(title)
    }

    fun removeTitle() {
        (activity as BaseActivity).removeTitle()
    }

    fun setTitleColorRes(@ColorRes color: Int) {
        (activity as BaseActivity).setTitleColorRes(color)
    }

    fun setTitleColor(@ColorInt color: Int) {
        (activity as BaseActivity).titleColor = color
    }

    fun setSubtitle(@StringRes subtitle: Int) {
        (activity as BaseActivity).setSubtitle(subtitle)
    }

    fun setSubtitle(subtitle: String) {
        (activity as BaseActivity).setSubtitle(subtitle)
    }

    fun setSubtitlePost(subtitle: String) {
        (activity as BaseActivity).setSubtitlePost(subtitle)
    }

    fun setSubtitlePost(@StringRes subtitle: Int) {
        (activity as BaseActivity).setSubtitlePost(subtitle)
    }

    fun removeSubtitle() {
        (activity as BaseActivity).removeSubtitle()
    }

    fun setSubtitleColorRes(@ColorRes color: Int) {
        (activity as BaseActivity).setSubtitleColorRes(color)
    }

    fun setSubtitleColor(@ColorInt color: Int) {
        (activity as BaseActivity).setSubtitleColor(color)
    }

    fun setNavigationIcon(@DrawableRes icon: Int) {
        (activity as BaseActivity).setNavigationIcon(icon)
    }

    fun setNavigationIcon(icon: Drawable) {
        (activity as BaseActivity).setNavigationIcon(icon)
    }

    fun setNavigationOnClickListener(onClickListener: View.OnClickListener) {
        (activity as BaseActivity).setNavigationOnClickListener(onClickListener)
    }

    fun setStatusBarColor(@ColorInt color: Int) {
        (activity as BaseActivity).setStatusBarColor(color)
    }

    fun setStatusBarColorRes(@ColorRes color: Int) {
        (activity as BaseActivity).setStatusBarColorRes(color)
    }

    @SuppressLint("ResourceType")
    fun <T : View> findViewById(@IdRes id: Int): T? {
        return if (rootView == null || id < 0) null else rootView?.findViewById(id)
    }

    @LayoutRes
    protected abstract fun setLayoutResource(): Int

    fun onSupportBackPressed(bundle: Bundle): Boolean {
        return false
    }

}
