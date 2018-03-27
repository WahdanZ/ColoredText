# ColoredText

Extension Functions Help You To Color your text easily 
you can include this file in your project 
https://github.com/WahdanZ/ColoredText/blob/master/app/src/main/java/com/wahdan/coloredtext/ColoredText.kt

<img src="https://github.com/WahdanZ/ColoredText/blob/master/Screenshot.png" width="400" height="790">



Before : Using Java
```java
    TextView tv = (TextView)findViewById(R.id.textView_helloWorld);
    Spannable wordtoSpan = new SpannableString("Hello Red Hello Yellow Hello Green 10 9 https://stackoverflow.com".link
    My Custom Color With UnderLine");        
    wordtoSpan.setSpan(new ForegroundColorSpan(Color.RED), 0, 7, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
    wordtoSpan.setSpan(new ForegroundColorSpan(Color.RED), 8, 19, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
    .
    .
    .
    .
    .
    tv.setText(wordtoSpan);
```

    
After : Using Kotlin

```kotlin    
    textView_helloWorld.coloredText =
       "Hello Red".redColor with   "Hello Yellow".yellowColor with
        "Hello Green".greenColor.bold withNewLine
        "10".redColor + "9".yellowColor.sup with
        "https://stackoverflow.com".link with
        "My Custom Color".coloredWithCode("#FFFFE0") with
        "With UnderLine".blueColor.limeColor.bold
```

 
