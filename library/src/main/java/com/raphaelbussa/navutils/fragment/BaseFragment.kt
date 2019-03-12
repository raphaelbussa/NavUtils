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

/**
 * BaseFragment
 * @property rootView View?
 * @property toolbar Toolbar?
 * @property toolbarShadow View?
 * @property supportFragmentManager FragmentManager?
 */
@SuppressLint("ResourceType")
@Suppress("MemberVisibilityCanBePrivate", "unused", "UNUSED_PARAMETER")
abstract class BaseFragment : Fragment() {

    var rootView: View? = null
        private set

    val toolbar: Toolbar?
        get() = (activity as BaseActivity).toolbar

    val toolbarShadow: View?
        get() = (activity as BaseActivity).toolbarShadow

    val supportFragmentManager: FragmentManager?
        get() = fragmentManager

    /**
     * onCreateView
     * @param inflater LayoutInflater
     * @param container ViewGroup?
     * @param savedInstanceState Bundle?
     * @return View?
     */
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        if (setLayoutResource() != 0) {
            rootView = inflater.inflate(setLayoutResource(), container, false)
        }
        return rootView
    }

    /**
     * setIcon
     * @param icon Int
     */
    fun setIcon(@DrawableRes icon: Int) {
        (activity as BaseActivity).setIcon(icon)
    }

    /**
     * setIcon
     * @param icon Drawable
     */
    fun setIcon(icon: Drawable) {
        (activity as BaseActivity).setIcon(icon)
    }

    /**
     * setTitle
     * @param title Int
     */
    fun setTitle(@StringRes title: Int) {
        (activity as BaseActivity).setTitle(title)
    }

    /**
     * setTitle
     * @param title String
     */
    fun setTitle(title: String) {
        (activity as BaseActivity).setTitle(title)
    }

    /**
     * setTitlePost
     * @param title String
     */
    fun setTitlePost(title: String) {
        (activity as BaseActivity).setTitlePost(title)
    }

    /**
     * setTitlePost
     * @param title Int
     */
    fun setTitlePost(@StringRes title: Int) {
        (activity as BaseActivity).setTitlePost(title)
    }

    /**
     * removeTitle
     */
    fun removeTitle() {
        (activity as BaseActivity).removeTitle()
    }

    /**
     * setTitleColorRes
     * @param color Int
     */
    fun setTitleColorRes(@ColorRes color: Int) {
        (activity as BaseActivity).setTitleColorRes(color)
    }

    /**
     * setTitleColor
     * @param color Int
     */
    fun setTitleColor(@ColorInt color: Int) {
        (activity as BaseActivity).titleColor = color
    }

    /**
     * setSubtitle
     * @param subtitle Int
     */
    fun setSubtitle(@StringRes subtitle: Int) {
        (activity as BaseActivity).setSubtitle(subtitle)
    }

    /**
     * setSubtitle
     * @param subtitle String
     */
    fun setSubtitle(subtitle: String) {
        (activity as BaseActivity).setSubtitle(subtitle)
    }

    /**
     * setSubtitlePost
     * @param subtitle String
     */
    fun setSubtitlePost(subtitle: String) {
        (activity as BaseActivity).setSubtitlePost(subtitle)
    }

    /**
     * setSubtitlePost
     * @param subtitle Int
     */
    fun setSubtitlePost(@StringRes subtitle: Int) {
        (activity as BaseActivity).setSubtitlePost(subtitle)
    }

    /**
     * removeSubtitle
     */
    fun removeSubtitle() {
        (activity as BaseActivity).removeSubtitle()
    }

    /**
     * setSubtitleColorRes
     * @param color Int
     */
    fun setSubtitleColorRes(@ColorRes color: Int) {
        (activity as BaseActivity).setSubtitleColorRes(color)
    }

    /**
     * setSubtitleColor
     * @param color Int
     */
    fun setSubtitleColor(@ColorInt color: Int) {
        (activity as BaseActivity).setSubtitleColor(color)
    }

    /**
     * setNavigationIcon
     * @param icon Int
     */
    fun setNavigationIcon(@DrawableRes icon: Int) {
        (activity as BaseActivity).setNavigationIcon(icon)
    }

    /**
     * setNavigationIcon
     * @param icon Drawable
     */
    fun setNavigationIcon(icon: Drawable) {
        (activity as BaseActivity).setNavigationIcon(icon)
    }

    /**
     * setNavigationOnClickListener
     * @param onClickListener View.OnClickListener
     */
    fun setNavigationOnClickListener(onClickListener: View.OnClickListener) {
        (activity as BaseActivity).setNavigationOnClickListener(onClickListener)
    }

    /**
     * setStatusBarColor
     * @param color Int
     */
    fun setStatusBarColor(@ColorInt color: Int) {
        (activity as BaseActivity).setStatusBarColor(color)
    }

    /**
     * setStatusBarColorRes
     * @param color Int
     */
    fun setStatusBarColorRes(@ColorRes color: Int) {
        (activity as BaseActivity).setStatusBarColorRes(color)
    }

    /**
     * findViewById
     * @param id Int
     * @return T?
     */
    fun <T : View> findViewById(@IdRes id: Int): T? {
        return if (rootView == null || id < 0) null else rootView?.findViewById(id)
    }

    /**
     * setLayoutResource
     * @return Int
     */
    @LayoutRes
    protected abstract fun setLayoutResource(): Int

    /**
     * onSupportBackPressed
     * @param bundle Bundle
     * @return Boolean
     */
    fun onSupportBackPressed(bundle: Bundle): Boolean {
        return false
    }

}
