package com.chenglei.dynamic1

import android.content.Context
import android.util.Log
import com.chenglei.common.initWmRouter
import com.sankuai.waimai.router.generated.service.ServiceInit_f85f56829031e8fd0f53b29a8f18cbf7

/**
 * @author chenglei01
 * @date 2024/1/20
 * @time 22:51
 */
class Dynamic1App {
    fun initApp(context:Context) {
        // 在dynamic feature module里面，需要自己调用一下wmrouter的注册
        // initwmRouter里面有反射调用wmrouter注册，但是gradle plugin生成的类名是同一个，只能反射到一个
        // 应该根据当前模块的包名去生成 ServiceLoaderInit
        ServiceInit_f85f56829031e8fd0f53b29a8f18cbf7.init()
//        initWmRouter()
    }
}