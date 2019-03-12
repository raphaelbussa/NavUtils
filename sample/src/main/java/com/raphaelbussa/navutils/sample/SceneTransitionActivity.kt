package com.raphaelbussa.navutils.sample

import android.os.Bundle
import com.raphaelbussa.navutils.NavUtils
import com.raphaelbussa.navutils.activity.BaseActivity
import com.raphaelbussa.navutils.pushActivity
import kotlinx.android.synthetic.main.activity_scene_transition.*

class SceneTransitionActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        result.setOnClickListener {
            pushActivity(ResultSceneTransitionActivity::class) {
                animationType(NavUtils.Anim.HORIZONTAL_RIGHT)
                sceneTransition(testImage)
            }.commit()
        }
    }

    override fun setLayoutResource() = R.layout.activity_scene_transition

}
