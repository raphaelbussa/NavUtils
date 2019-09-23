package com.raphaelbussa.navutils

import android.content.Context
import android.content.pm.ActivityInfo
import androidx.annotation.IntDef
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import com.raphaelbussa.navutils.activity.ActivityBuilder
import com.raphaelbussa.navutils.activity.NavUtilsPushActivity
import com.raphaelbussa.navutils.customtabs.CustomTabsBuilder
import com.raphaelbussa.navutils.customtabs.NavUtilsPushCustomTabsActivity
import com.raphaelbussa.navutils.fragment.FragmentBuilder
import com.raphaelbussa.navutils.fragment.NavUtilsPushFragment
import kotlin.reflect.KClass


const val NAV_ANIM = "com.raphaelbussa.navutils.NavUtils.NAV_ANIM"
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
        @JvmStatic
        fun valueOfAnim(value: Int?): Anim? = Anim.values().find { it.anim == value }

        /**
         * pushActivity
         * @param context Context
         * @param target KClass<*>
         * @param builder ActivityBuilder.() -> Unit
         * @return NavUtilsPushActivity
         */
        @JvmStatic
        fun pushActivity(context: Context, target: KClass<*>, builder: ActivityBuilder.() -> Unit = {}): NavUtilsPushActivity {
            val activityBuilder = ActivityBuilder()
            builder(activityBuilder)
            return NavUtilsPushActivity(null, context, target, activityBuilder)
        }

        /**
         * pushActivity
         * @param activity FragmentActivity
         * @param target KClass<*>
         * @param builder ActivityBuilder.() -> Unit
         * @return NavUtilsPushActivity
         */
        fun pushActivity(activity: FragmentActivity, target: KClass<*>, builder: ActivityBuilder.() -> Unit = {}): NavUtilsPushActivity {
            val activityBuilder = ActivityBuilder()
            builder(activityBuilder)
            return NavUtilsPushActivity(null, activity, target, activityBuilder)
        }

        /**
         * pushActivity
         * @param fragment Fragment
         * @param target KClass<*>
         * @param builder ActivityBuilder.() -> Unit
         * @return NavUtilsPushActivity
         */
        @JvmStatic
        fun pushActivity(fragment: Fragment, target: KClass<*>, builder: ActivityBuilder.() -> Unit = {}): NavUtilsPushActivity {
            val activityBuilder = ActivityBuilder()
            builder(activityBuilder)
            return NavUtilsPushActivity(fragment, fragment.context, target, activityBuilder)
        }

        /**
         * pushFragment
         * @param activity FragmentActivity
         * @param target Fragment
         * @param builder FragmentBuilder.() -> Unit
         * @return NavUtilsPushFragment
         */
        @JvmStatic
        fun pushFragment(activity: FragmentActivity, target: Fragment, builder: FragmentBuilder.() -> Unit = {}): NavUtilsPushFragment {
            val fragmentBuilder = FragmentBuilder()
            fragmentBuilder.fragmentManager(activity.supportFragmentManager)
            builder(fragmentBuilder)
            return NavUtilsPushFragment(target, fragmentBuilder)
        }

        /**
         * pushFragment
         * @param activity FragmentActivity
         * @param target KClass<*>
         * @param builder FragmentBuilder.() -> Unit
         * @return NavUtilsPushFragment
         */
        @JvmStatic
        fun pushFragment(activity: FragmentActivity, target: KClass<*>, builder: FragmentBuilder.() -> Unit = {}): NavUtilsPushFragment {
            val fragmentBuilder = FragmentBuilder()
            fragmentBuilder.fragmentManager(activity.supportFragmentManager)
            builder(fragmentBuilder)
            return NavUtilsPushFragment(fragmentBuilder.fragmentManager?.fragmentFactory?.instantiate(ClassLoader.getSystemClassLoader(), target.java.name)!!, fragmentBuilder)
        }

        /**
         * pushFragment
         * @param fragment Fragment
         * @param target Fragment
         * @param builder FragmentBuilder.() -> Unit
         * @return NavUtilsPushFragment
         */
        @JvmStatic
        fun pushFragment(fragment: Fragment, target: Fragment, builder: FragmentBuilder.() -> Unit = {}): NavUtilsPushFragment {
            val fragmentBuilder = FragmentBuilder()
            fragmentBuilder.fragmentManager(fragment.fragmentManager)
            builder(fragmentBuilder)
            return NavUtilsPushFragment(target, fragmentBuilder)
        }

        /**
         * pushFragment
         * @param fragment Fragment
         * @param target KClass<*>
         * @param builder FragmentBuilder.() -> Unit
         * @return NavUtilsPushFragment
         */
        @JvmStatic
        fun pushFragment(fragment: Fragment, target: KClass<*>, builder: FragmentBuilder.() -> Unit = {}): NavUtilsPushFragment {
            val fragmentBuilder = FragmentBuilder()
            fragmentBuilder.fragmentManager(fragment.fragmentManager)
            builder(fragmentBuilder)
            return NavUtilsPushFragment(fragmentBuilder.fragmentManager?.fragmentFactory?.instantiate(ClassLoader.getSystemClassLoader(), target.java.name)!!, fragmentBuilder)
        }

        /**
         * pushCustomTab
         * @param context Context
         * @param builder CustomTabsBuilder.() -> Unit
         * @return NavUtilsPushCustomTabsActivity
         */
        @JvmStatic
        fun pushCustomTab(context: Context, builder: CustomTabsBuilder.() -> Unit = {}): NavUtilsPushCustomTabsActivity {
            val customTabsBuilder = CustomTabsBuilder(context)
            builder(customTabsBuilder)
            return NavUtilsPushCustomTabsActivity(customTabsBuilder)
        }

        /**
         * pushCustomTab
         * @param activity FragmentActivity
         * @param builder CustomTabsBuilder.() -> Unit
         * @return NavUtilsPushCustomTabsActivity
         */
        @JvmStatic
        fun pushCustomTab(activity: FragmentActivity, builder: CustomTabsBuilder.() -> Unit = {}): NavUtilsPushCustomTabsActivity {
            val customTabsBuilder = CustomTabsBuilder(activity)
            builder(customTabsBuilder)
            return NavUtilsPushCustomTabsActivity(customTabsBuilder)
        }

        /**
         * pushCustomTab
         * @param fragment Fragment
         * @param builder CustomTabsBuilder.() -> Unit
         * @return NavUtilsPushCustomTabsActivity
         */
        @JvmStatic
        fun pushCustomTab(fragment: Fragment, builder: CustomTabsBuilder.() -> Unit = {}): NavUtilsPushCustomTabsActivity {
            val customTabsBuilder = CustomTabsBuilder(fragment.requireContext())
            builder(customTabsBuilder)
            return NavUtilsPushCustomTabsActivity(customTabsBuilder)
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
 * @param target Fragment
 * @param builder FragmentBuilder.() -> Unit
 * @return NavUtilsPushFragment
 */
fun FragmentActivity.pushFragment(target: Fragment, builder: FragmentBuilder.() -> Unit = {}): NavUtilsPushFragment {
    return NavUtils.pushFragment(this, target, builder)
}

/**
 * pushFragment
 * @receiver FragmentActivity
 * @param target KClass<*>
 * @param builder FragmentBuilder.() -> Unit
 * @return NavUtilsPushFragment
 */
fun FragmentActivity.pushFragment(target: KClass<*>, builder: FragmentBuilder.() -> Unit = {}): NavUtilsPushFragment {
    return NavUtils.pushFragment(this, target, builder)
}

/**
 * pushFragment
 * @receiver Fragment
 * @param target Fragment
 * @param builder FragmentBuilder.() -> Unit
 * @return NavUtilsPushFragment
 */
fun Fragment.pushFragment(target: Fragment, builder: FragmentBuilder.() -> Unit = {}): NavUtilsPushFragment {
    return NavUtils.pushFragment(this, target, builder)
}

/**
 * pushFragment
 * @receiver Fragment
 * @param target KClass<*>
 * @param builder FragmentBuilder.() -> Unit
 * @return NavUtilsPushFragment
 */
fun Fragment.pushFragment(target: KClass<*>, builder: FragmentBuilder.() -> Unit = {}): NavUtilsPushFragment {
    return NavUtils.pushFragment(this, target, builder)
}

/**
 * pushCustomTab
 * @receiver FragmentActivity
 * @param builder CustomTabsBuilder.() -> Unit
 * @return NavUtilsPushCustomTabsActivity
 */
fun FragmentActivity.pushCustomTab(builder: CustomTabsBuilder.() -> Unit = {}): NavUtilsPushCustomTabsActivity {
    return NavUtils.pushCustomTab(this, builder)
}

/**
 * pushCustomTab
 * @receiver Fragment
 * @param builder CustomTabsBuilder.() -> Unit
 * @return NavUtilsPushCustomTabsActivity
 */
fun Fragment.pushCustomTab(builder: CustomTabsBuilder.() -> Unit = {}): NavUtilsPushCustomTabsActivity {
    return NavUtils.pushCustomTab(this, builder)
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
