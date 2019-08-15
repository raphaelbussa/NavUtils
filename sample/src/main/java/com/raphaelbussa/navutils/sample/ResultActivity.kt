package com.raphaelbussa.navutils.sample

import android.os.Bundle
import com.raphaelbussa.navutils.NavUtils
import com.raphaelbussa.navutils.activity.BaseActivity
import com.raphaelbussa.navutils.pushFragment

class ResultActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTitle("NavUtils Utils")
        setNavigationIcon(R.drawable.ic_back)
        setFinishOnNavigationOnClickListener()
        val bundle = Bundle()
        bundle.putInt("PARENT_ANIM", animationType.anim)
        when (animationType) {
            NavUtils.Anim.HORIZONTAL_RIGHT -> {
                pushFragment(ResultFragment::class) {
                    animationType(animationType)
                    noEnterAnimations(true)
                    arguments(bundle)
                }.replace(R.id.container)
                setSubtitle("ResultActivity NavUtils.Anim.HORIZONTAL_RIGHT")
            }
            NavUtils.Anim.HORIZONTAL_LEFT -> {
                pushFragment(ResultFragment::class) {
                    animationType(animationType)
                    noEnterAnimations(true)
                    arguments(bundle)
                }.replace(R.id.container)
                setSubtitle("ResultActivity NavUtils.Anim.HORIZONTAL_LEFT")
            }
            NavUtils.Anim.VERTICAL_BOTTOM -> {
                pushFragment(ResultFragment::class) {
                    animationType(animationType)
                    noEnterAnimations(true)
                    arguments(bundle)
                }.replace(R.id.container)
                setSubtitle("ResultActivity NavUtils.Anim.VERTICAL_BOTTOM")
            }
            NavUtils.Anim.VERTICAL_TOP -> {
                pushFragment(ResultFragment::class) {
                    animationType(animationType)
                    noEnterAnimations(true)
                    arguments(bundle)
                }.replace(R.id.container)
                setSubtitle("ResultActivity NavUtils.Anim.VERTICAL_TOP")
            }
            NavUtils.Anim.NONE -> {
                pushFragment(ResultFragment::class) {
                    animationType(animationType)
                    noEnterAnimations(true)
                    arguments(bundle)
                }.replace(R.id.container)
                setSubtitle("ResultActivity NavUtils.Anim.NONE")
            }
            NavUtils.Anim.SYSTEM -> {
                pushFragment(ResultFragment::class) {
                    animationType(animationType)
                    noEnterAnimations(true)
                    arguments(bundle)
                }.replace(R.id.container)
                setSubtitle("ResultActivity NavUtils.Anim.SYSTEM")
            }
        }
    }

    override fun setLayoutResource() = R.layout.activity_result

}
