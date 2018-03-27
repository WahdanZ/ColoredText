package com.wahdan.coloredtext

import android.os.Build
import android.text.Html
import android.widget.Button
import android.widget.TextView
/**
 * Created by ahmedwahdan
 */

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
private const val htmlColor = "<font color=\"%s\">%s</font> "
        /**
         * Add new space Between the two string before and after 'with'
         */
     infix fun String.with(s: String): String {
        return "$this&nbsp;$s"
    }

        /**
         * Add new tap space Between the two string before and after 'with'
         */
    infix fun String.withTap(s: String): String {
        return "$this&nbsp;&nbsp;&nbsp;$s"
    }
        /**
         * insert new line
         */
      infix fun String.withNewLine(s: String): String {
        return "$this<br>$s"
    }
    /**
        * colored text with custom color pass by method parameter @code
     */
fun String.coloredWithCode(code: String): String {
    return htmlColor.format(code, this)

}
        /**
         * colored text with yellow color
         */
     val String.yellowColor: String
        get() {
            return htmlColor.format("#FFFF00", this)
        }
        /**
         * colored text with red color
         */
      val String.redColor: String
        get() {
            return htmlColor.format("#FF0000", this)
        }
        /**
         * colored text with green color
         */
    val String.greenColor: String
        get() {
            return htmlColor.format("#008000", this)
        }
        /**
         * colored text with blue color
         */
    val String.blueColor: String
        get() {
            return htmlColor.format("#0000FF", this)
        }
        /**
         * colored text with gray color
         */
    val String.grayColor: String
        get() {
            return htmlColor.format("#808080", this)
        }
        /**
         * colored text with black color
         */
    val String.blackColor: String
        get() {
            return htmlColor.format("#000000", this)
        }
        /**
         * colored text with white color
         */
    val String.whiteColor: String
        get() {
            return htmlColor.format("#FFFFFF", this)
        }
        /**
         * colored text with lime color
         */
    val String.limeColor: String
        get() {
            return htmlColor.format("#00FF00", this)
        }
    /**
     * colored text with aqua color
     */
    val String.aquaColor: String
        get() {
            return htmlColor.format("#00FFFF", this)
        }
    /**
     * colored text with olive color
     */
    val String.oliveColor: String
        get() {
            return htmlColor.format("808000", this)
        }
    /**
     * colored text with purple color
     */
    val String.purpleColor: String
        get() {
            return htmlColor.format("#800080", this)
        }
    /**
     * colored text with fuchsia color
     */
    val String.fuchsiaColor: String
        get() {
            return htmlColor.format("#FF00FF", this)
        }
    /**
     * colored text with fuchsia maroonColor
     */
    val String.maroonColor: String
        get() {
            return htmlColor.format("#800000", this)
        }
    /**
     * colored text with fuchsia silverColor
     */
    val String.silverColor: String
        get() {
            return htmlColor.format("#C0C0C0", this)
        }
    /**
     * add under line to text
     */
    val String.withUnderLine: String
        get() {
            return "<u>$this</u>"
        }
    /**
     * make text bold
     */
     val String.bold: String
        get() {
            return "<b>$this</b>"
        }
    /**
     * Defines deleted text
     */
     val String.delete: String
        get() {
            return "<del>$this</del>"
        }
     val String.italic: String
        get() {
            return "<i>$this</i>"
        }
    /**
     * Defines subscripted text
     */
     val String.sub: String
        get() {
            return "<sub>$this</sub>"
        }
    /*
    * Defines superscripted text
     */
     val String.sup: String
        get() {
            return "<sup>$this</sup>"
        }

    val String.link:String
        get() {
            return "<a href=$this>$this</a>"
        }


