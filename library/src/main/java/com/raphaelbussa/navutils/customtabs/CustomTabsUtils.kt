package com.raphaelbussa.navutils.customtabs

import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import android.os.Bundle
import androidx.annotation.AnimRes
import androidx.annotation.ColorInt
import androidx.annotation.ColorRes
import androidx.core.app.ActivityCompat
import androidx.core.app.ActivityOptionsCompat
import androidx.core.content.ContextCompat
import com.raphaelbussa.navutils.NavUtils
import com.raphaelbussa.navutils.NavUtilsMarker
import com.raphaelbussa.navutils.R

internal const val NO_TITLE = 0
internal const val SHOW_PAGE_TITLE = 1
internal const val EXTRA_SESSION = "android.support.customtabs.extra.SESSION"
internal const val EXTRA_CLOSE_BUTTON_ICON = "android.support.customtabs.extra.CLOSE_BUTTON_ICON"
internal const val EXTRA_TOOLBAR_COLOR = "android.support.customtabs.extra.TOOLBAR_COLOR"
internal const val EXTRA_TITLE_VISIBILITY_STATE = "android.support.customtabs.extra.TITLE_VISIBILITY"
internal const val EXTRA_EXIT_ANIMATION_BUNDLE = "android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE"
internal const val EXTRA_DEFAULT_SHARE_MENU_ITEM = "android.support.customtabs.extra.SHARE_MENU_ITEM"

/**
 * CustomTabsBuilder
 * @property context Context
 * @property animationType Anim
 * @property color Int
 * @property icon Bitmap?
 * @property showTitle Boolean
 * @property bundleStartAnimations Bundle
 * @property bundleExitAnimations Bundle
 * @property showDefaultShareMenuItem Boolean
 * @constructor
 */

@NavUtilsMarker
class CustomTabsBuilder(internal val context: Context) {

    private var animationType: NavUtils.Anim = NavUtils.Anim.SYSTEM
    @ColorInt
    internal var color: Int = 0
        private set
    internal var icon: Bitmap? = null
        private set
    internal var showTitle: Boolean = false
        private set
    internal var bundleStartAnimations: Bundle = Bundle.EMPTY
        private set
    internal var bundleExitAnimations: Bundle = Bundle.EMPTY
        private set
    internal var showDefaultShareMenuItem: Boolean = false
        private set

    /**
     * toolbarColorRes
     * @param color Int
     */
    fun toolbarColorRes(@ColorRes color: Int) {
        this.color = ContextCompat.getColor(context, color)
    }

    /**
     * toolbarColor
     * @param color Int
     */
    fun toolbarColor(@ColorInt color: Int) {
        this.color = color
    }

    /**
     * showTitle
     * @param showTitle Boolean
     */
    fun showTitle(showTitle: Boolean) {
        this.showTitle = showTitle
    }

    /**
     * closeButtonIcon
     * @param icon Bitmap
     */
    fun closeButtonIcon(icon: Bitmap) {
        this.icon = icon
    }

    /**
     * startAnimations
     * @param enterResId Int
     * @param exitResId Int
     */
    fun startAnimations(@AnimRes enterResId: Int, @AnimRes exitResId: Int) {
        bundleStartAnimations = ActivityOptionsCompat.makeCustomAnimation(context, enterResId, exitResId).toBundle()
                ?: Bundle.EMPTY
    }

    /**
     * exitAnimations
     * @param enterResId Int
     * @param exitResId Int
     */
    fun exitAnimations(@AnimRes enterResId: Int, @AnimRes exitResId: Int) {
        bundleExitAnimations = ActivityOptionsCompat.makeCustomAnimation(context, enterResId, exitResId).toBundle()
                ?: Bundle.EMPTY
    }

    /**
     * showDefaultShareMenuItem
     * @param showDefaultShareMenuItem Boolean
     */
    fun showDefaultShareMenuItem(showDefaultShareMenuItem: Boolean) {
        this.showDefaultShareMenuItem = showDefaultShareMenuItem
    }

    /**
     * animationType
     * @param animationType NavUtils.Anim
     */
    fun animationType(animationType: NavUtils.Anim) {
        when (animationType) {
            NavUtils.Anim.HORIZONTAL_RIGHT -> {
                bundleStartAnimations = ActivityOptionsCompat.makeCustomAnimation(context, R.anim.horizontal_right_start_enter, R.anim.horizontal_right_start_exit).toBundle()
                        ?: Bundle.EMPTY
                bundleExitAnimations = ActivityOptionsCompat.makeCustomAnimation(context, R.anim.horizontal_right_finish_enter, R.anim.horizontal_right_finish_exit).toBundle()
                        ?: Bundle.EMPTY
            }
            NavUtils.Anim.HORIZONTAL_LEFT -> {
                bundleStartAnimations = ActivityOptionsCompat.makeCustomAnimation(context, R.anim.horizontal_left_start_enter, R.anim.horizontal_left_start_exit).toBundle()
                        ?: Bundle.EMPTY
                bundleExitAnimations = ActivityOptionsCompat.makeCustomAnimation(context, R.anim.horizontal_left_finish_enter, R.anim.horizontal_left_finish_exit).toBundle()
                        ?: Bundle.EMPTY
            }
            NavUtils.Anim.VERTICAL_BOTTOM -> {
                bundleStartAnimations = ActivityOptionsCompat.makeCustomAnimation(context, R.anim.vertical_bottom_start_enter, R.anim.fade_out).toBundle()
                        ?: Bundle.EMPTY
                bundleExitAnimations = ActivityOptionsCompat.makeCustomAnimation(context, R.anim.fade_in, R.anim.vertical_bottom_finish_exit).toBundle()
                        ?: Bundle.EMPTY
            }
            NavUtils.Anim.VERTICAL_TOP -> {
                bundleStartAnimations = ActivityOptionsCompat.makeCustomAnimation(context, R.anim.vertical_top_start_enter, R.anim.fade_out).toBundle()
                        ?: Bundle.EMPTY
                bundleExitAnimations = ActivityOptionsCompat.makeCustomAnimation(context, R.anim.fade_in, R.anim.vertical_top_finish_exit).toBundle()
                        ?: Bundle.EMPTY
            }
            NavUtils.Anim.NONE -> {
                bundleStartAnimations = ActivityOptionsCompat.makeCustomAnimation(context, 0, 0).toBundle()
                        ?: Bundle.EMPTY
                bundleExitAnimations = ActivityOptionsCompat.makeCustomAnimation(context, 0, 0).toBundle()
                        ?: Bundle.EMPTY
            }
            NavUtils.Anim.SYSTEM -> {
                bundleStartAnimations = Bundle.EMPTY
                bundleExitAnimations = Bundle.EMPTY
            }
        }
    }

}

/**
 * NavUtilsPushCustomTabsActivity
 * @property customTabsBuilder CustomTabsBuilder
 * @constructor
 */
@Suppress("MemberVisibilityCanBePrivate")
class NavUtilsPushCustomTabsActivity(
        private val customTabsBuilder: CustomTabsBuilder
) {

    /**
     * load
     * @param url String
     */
    fun load(url: String) {
        load(Uri.parse(url))
    }

    /**
     * load
     * @param uri Uri
     */
    fun load(uri: Uri) {
        val intent = Intent(Intent.ACTION_VIEW, uri)
        val extras = Bundle()
        extras.putBinder(EXTRA_SESSION, null)
        intent.putExtra(EXTRA_CLOSE_BUTTON_ICON, customTabsBuilder.icon)
        intent.putExtra(EXTRA_TOOLBAR_COLOR, customTabsBuilder.color)
        intent.putExtra(EXTRA_TITLE_VISIBILITY_STATE, if (customTabsBuilder.showTitle) SHOW_PAGE_TITLE else NO_TITLE)
        intent.putExtra(EXTRA_EXIT_ANIMATION_BUNDLE, customTabsBuilder.bundleExitAnimations)
        intent.putExtra(EXTRA_DEFAULT_SHARE_MENU_ITEM, customTabsBuilder.showDefaultShareMenuItem)
        intent.putExtras(extras)
        ActivityCompat.startActivity(customTabsBuilder.context, intent, customTabsBuilder.bundleStartAnimations)
    }

}