package com.mufc.umbtts;



import android.app.Activity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.Button;
import android.graphics.Color;
import android.widget.EditText;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout myLayout = new RelativeLayout(this);
        Button myButton = new Button(this);
        EditText username = new EditText(this);

        myLayout.setBackgroundColor(Color.GREEN);
        myButton.setText("idi ebise");

        RelativeLayout.LayoutParams buttonDetails=
                new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                        RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        RelativeLayout.LayoutParams editDetails=
                new RelativeLayout.LayoutParams(
                        RelativeLayout.LayoutParams.WRAP_CONTENT,
                        RelativeLayout.LayoutParams.WRAP_CONTENT
                );

        editDetails.setMargins(0,0,0,50);
        editDetails.addRule(RelativeLayout.ABOVE,myButton.getId());
        editDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        buttonDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        buttonDetails.addRule(RelativeLayout.CENTER_VERTICAL);
        myLayout.addView(myButton,buttonDetails);
        setContentView(myLayout);
myLayout.addView(username,editDetails);

    }
}
