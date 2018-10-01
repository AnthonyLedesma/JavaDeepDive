package com.app.aledesma.fadinganimations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    public void fade(View view){


        ImageView imageViewBart = (ImageView) findViewById(R.id.imageView2);
        //ImageView imageViewHomer = (ImageView) findViewById(R.id.imageView3);
        String out = String.valueOf(imageViewBart.getAlpha());



        if (imageViewBart.getAlpha() == 0.0){
            //imageViewBart.animate().scaleX(1f).scaleY(1f).translationXBy(2000).alpha(1).rotation(-1800).setDuration(3000);
            imageViewBart.animate().scaleX(1f).scaleY(1f).translationXBy(-1000).alpha(1).rotation(-1800).setDuration(3000);
        } else {
            imageViewBart.animate().scaleX(0.5f).scaleY(0.5f).alpha(0).translationXBy(1000).rotation(1800).setDuration(3000);
        }
//        translationXBy(-2000).

        // Animation displays a downward translation of the image.
        //imageViewBart.animate().translationYBy(2000).setDuration(2000);

        // Animation displays a left translation of the image.
        //imageViewBart.animate().translationXBy(-2000).setDuration(2000);

        //Image rotation.
        //imageViewBart.animate().rotation(1800).setDuration(2000);





        //If statment looking for alpha value. This will change from visible to invisible with each click.
//        if(imageViewBart.getAlpha() == 1.0){
//            imageViewBart.animate().alpha(0).setDuration(2000);
//            imageViewHomer.animate().alpha(1).setDuration(2000);
//        } else {
//            imageViewBart.animate().alpha(1).setDuration(2000);
//            imageViewHomer.animate().alpha(0).setDuration(2000);
//        }
        Log.i("Info", out);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageViewBart = (ImageView) findViewById(R.id.imageView2);
        imageViewBart.setX(-1000);
        imageViewBart.animate().translationXBy(1000).alpha(1).setDuration(3000);
    }
}
