package com.raphaelbussa.navutils.chrome

import android.content.Context
import android.content.Intent
import android.content.pm.PackageInstaller.EXTRA_SESSION
import android.graphics.Bitmap
import android.net.Uri
import android.os.Build
import android.os.Bundle
import androidx.annotation.AnimRes
import androidx.annotation.ColorInt
import androidx.annotation.ColorRes
import androidx.core.app.ActivityCompat
import androidx.core.app.ActivityOptionsCompat
import androidx.core.app.BundleCompat
import androidx.core.content.ContextCompat
import com.R
import com.raphaelbussa.navutils.NavUtils
import com.raphaelbussa.navutils.NavUtilsMarker
import com.raphaelbussa.navutils.isChromeInstalled

internal const val NO_TITLE = 0
internal const val SHOW_PAGE_TITLE = 1
internal const val EXTRA_CLOSE_BUTTON_ICON = "android.support.customtabs.extra.CLOSE_BUTTON_ICON"
internal const val EXTRA_TOOLBAR_COLOR = "android.support.customtabs.extra.TOOLBAR_COLOR"
internal const val EXTRA_TITLE_VISIBILITY_STATE = "android.support.customtabs.extra.TITLE_VISIBILITY"
internal const val EXTRA_EXIT_ANIMATION_BUNDLE = "android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE"
internal const val EXTRA_DEFAULT_SHARE_MENU_ITEM = "android.support.customtabs.extra.SHARE_MENU_ITEM"

@NavUtilsMarker
class ChromeBuilder(internal val context: Context) {

    internal var animationType: NavUtils.Anim = NavUtils.Anim.SYSTEM
        private set
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

    fun toolbarColorRes(@ColorRes color: Int) {
        this.color = ContextCompat.getColor(context, color)
    }

    fun toolbarColor(@ColorInt color: Int) {
        this.color = color
    }

    fun showTitle(showTitle: Boolean) {
        this.showTitle = showTitle
    }

    fun closeButtonIcon(icon: Bitmap) {
        this.icon = icon
    }

    fun startAnimations(@AnimRes enterResId: Int, @AnimRes exitResId: Int) {
        bundleStartAnimations = ActivityOptionsCompat.makeCustomAnimation(context, enterResId, exitResId).toBundle()
                ?: Bundle.EMPTY
    }

    fun exitAnimations(@AnimRes enterResId: Int, @AnimRes exitResId: Int) {
        bundleExitAnimations = ActivityOptionsCompat.makeCustomAnimation(context, enterResId, exitResId).toBundle()
                ?: Bundle.EMPTY
    }

    fun showDefaultShareMenuItem(showDefaultShareMenuItem: Boolean) {
        this.showDefaultShareMenuItem = showDefaultShareMenuItem
    }

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

class NavUtilsPushChromeActivity(
        private val chromeBuilder: ChromeBuilder
) {

    fun load(url: String) {
        load(Uri.parse(url))
    }

    fun load(uri: Uri) {
        val intent = Intent(Intent.ACTION_VIEW, uri)
        if (isChromeInstalled(chromeBuilder.context)) {
            val bundle = Bundle()
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                BundleCompat.putBinder(bundle, EXTRA_SESSION, null)
            }
            intent.setPackage("com.android.chrome")
            intent.putExtra(EXTRA_CLOSE_BUTTON_ICON, chromeBuilder.icon)
            intent.putExtra(EXTRA_TOOLBAR_COLOR, chromeBuilder.color)
            intent.putExtra(EXTRA_EXIT_ANIMATION_BUNDLE, bundle)
            intent.putExtra(EXTRA_TITLE_VISIBILITY_STATE, if (chromeBuilder.showTitle) SHOW_PAGE_TITLE else NO_TITLE)
            intent.putExtra(EXTRA_EXIT_ANIMATION_BUNDLE, chromeBuilder.bundleExitAnimations)
            intent.putExtra(EXTRA_DEFAULT_SHARE_MENU_ITEM, chromeBuilder.showDefaultShareMenuItem)
            intent.putExtras(bundle)
        }
        ActivityCompat.startActivity(chromeBuilder.context, intent, chromeBuilder.bundleStartAnimations)
    }

}