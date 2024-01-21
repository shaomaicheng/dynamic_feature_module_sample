package com.chenglei.dynamic1

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.sankuai.waimai.router.annotation.RouterUri

/**
 * @author chenglei01
 * @date 2024/1/20
 * @time 16:19
 */
@RouterUri(
    scheme = "sample",
    host = "cl",
    path = ["/dynamic1"],
    exported = true
)
class Dynamic1Activity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_dynamic1_activity)
    }
}