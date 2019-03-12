package rebus.navutils.sample

import android.content.pm.ActivityInfo
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import rebus.navutils.NavUtils
import rebus.navutils.activity.BaseActivity
import rebus.navutils.pushActivity
import rebus.navutils.pushChromeCustomTab

class MainActivity : BaseActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTitle("NavUtils Utils")
        setSubtitle("MainActivity")
        setIcon(R.mipmap.ic_launcher)
        setFinishOnNavigationOnClickListener()
        setStatusBarColorRes(R.color.colorAccent)
        setLightStatusBar()
        horizontalRight.setOnClickListener(this)
        horizontalLeft.setOnClickListener(this)
        verticalBottom.setOnClickListener(this)
        verticalTop.setOnClickListener(this)
        none.setOnClickListener(this)
        system.setOnClickListener(this)
        chrome.setOnClickListener(this)
        sceneTransition.setOnClickListener(this)
    }

    override fun setLayoutResource() = R.layout.activity_main

    override fun setRequestedOrientation() = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT

    override fun onClick(v: View) {
        when (v.id) {
            R.id.horizontalRight -> {
                pushActivity(ResultActivity::class) {
                    animationType(NavUtils.Anim.HORIZONTAL_RIGHT)
                }.commit()
            }
            R.id.horizontalLeft -> {
                pushActivity(ResultActivity::class) {
                    animationType(NavUtils.Anim.HORIZONTAL_LEFT)
                }.commit()
            }
            R.id.verticalBottom -> {
                pushActivity(ResultActivity::class) {
                    animationType(NavUtils.Anim.VERTICAL_BOTTOM)
                }.commit()
            }
            R.id.verticalTop -> {
                pushActivity(ResultActivity::class) {
                    animationType(NavUtils.Anim.VERTICAL_TOP)
                }.commit()
            }
            R.id.none -> {
                pushActivity(ResultActivity::class) {
                    animationType(NavUtils.Anim.NONE)
                }.commit()
            }
            R.id.system -> {
                pushActivity(ResultActivity::class) {
                    animationType(NavUtils.Anim.SYSTEM)
                }.commit()
            }
            R.id.chrome -> {
                pushChromeCustomTab {
                    animationType(NavUtils.Anim.VERTICAL_BOTTOM)
                }.load("https://github.com/raphaelbussa/NavUtils")
            }
            R.id.sceneTransition -> {
                pushActivity(SceneTransitionActivity::class) {
                    animationType(NavUtils.Anim.SYSTEM)
                }.commit()
            }
        }
    }

}
