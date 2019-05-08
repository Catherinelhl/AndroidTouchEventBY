package io.catherine.touchevent.base

import com.tencent.tinker.loader.app.TinkerApplication

/*
+--------------+---------------------------------
+ author       +   Catherine Liu
+--------------+---------------------------------
+ since        +   2019-05-08 17:21
+--------------+---------------------------------
+ projectName  +   AndroidTouchEventBY
+--------------+---------------------------------
+ packageName  +   io.catherine.touchevent.base
+--------------+---------------------------------
+ description  +  
+--------------+---------------------------------
+ version      +  
+--------------+---------------------------------
*/

class BaseApplication : TinkerApplication {
    constructor():super(7, "io.catherine.touchevent.base.SampleApplicationLike", "com.tencent.tinker.loader.TinkerLoader", false){

    }
}