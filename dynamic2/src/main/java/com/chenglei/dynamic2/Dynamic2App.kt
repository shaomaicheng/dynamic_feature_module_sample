package com.chenglei.dynamic2

import android.content.Context
import android.util.Log
import com.chenglei.common.initWmRouter
import com.sankuai.waimai.router.generated.service.ServiceInit_1cf9098d7460b65ae22e0db09843d8c6

/**
 * @author chenglei01
 * @date 2024/1/21
 * @time 18:44
 */
class Dynamic2App {
    fun initApp(context: Context) {
        ServiceInit_1cf9098d7460b65ae22e0db09843d8c6.init()
//        initWmRouter()
    }
}