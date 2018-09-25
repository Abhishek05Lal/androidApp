package com.codepath.hello_abhishek;

import android.support.v4.text.TextUtilsCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.TextureView;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) findViewById(R.id.textView)).setTextColor(getResources().getColor(R.color.black));

            }
        });
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findViewById(R.id.rootview).setBackgroundColor(getResources().getColor(R.color.lime));

            }
        });
        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // grab the text the user inputted
                String newText=((EditText) findViewById(R.id.editText)).getText().toString();
                if(TextUtils.isEmpty(newText)) {
                    ((TextView) findViewById(R.id.textView)).setText("Awesome Android");
                }
                    else {
                    ((TextView) findViewById(R.id.textView)).setText(newText);
                }
            }
        });
        findViewById(R.id.rootview).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 //reset the text color back to holo_red_dark
                ((TextView) findViewById(R.id.textView)).setTextColor(getResources().getColor(R.color.holo_red_dark));
                //reset the background color back to colorPrimary
                findViewById(R.id.rootview).setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                //reset the text back to 'Hello From Abhishek!'
                ((TextView) findViewById(R.id.textView)).setText("Hello From Abhishek!");
            }
        });

    }
}
