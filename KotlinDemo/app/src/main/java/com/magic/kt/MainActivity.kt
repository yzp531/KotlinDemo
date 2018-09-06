package com.magic.kt

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        test.setOnClickListener(this);
    }

    override fun onClick(p0: View?) {
        Toast.makeText(this@MainActivity,R.string.app_name,Toast.LENGTH_LONG).show();
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
