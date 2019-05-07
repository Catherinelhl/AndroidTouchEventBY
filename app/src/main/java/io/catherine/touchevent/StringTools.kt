package io.catherine.touchevent

/*
+--------------+---------------------------------
+ author       +   Catherine Liu
+--------------+---------------------------------
+ since        +   2019-05-06 14:32
+--------------+---------------------------------
+ projectName  +   AndroidTouchEventBY
+--------------+---------------------------------
+ packageName  +   io.catherine.touchevent
+--------------+---------------------------------
+ description  +  
+--------------+---------------------------------
+ version      +  
+--------------+---------------------------------
*/

object StringTools {

    /**
     * ACTION_DOWN 0
     * ACTION_UP 1
     * ACTION_MOVE 2
     * ACTION_CANCEL 3
     */
    fun getActionNameBy(action: Int): String {
        return when (action) {
            0 -> "ACTION_DOWN"
            1 -> "ACTION_UP"
            2 -> "ACTION_MOVE"
            3 -> "ACTION_CANCEL"
            5 -> "ACTION_POINTER_DOWN"
            6 -> "ACTION_POINTER_UP"
            else -> action.toString()
        }
    }
}