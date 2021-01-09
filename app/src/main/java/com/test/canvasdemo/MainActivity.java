package com.test.canvasdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;

public class MainActivity extends Activity {

    CanvasView canvasView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main);

        canvasView=new CanvasView(this);
        canvasView.setBackgroundColor(Color.WHITE);
        setContentView(canvasView);
    }
}
