package io.catherine.touchevent

import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import android.widget.TextView

/*
+--------------+---------------------------------
+ author       +   Catherine Liu
+--------------+---------------------------------
+ since        +   2019-05-06 14:23
+--------------+---------------------------------
+ projectName  +   AndroidTouchEventBY
+--------------+---------------------------------
+ packageName  +   io.catherine.touchevent
+--------------+---------------------------------
+ description  +   自定义一个View的派生类
+--------------+---------------------------------
+ version      +  
+--------------+---------------------------------
*/

class SelfTextView(context: Context?, attrs: AttributeSet?) : TextView(context, attrs) {

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        println("SelfTextView onTouchEvent...${StringTools.getActionNameBy(event!!.action)}")
        return super.onTouchEvent(event)
    }

    override fun dispatchTouchEvent(event: MotionEvent?): Boolean {
        println("SelfTextView dispatchTouchEvent ...${StringTools.getActionNameBy(event!!.action)}")
        return super.dispatchTouchEvent(event)
    }
}