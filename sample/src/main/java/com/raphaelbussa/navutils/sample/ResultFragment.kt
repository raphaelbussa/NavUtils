package com.raphaelbussa.navutils.sample

import android.os.Bundle
import android.view.View
import com.raphaelbussa.navutils.NavUtils
import com.raphaelbussa.navutils.fragment.BaseFragment
import com.raphaelbussa.navutils.pushFragment
import kotlinx.android.synthetic.main.fragment_result.*

class ResultFragment : BaseFragment(), View.OnClickListener {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        newFragment.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        val animationType: NavUtils.Anim = NavUtils.valueOfAnim(arguments?.getInt("PARENT_ANIM"))
                ?: NavUtils.Anim.SYSTEM
        when (v.id) {
            R.id.newFragment -> {
                pushFragment(ResultFragment::class, R.id.container) {
                    animationType(animationType)
                    arguments(arguments ?: Bundle.EMPTY)
                }.replace()
            }
        }
    }

    override fun setLayoutResource() = R.layout.fragment_result

}
