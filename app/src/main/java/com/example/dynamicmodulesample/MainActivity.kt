package com.example.dynamicmodulesample

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.sankuai.waimai.router.Router
import com.sankuai.waimai.router.core.UriRequest

class MainActivity : AppCompatActivity() {
    private val goto1 by lazy { findViewById<Button>(R.id.goto1) }
    private val goto2 by lazy { findViewById<Button>(R.id.goto2) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_activity_main)
        goto1.setOnClickListener {
            val request = UriRequest(this, "sample://cl/dynamic1")
            Router.startUri(request)
        }

        goto2.setOnClickListener {
            val request = UriRequest(this, "sample://cl/dynamic2")
            Router.startUri(request)
        }
    }
}
