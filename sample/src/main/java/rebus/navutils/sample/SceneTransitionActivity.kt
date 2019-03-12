package rebus.navutils.sample

import android.os.Bundle
import kotlinx.android.synthetic.main.activity_scene_transition.*
import rebus.navutils.NavUtils

import rebus.navutils.activity.BaseActivity
import rebus.navutils.pushActivity

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
