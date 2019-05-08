package io.catherine.touchevent.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.MotionEvent
import io.catherine.touchevent.R
import io.catherine.touchevent.tool.StringTools
import kotlinx.android.synthetic.main.activity_main.*

/*
+--------------+---------------------------------
+ author       +   Catherine Liu
+--------------+---------------------------------
+ since        +   2019-05-06 10:59
+--------------+---------------------------------
+ projectName  +   AndroidTouchEventBY
+--------------+---------------------------------
+ packageName  +   io.catherine.touchevent
+--------------+---------------------------------
+ description  +   用于测试Activity/ViewGroup/View等视图的TouchEvent从ActionDown 到ActionUp的过程
+--------------+---------------------------------
+ version      +
+--------------+---------------------------------
*/


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
        initListener()
    }

    private fun initView() {

    }

    private fun initListener() {
        v.setOnClickListener { println(" v onClick...") }
        v.setOnTouchListener { v, event ->
            super.onTouchEvent(event)
            println(" v onTouch...")
            false
        }

//        tv.setOnClickListener { println(" tv onClick...") }
        tv.setOnTouchListener { v, event ->
            super.onTouchEvent(event)
            println(" tv onTouch...")
            false
        }
    }


    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        println("activity onKeyDown...${StringTools.getActionNameBy(event!!.action)}")
        return super.onKeyDown(keyCode, event)
    }

    override fun onKeyUp(keyCode: Int, event: KeyEvent?): Boolean {
        println("activity onKeyUp...${StringTools.getActionNameBy(event!!.action)}")
        return super.onKeyUp(keyCode, event)
    }


    /**
     * ACTION_DOWN 0
     * ACTION_UP 1
     * ACTION_MOVE 2
     * ACTION_CANCEL 3
     */
    override fun onTouchEvent(event: MotionEvent?): Boolean {
        println("activity onTouchEvent...${StringTools.getActionNameBy(event!!.action)}")
        return super.onTouchEvent(event)
    }

    /**
     * Activity的DispatchTouchEvent
     */
    override fun dispatchTouchEvent(event: MotionEvent?): Boolean {
        println("activity dispatchTouchEvent...${StringTools.getActionNameBy(
            event!!.action
        )}")
        return super.dispatchTouchEvent(event)
    }

}
