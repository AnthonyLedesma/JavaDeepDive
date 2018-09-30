package com.app.aledesma.fadinganimations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void fade(View view){


        ImageView imageViewBart = (ImageView) findViewById(R.id.imageView2);
        ImageView imageViewHomer = (ImageView) findViewById(R.id.imageView3);
        String out = String.valueOf(imageViewBart.getAlpha());

        if(imageViewBart.getAlpha() == 1.0){
            imageViewBart.animate().alpha(0).setDuration(2000);
            imageViewHomer.animate().alpha(1).setDuration(2000);
        } else {
            imageViewBart.animate().alpha(1).setDuration(2000);
            imageViewHomer.animate().alpha(0).setDuration(2000);
        }
        Log.i("Info", out);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
