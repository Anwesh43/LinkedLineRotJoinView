package com.anwesh.uiprojects.linkedlinerotjoinview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.linerotjoinview.LineRotJoinView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        LineRotJoinView.create(this)
    }
}
