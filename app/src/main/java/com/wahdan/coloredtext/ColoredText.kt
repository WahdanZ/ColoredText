package com.wahdan.coloredtext

import android.os.Build
import android.text.Html
import android.widget.Button
import android.widget.TextView

private const val htmlColor = "<font color=\"%s\">%s</font> "

     infix fun String.with(s: String): String {
        return "$this&nbsp;$s"
    }


    infix fun String.withTap(s: String): String {
        return "$this&nbsp;&nbsp;&nbsp;$s"
    }

      infix fun String.withNewLine(s: String): String {
        return "$this<br>$s"
    }


       var TextView.coloredText: String
        get() {
            return this.text.toString()
        }
        set(s) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                this.text = Html.fromHtml(s, Html.FROM_HTML_MODE_LEGACY)
            } else {
                @Suppress("DEPRECATION")

                this.text = Html.fromHtml(s)
            }
        }
      var Button.coloredText: String
        get() {
            return this.text.toString()
        }
        set(s) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                this.text = Html.fromHtml(s, Html.FROM_HTML_MODE_LEGACY)
            } else {
                @Suppress("DEPRECATION")
                this.text = Html.fromHtml(s)
            }
        }

     val String.yellowColor: String
        get() {
            return htmlColor.format("#FFFF00", this)
        }
      val String.redColor: String
        get() {
            return htmlColor.format("#FF0000", this)
        }
    val String.greenColor: String
        get() {
            return htmlColor.format("#008000", this)
        }
    val String.blueColor: String
        get() {
            return htmlColor.format("#0000FF", this)
        }
    val String.grayColor: String
        get() {
            return htmlColor.format("#808080", this)
        }
    val String.blackColor: String
        get() {
            return htmlColor.format("#000000", this)
        }
    val String.whiteColor: String
        get() {
            return htmlColor.format("#FFFFFF", this)
        }
    val String.limeColor: String
        get() {
            return htmlColor.format("#00FF00", this)
        }
    val String.aquaColor: String
        get() {
            return htmlColor.format("#00FFFF", this)
        }
    val String.oliveColor: String
        get() {
            return htmlColor.format("808000", this)
        }
    val String.purpleColor: String
        get() {
            return htmlColor.format("#800080", this)
        }
    val String.fuchsiaColor: String
        get() {
            return htmlColor.format("#FF00FF", this)
        }
    val String.maroonColor: String
        get() {
            return htmlColor.format("#800000", this)
        }
    val String.silverColor: String
        get() {
            return htmlColor.format("#C0C0C0", this)
        }

    val String.withUnderLine: String
        get() {
            return "<u>$this</u>"
        }
     val String.bold: String
        get() {
            return "<b>$this</b>"
        }
     val String.delete: String
        get() {
            return "<del>$this</del>"
        }
     val String.italic: String
        get() {
            return "<i>$this</i>"
        }

     val String.sub: String
        get() {
            return "<sub>$this</sub>"
        }
     val String.sup: String
        get() {
            return "<sup>$this</sup>"
        }
     val String.newLine: String
        get() {
            return "<br/>"
        }
    val String.link:String
        get() {
            return "<a href=$this>$this</a>"
        }

    fun String.coloredWithCode(code: String): String {
        return htmlColor.format(code, this)

    }
