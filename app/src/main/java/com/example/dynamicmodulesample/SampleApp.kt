package com.example.dynamicmodulesample

import android.app.Application
import com.sankuai.waimai.router.Router
import com.sankuai.waimai.router.common.DefaultRootUriHandler
import com.sankuai.waimai.router.core.Debugger

/**
 * @author chenglei01
 * @date 2024/1/20
 * @time 21:24
 */
class SampleApp:Application() {
    override fun onCreate() {
        super.onCreate()
        val rootHandler = DefaultRootUriHandler(this)
        Router.init(rootHandler)
        Debugger.setEnableDebug(true)
        Debugger.setEnableLog(true)

        kotlin.runCatching {
            listOf<String>("com.chenglei.dynamic1.Dynamic1App", "com.chenglei.dynamic2.Dynamic2App")
                .forEach {
                    val clazz = Class.forName(it)
                    val instance = clazz.constructors[0].newInstance()
                    clazz.declaredMethods.find { it.name == "initApp" }?.apply {
                        isAccessible = true
                    }?.invoke(instance, this)
                }
        }
    }
}