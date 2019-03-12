package com.raphaelbussa.navutils.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.annotation.AnimRes
import androidx.core.app.ActivityCompat
import androidx.core.app.ActivityOptionsCompat
import androidx.core.util.Pair
import androidx.fragment.app.Fragment
import com.raphaelbussa.navutils.*
import kotlin.reflect.KClass

@NavUtilsMarker
class ActivityBuilder {

    internal var animationType: NavUtils.Anim = NavUtils.Anim.SYSTEM
        private set
    internal var clearStack: Boolean = false
        private set
    internal var arguments: Bundle? = null
        private set
    internal var customAnimation: Boolean = false
        private set
    internal var enterResId: Int = 0
        private set
    internal var exitResId: Int = 0
        private set
    internal var sceneTransition: Pair<View?, String>? = null
        private set

    /**
     * animationType
     * @param animationType NavUtils.Anim
     */
    fun animationType(animationType: NavUtils.Anim) {
        this.animationType = animationType
    }

    /**
     * clearStack
     * @param clearStack Boolean
     */
    fun clearStack(clearStack: Boolean) {
        this.clearStack = clearStack
    }

    /**
     * arguments
     * @param arguments Bundle
     */
    fun arguments(arguments: Bundle) {
        this.arguments = arguments
    }

    /**
     * customAnimation
     * @param enterResId Int
     * @param exitResId Int
     */
    fun customAnimation(@AnimRes enterResId: Int, @AnimRes exitResId: Int) {
        this.customAnimation = true
        this.enterResId = enterResId
        this.exitResId = exitResId
    }

    /**
     * sceneTransition
     * @param sceneTransition Pair<View?, String>
     */
    fun sceneTransition(sceneTransition: Pair<View?, String>) {
        if (isLollipop()) {
            this.sceneTransition = sceneTransition
        }
    }

    /**
     * sceneTransition
     * @param sharedElement View?
     * @param sharedElementName String
     */
    fun sceneTransition(sharedElement: View?, sharedElementName: String) {
        if (isLollipop()) {
            this.sceneTransition = Pair(sharedElement, sharedElementName)
        }
    }

    /**
     * sceneTransition
     * @param sharedElement View?
     */
    fun sceneTransition(sharedElement: View?) {
        if (isLollipop()) {
            this.sceneTransition = Pair(sharedElement, sharedElement?.transitionName)
        }
    }

}

class NavUtilsPushActivity(
        private val fragment: Fragment? = null,
        private val context: Context?,
        private val target: KClass<*>,
        private val activity: ActivityBuilder
) {

    /**
     * commit
     * @param requestCode Int
     */
    fun commit(requestCode: Int = -1) {
        if (fragment != null) {
            commitNewActivity(
                    context = fragment.context,
                    intent = Intent(fragment.context, target.java),
                    requestCode = requestCode
            )
        } else {
            commitNewActivity(
                    context = context,
                    intent = Intent(context, target.java),
                    requestCode = requestCode
            )
        }
    }

    /**
     * commitNewActivity
     * @param context Context?
     * @param fragment Fragment?
     * @param intent Intent
     * @param requestCode Int
     */
    private fun commitNewActivity(context: Context?, fragment: Fragment? = null, intent: Intent, requestCode: Int) {
        if (context == null) return
        if (activity.clearStack) {
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
        }
        var options: Bundle?
        options = if (activity.customAnimation) {
            ActivityOptionsCompat.makeCustomAnimation(context, activity.enterResId, activity.exitResId).toBundle()
        } else {
            when (activity.animationType) {
                NavUtils.Anim.HORIZONTAL_RIGHT -> ActivityOptionsCompat.makeCustomAnimation(context, R.anim.horizontal_right_start_enter, R.anim.horizontal_right_start_exit).toBundle()
                NavUtils.Anim.HORIZONTAL_LEFT -> ActivityOptionsCompat.makeCustomAnimation(context, R.anim.horizontal_left_start_enter, R.anim.horizontal_left_start_exit).toBundle()
                NavUtils.Anim.VERTICAL_BOTTOM -> ActivityOptionsCompat.makeCustomAnimation(context, R.anim.vertical_bottom_start_enter, R.anim.fade_out).toBundle()
                NavUtils.Anim.VERTICAL_TOP -> ActivityOptionsCompat.makeCustomAnimation(context, R.anim.vertical_top_start_enter, R.anim.fade_out).toBundle()
                NavUtils.Anim.NONE -> ActivityOptionsCompat.makeCustomAnimation(context, 0, 0).toBundle()
                NavUtils.Anim.SYSTEM -> Bundle.EMPTY
            }
        }

        if (activity.arguments != null) intent.putExtras(activity.arguments ?: Bundle.EMPTY)
        intent.putExtra(NAV_ANIM, activity.animationType.anim)

        if (isLollipop()) {
            if (activity.sceneTransition != null) {
                options = when {
                    fragment != null -> ActivityOptionsCompat.makeSceneTransitionAnimation(fragment.activity!!, activity.sceneTransition).toBundle()
                    context is android.app.Activity -> ActivityOptionsCompat.makeSceneTransitionAnimation(context, activity.sceneTransition).toBundle()
                    else -> throw RuntimeException("sceneTransition can called only from an activity or activity context")
                }
            }
        }

        if (requestCode == -1) {
            ActivityCompat.startActivity(context, intent, options)
        } else {
            when {
                fragment != null -> fragment.startActivityForResult(intent, requestCode, options)
                context is android.app.Activity -> ActivityCompat.startActivityForResult(context, intent, requestCode, options)
                else -> throw RuntimeException("startForResult can called only from an activity, or a fragment")
            }
        }
    }

}