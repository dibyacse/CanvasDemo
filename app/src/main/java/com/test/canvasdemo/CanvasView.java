package com.test.canvasdemo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

import java.util.jar.Attributes;

public class CanvasView extends View {

    Paint paint=new Paint();

    private void init() {
        paint.setColor(Color.BLUE);
        paint.setStrokeWidth(1f);
        paint.setTextSize(21);

    }

    public CanvasView(Context context) {
        super(context);
        init();
    }


    @Override
    protected void onDraw(Canvas canvas) {

        //canvas.drawColor(Color.RED);

        canvas.drawLine(0,0,500,500,paint);
        //canvas.drawLine(500,0,0,500,paint);

        canvas.drawCircle(100,100,50,paint);

        canvas.drawText("Testing draw Text ",200,500,paint);

        canvas.drawRect(100,200,300,300,paint);


/*

       RectF r;
        r=new RectF(100,200,300,300);
        canvas.drawRect(r,paint);
*/




    }
}
