# ColoredText

Extension Functions Help You To Color your text easily 
you can include this file in your project 
https://github.com/WahdanZ/ColoredText/blob/master/app/src/main/java/com/wahdan/coloredtext/ColoredText.kt

<img src="https://github.com/WahdanZ/ColoredText/blob/master/Screenshot.png" width="400" height="790">



Before :
          TextView tv = (TextView)findViewById(R.id.tv);

    Spannable wordtoSpan = new SpannableString("I know just how to whisper, And I know just how to cry,I know just where to find the answers");        
    wordtoSpan.setSpan(new ForegroundColorSpan(Color.BLUE), 15, 30, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
    wordtoSpan.setSpan(new ForegroundColorSpan(Color.RED), 5, 10, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
    tv.setText(wordtoSpan);
    
After :

               
    textView_helloWorld.coloredText =
       "Hello Red".redColor with   "Hello Yellow".yellowColor with
        "Hello Green".greenColor.bold withNewLine
        "10".redColor + "9".yellowColor.sup with
        "https://stackoverflow.com".link with
        "My Custom Color".coloredWithCode("#FFFFE0") with
        "With UnderLine".blueColor.limeColor.bold
                
 
