package com.app.aledesma.fadinganimations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void fade(View view){
        Log.i("Info","Image View tapped");

        ImageView imageView = (ImageView) findViewById(R.id.imageView2);
        imageView.animate().alpha(0).setDuration(2000);

        ImageView imageView2 = (ImageView) findViewById(R.id.imageView3);
        imageView2.animate().alpha(1).setDuration(2000);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
