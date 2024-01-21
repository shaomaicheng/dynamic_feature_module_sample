package com.chenglei.dynamic1

import com.squareup.moshi.JsonClass

/**
 * @author chenglei01
 * @date 2024/1/20
 * @time 22:24
 */
@JsonClass(generateAdapter = true)
data class Page(
    val name:String
)