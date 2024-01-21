package com.chenglei.common

import com.sankuai.waimai.router.Router
import com.sankuai.waimai.router.common.DefaultRootUriHandler
import com.sankuai.waimai.router.common.IPageAnnotationInit
import com.sankuai.waimai.router.common.IUriAnnotationInit
import com.sankuai.waimai.router.common.PageAnnotationHandler
import com.sankuai.waimai.router.common.UriAnnotationHandler
import com.sankuai.waimai.router.components.RouterComponents
import com.sankuai.waimai.router.core.Debugger
import com.sankuai.waimai.router.regex.IRegexAnnotationInit
import com.sankuai.waimai.router.regex.RegexAnnotationHandler
import com.sankuai.waimai.router.service.ServiceLoader

/**
 * @author chenglei01
 * @date 2024/1/21
 * @time 14:27
 */


fun initWmRouter() {
    try {
//        Class.forName("com.sankuai.waimai.router.generated.ServiceLoaderInit").getMethod("init")
//            .invoke(null as Any?)
        ServiceLoader::class.java.classLoader?.loadClass("com.sankuai.waimai.router.generated.ServiceLoaderInit")
            ?.getMethod("init")
            ?.invoke(null)
        Debugger.i("[ServiceLoader] init class invoked", *arrayOfNulls(0))
    } catch (var2: Exception) {
        Debugger.fatal(var2)
    }
    ServiceLoader.load(IUriAnnotationInit::class.java).getAll<IUriAnnotationInit>()
        .forEach {
            it.init(UriAnnotationHandler("sample","cl"))
        }
}