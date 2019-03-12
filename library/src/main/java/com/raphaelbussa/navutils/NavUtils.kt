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

/**
 * NavUtils
 */
class NavUtils {

    /**
     * Anim
     * @property anim Int
     * @constructor
     */
    enum class Anim(val anim: Int) {

        SYSTEM(-1),
        NONE(0),
        HORIZONTAL_RIGHT(1),
        HORIZONTAL_LEFT(2),
        VERTICAL_BOTTOM(3),
        VERTICAL_TOP(4)

    }

    companion object {

        /**
         * valueOfAnim
         * @param value Int?
         * @return Anim?
         */
        fun valueOfAnim(value: Int?): Anim? = Anim.values().find { it.anim == value }

        /**
         * pushActivity
         * @param context Context
         * @param target KClass<*>
         * @param builder ActivityBuilder.() -> Unit
         * @return NavUtilsPushActivity
         */
        fun pushActivity(context: Context, target: KClass<*>, builder: ActivityBuilder.() -> Unit = {}): NavUtilsPushActivity {
            val innerActivity = ActivityBuilder()
            builder(innerActivity)
            return NavUtilsPushActivity(null, context, target, innerActivity)
        }

        /**
         * pushActivity
         * @param activity FragmentActivity
         * @param target KClass<*>
         * @param builder ActivityBuilder.() -> Unit
         * @return NavUtilsPushActivity
         */
        fun pushActivity(activity: FragmentActivity, target: KClass<*>, builder: ActivityBuilder.() -> Unit = {}): NavUtilsPushActivity {
            val innerActivity = ActivityBuilder()
            builder(innerActivity)
            return NavUtilsPushActivity(null, activity, target, innerActivity)
        }

        /**
         * pushActivity
         * @param fragment Fragment
         * @param target KClass<*>
         * @param builder ActivityBuilder.() -> Unit
         * @return NavUtilsPushActivity
         */
        fun pushActivity(fragment: Fragment, target: KClass<*>, builder: ActivityBuilder.() -> Unit = {}): NavUtilsPushActivity {
            val innerActivity = ActivityBuilder()
            builder(innerActivity)
            return NavUtilsPushActivity(fragment, fragment.context, target, innerActivity)
        }

        /**
         * pushFragment
         * @param activity FragmentActivity
         * @param target KClass<*>
         * @param frameId Int
         * @param builder FragmentBuilder.() -> Unit
         * @return NavUtilsPushFragment
         */
        fun pushFragment(activity: FragmentActivity, target: KClass<*>, frameId: Int, builder: FragmentBuilder.() -> Unit = {}): NavUtilsPushFragment {
            val innerFragment = FragmentBuilder()
            builder(innerFragment)
            return NavUtilsPushFragment(Fragment.instantiate(activity, target.java.name), frameId, activity.supportFragmentManager, innerFragment)
        }

        /**
         * pushFragment
         * @param fragment Fragment
         * @param target KClass<*>
         * @param frameId Int
         * @param builder FragmentBuilder.() -> Unit
         * @return NavUtilsPushFragment
         */
        fun pushFragment(fragment: Fragment, target: KClass<*>, frameId: Int, builder: FragmentBuilder.() -> Unit = {}): NavUtilsPushFragment {
            val innerFragment = FragmentBuilder()
            builder(innerFragment)
            return NavUtilsPushFragment(Fragment.instantiate(fragment.context, target.java.name), frameId, fragment.fragmentManager, innerFragment)
        }

        /**
         * pushChromeCustomTab
         * @param context Context
         * @param builder ChromeBuilder.() -> Unit
         * @return NavUtilsPushChromeActivity
         */
        fun pushChromeCustomTab(context: Context, builder: ChromeBuilder.() -> Unit = {}): NavUtilsPushChromeActivity {
            val innerChrome = ChromeBuilder(context)
            builder(innerChrome)
            return NavUtilsPushChromeActivity(innerChrome)
        }

        /**
         * pushChromeCustomTab
         * @param activity FragmentActivity
         * @param builder ChromeBuilder.() -> Unit
         * @return NavUtilsPushChromeActivity
         */
        fun pushChromeCustomTab(activity: FragmentActivity, builder: ChromeBuilder.() -> Unit = {}): NavUtilsPushChromeActivity {
            val innerChrome = ChromeBuilder(activity)
            builder(innerChrome)
            return NavUtilsPushChromeActivity(innerChrome)
        }

        /**
         * pushChromeCustomTab
         * @param fragment Fragment
         * @param builder ChromeBuilder.() -> Unit
         * @return NavUtilsPushChromeActivity
         */
        fun pushChromeCustomTab(fragment: Fragment, builder: ChromeBuilder.() -> Unit = {}): NavUtilsPushChromeActivity {
            val innerChrome = ChromeBuilder(fragment.requireContext())
            builder(innerChrome)
            return NavUtilsPushChromeActivity(innerChrome)
        }

    }

}

/**
 * pushActivity
 * @receiver FragmentActivity
 * @param target KClass<*>
 * @param builder ActivityBuilder.() -> Unit
 * @return NavUtilsPushActivity
 */
fun FragmentActivity.pushActivity(target: KClass<*>, builder: ActivityBuilder.() -> Unit = {}): NavUtilsPushActivity {
    return NavUtils.pushActivity(this, target, builder)
}

/**
 * pushActivity
 * @receiver Fragment
 * @param target KClass<*>
 * @param builder ActivityBuilder.() -> Unit
 * @return NavUtilsPushActivity
 */
fun Fragment.pushActivity(target: KClass<*>, builder: ActivityBuilder.() -> Unit = {}): NavUtilsPushActivity {
    return NavUtils.pushActivity(this, target, builder)
}

/**
 * pushFragment
 * @receiver FragmentActivity
 * @param target KClass<*>
 * @param frameId Int
 * @param builder FragmentBuilder.() -> Unit
 * @return NavUtilsPushFragment
 */
fun FragmentActivity.pushFragment(target: KClass<*>, frameId: Int, builder: FragmentBuilder.() -> Unit = {}): NavUtilsPushFragment {
    return NavUtils.pushFragment(this, target, frameId, builder)
}

/**
 * pushFragment
 * @receiver Fragment
 * @param target KClass<*>
 * @param frameId Int
 * @param builder FragmentBuilder.() -> Unit
 * @return NavUtilsPushFragment
 */
fun Fragment.pushFragment(target: KClass<*>, frameId: Int, builder: FragmentBuilder.() -> Unit = {}): NavUtilsPushFragment {
    return NavUtils.pushFragment(this, target, frameId, builder)
}

/**
 * pushChromeCustomTab
 * @receiver FragmentActivity
 * @param builder ChromeBuilder.() -> Unit
 * @return NavUtilsPushChromeActivity
 */
fun FragmentActivity.pushChromeCustomTab(builder: ChromeBuilder.() -> Unit = {}): NavUtilsPushChromeActivity {
    return NavUtils.pushChromeCustomTab(this, builder)
}

/**
 * pushChromeCustomTab
 * @receiver Fragment
 * @param builder ChromeBuilder.() -> Unit
 * @return NavUtilsPushChromeActivity
 */
fun Fragment.pushChromeCustomTab(builder: ChromeBuilder.() -> Unit = {}): NavUtilsPushChromeActivity {
    return NavUtils.pushChromeCustomTab(this, builder)
}

/**
 * isLollipop
 * @return Boolean
 */
internal fun isLollipop(): Boolean {
    return Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP
}

/**
 * isChromeInstalled
 * @param context Context
 * @return Boolean
 */
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
