package com.chenglei.dynamic2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sankuai.waimai.router.annotation.RouterUri

/**
 * @author chenglei01
 * @date 2024/1/20
 * @time 17:02
 */
@RouterUri(
    scheme = "sample",
    host = "cl",
    path = ["/dynamic2"],
    exported = true
)
class Dynamic2Activity :AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_dynamic2_activity)
    }
}