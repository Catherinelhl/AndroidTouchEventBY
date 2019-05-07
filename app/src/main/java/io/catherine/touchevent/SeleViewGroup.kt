package io.catherine.touchevent

import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import android.widget.LinearLayout

/*
+--------------+---------------------------------
+ author       +   Catherine Liu
+--------------+---------------------------------
+ since        +   2019-05-06 14:25
+--------------+---------------------------------
+ projectName  +   AndroidTouchEventBY
+--------------+---------------------------------
+ packageName  +   io.catherine.touchevent
+--------------+---------------------------------
+ description  +  自定义一个ViewGroup的派生类
+--------------+---------------------------------
+ version      +  
+--------------+---------------------------------
*/

class SeleViewGroup(context: Context?, attrs: AttributeSet?) : LinearLayout(context, attrs) {

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        println("SeleViewGroup onTouchEvent...${StringTools.getActionNameBy(event!!.action)}")
        return super.onTouchEvent(event)
    }

    override fun dispatchTouchEvent(event: MotionEvent?): Boolean {
        println("SeleViewGroup dispatchTouchEvent ...${StringTools.getActionNameBy(event!!.action)}")
        return super.dispatchTouchEvent(event)
    }

    override fun onInterceptTouchEvent(event: MotionEvent?): Boolean {
        println("SeleViewGroup onInterceptTouchEvent ...${StringTools.getActionNameBy(event!!.action)}")
        return super.onInterceptTouchEvent(event)
    }
}