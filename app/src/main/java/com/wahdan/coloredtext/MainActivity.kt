package com.wahdan.coloredtext

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.wahdan.coloredtextview.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView_helloWorld.coloredText = "Hello Red".redColor with "Hello Yellow".yellowColor with
                "Hello Green".greenColor.bold withNewLine
                "10".redColor + "9".yellowColor.sup with
                "https://stackoverflow.com".link with
                "My Custom Color".coloredWithCode("#FFFFE0") with
                "With UnderLine".blueColor.limeColor.bold

    }
}


