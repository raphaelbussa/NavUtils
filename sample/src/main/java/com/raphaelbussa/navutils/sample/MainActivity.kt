package com.raphaelbussa.navutils.sample

import android.content.pm.ActivityInfo
import android.graphics.BitmapFactory
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.core.content.ContextCompat
import com.raphaelbussa.navutils.NavUtils
import com.raphaelbussa.navutils.activity.BaseActivity
import com.raphaelbussa.navutils.pushActivity
import com.raphaelbussa.navutils.pushChromeCustomTab
import kotlinx.android.synthetic.main.activity_main.*

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
        fab.setOnClickListener(this)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        pushActivity(SceneTransitionActivity::class) {
            clipRevealTransition(item?.actionView)
        }.commit()
        return super.onOptionsItemSelected(item)
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
                    showTitle(true)
                    animationType(NavUtils.Anim.HORIZONTAL_RIGHT)
                    showDefaultShareMenuItem(true)
                    /*startAnimations(R.anim.popup_enter, R.anim.popup_exit)
                    exitAnimations(R.anim.popup_enter, R.anim.popup_exit)*/
                    toolbarColor(ContextCompat.getColor(activity, R.color.colorAccent))
                    closeButtonIcon(BitmapFactory.decodeResource(resources, R.drawable.ic_back))
                }.load("https://github.com/raphaelbussa/NavUtils")
            }
            R.id.sceneTransition -> {
                pushActivity(SceneTransitionActivity::class) {
                    animationType(NavUtils.Anim.SYSTEM)
                }.commit()
            }
            R.id.fab -> {
                pushActivity(SceneTransitionActivity::class) {
                    clipRevealTransition(v)
                }.commit()
            }
        }
    }

}
