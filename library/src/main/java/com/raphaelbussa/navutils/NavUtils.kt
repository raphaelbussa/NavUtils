package com.raphaelbussa.navutils

import android.content.Context
import android.content.pm.ActivityInfo
import android.content.pm.PackageManager
import android.os.Build
import androidx.annotation.IntDef
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import com.raphaelbussa.navutils.activity.ActivityBuilder
import com.raphaelbussa.navutils.activity.NavUtilsPushActivity
import com.raphaelbussa.navutils.chrome.ChromeBuilder
import com.raphaelbussa.navutils.chrome.NavUtilsPushChromeActivity
import com.raphaelbussa.navutils.fragment.FragmentBuilder
import com.raphaelbussa.navutils.fragment.NavUtilsPushFragment
import kotlin.reflect.KClass

const val NAV_ANIM = "rebus.navutils.NavUtils.NAV_ANIM"
const val NULL = -100

@DslMarker
internal annotation class NavUtilsMarker

class NavUtils {

    enum class Anim(val anim: Int) {

        SYSTEM(-1),
        NONE(0),
        HORIZONTAL_RIGHT(1),
        HORIZONTAL_LEFT(2),
        VERTICAL_BOTTOM(3),
        VERTICAL_TOP(4)

    }

    companion object {

        fun valueOfAnim(value: Int?): Anim? = Anim.values().find { it.anim == value }

        fun pushActivity(context: Context, target: KClass<*>, builder: ActivityBuilder.() -> Unit = {}): NavUtilsPushActivity {
            val innerActivity = ActivityBuilder()
            builder(innerActivity)
            return NavUtilsPushActivity(null, context, target, innerActivity)
        }

        fun pushActivity(activity: FragmentActivity, target: KClass<*>, builder: ActivityBuilder.() -> Unit = {}): NavUtilsPushActivity {
            val innerActivity = ActivityBuilder()
            builder(innerActivity)
            return NavUtilsPushActivity(null, activity, target, innerActivity)
        }

        fun pushActivity(fragment: Fragment, target: KClass<*>, builder: ActivityBuilder.() -> Unit = {}): NavUtilsPushActivity {
            val innerActivity = ActivityBuilder()
            builder(innerActivity)
            return NavUtilsPushActivity(fragment, fragment.context, target, innerActivity)
        }

        fun pushFragment(activity: FragmentActivity, target: KClass<*>, frameId: Int, builder: FragmentBuilder.() -> Unit = {}): NavUtilsPushFragment {
            val innerFragment = FragmentBuilder()
            builder(innerFragment)
            return NavUtilsPushFragment(Fragment.instantiate(activity, target.java.name), frameId, activity.supportFragmentManager, innerFragment)
        }

        fun pushFragment(fragment: Fragment, target: KClass<*>, frameId: Int, builder: FragmentBuilder.() -> Unit = {}): NavUtilsPushFragment {
            val innerFragment = FragmentBuilder()
            builder(innerFragment)
            return NavUtilsPushFragment(Fragment.instantiate(fragment.context, target.java.name), frameId, fragment.fragmentManager, innerFragment)
        }

        fun pushChromeCustomTab(context: Context, builder: ChromeBuilder.() -> Unit = {}): NavUtilsPushChromeActivity {
            val innerChrome = ChromeBuilder(context)
            builder(innerChrome)
            return NavUtilsPushChromeActivity(innerChrome)
        }

        fun pushChromeCustomTab(activity: FragmentActivity, builder: ChromeBuilder.() -> Unit = {}): NavUtilsPushChromeActivity {
            val innerChrome = ChromeBuilder(activity)
            builder(innerChrome)
            return NavUtilsPushChromeActivity(innerChrome)
        }

        fun pushChromeCustomTab(fragment: Fragment, builder: ChromeBuilder.() -> Unit = {}): NavUtilsPushChromeActivity {
            val innerChrome = ChromeBuilder(fragment.requireContext())
            builder(innerChrome)
            return NavUtilsPushChromeActivity(innerChrome)
        }

    }

}

fun FragmentActivity.pushActivity(target: KClass<*>, builder: ActivityBuilder.() -> Unit = {}): NavUtilsPushActivity {
    return NavUtils.pushActivity(this, target, builder)
}

fun Fragment.pushActivity(target: KClass<*>, builder: ActivityBuilder.() -> Unit = {}): NavUtilsPushActivity {
    return NavUtils.pushActivity(this, target, builder)
}

fun FragmentActivity.pushFragment(target: KClass<*>, frameId: Int, builder: FragmentBuilder.() -> Unit = {}): NavUtilsPushFragment {
    return NavUtils.pushFragment(this, target, frameId, builder)
}

fun Fragment.pushFragment(target: KClass<*>, frameId: Int, builder: FragmentBuilder.() -> Unit = {}): NavUtilsPushFragment {
    return NavUtils.pushFragment(this, target, frameId, builder)
}

fun FragmentActivity.pushChromeCustomTab(builder: ChromeBuilder.() -> Unit = {}): NavUtilsPushChromeActivity {
    return NavUtils.pushChromeCustomTab(this, builder)
}

fun Fragment.pushChromeCustomTab(builder: ChromeBuilder.() -> Unit = {}): NavUtilsPushChromeActivity {
    return NavUtils.pushChromeCustomTab(this, builder)
}

internal fun isLollipop(): Boolean {
    return Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP
}

internal fun isChromeInstalled(context: Context): Boolean {
    val packageManager = context.packageManager
    return try {
        packageManager.getPackageInfo("com.android.chrome", PackageManager.GET_ACTIVITIES)
        true
    } catch (e: PackageManager.NameNotFoundException) {
        false
    }
}

@IntDef(NULL,
        ActivityInfo.SCREEN_ORIENTATION_BEHIND,
        ActivityInfo.SCREEN_ORIENTATION_FULL_SENSOR,
        ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE,
        ActivityInfo.SCREEN_ORIENTATION_NOSENSOR,
        ActivityInfo.SCREEN_ORIENTATION_PORTRAIT,
        ActivityInfo.SCREEN_ORIENTATION_REVERSE_LANDSCAPE,
        ActivityInfo.SCREEN_ORIENTATION_REVERSE_PORTRAIT,
        ActivityInfo.SCREEN_ORIENTATION_SENSOR,
        ActivityInfo.SCREEN_ORIENTATION_SENSOR_LANDSCAPE,
        ActivityInfo.SCREEN_ORIENTATION_SENSOR_PORTRAIT,
        ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED,
        ActivityInfo.SCREEN_ORIENTATION_USER
)
@Retention(AnnotationRetention.SOURCE)
internal annotation class Orientation
