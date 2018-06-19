package com.example.repens.drawingapplication;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import static android.graphics.Color.BLACK;
import static android.graphics.Color.RED;

public class DrView extends View {

    private Canvas canvas;
    private Bitmap bitmap;
    private Paint paint;
    private Path path;
    int i;
    int n;
    int t;

    public DrView(Context context, AttributeSet attrs){
        super(context,attrs);

//    public DrView(Context context){

//        super(context);
        path = new Path();
        paint = new Paint();
        i = BLACK;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(10);
        paint.setColor(i);

    }

    @Override
    protected void onDraw(Canvas canvas){
        canvas.drawBitmap(bitmap, 0, 0, null);
        canvas.drawPath(path, paint);

    }
    @Override
    protected void onSizeChanged(
            int w, int h,
            int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        bitmap = Bitmap.createBitmap(
                w, h, Bitmap.Config.ARGB_8888);
        canvas = new Canvas(bitmap);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        float x = event.getX();
        float y = event.getY();

        switch(event.getAction()){
            case MotionEvent.ACTION_DOWN:
                path.reset();
                path.moveTo(x, y);
                invalidate();
                break;
            case MotionEvent.ACTION_MOVE:
                path.lineTo(x, y);
                invalidate();
                break;
            case MotionEvent.ACTION_UP:
                path.lineTo(x, y);
                canvas.drawPath(path, paint);
                path.reset();
                invalidate();
                break;
        }
        return true;
    }



    public void allDelete(){
//        pathList.clear();  //リストが保持しているPathを削除
        invalidate();
    }


    public void colorChange(){

        if(i==BLACK) {
            i = RED;
            paint.setColor(i);
        }else{
            i = BLACK;
            paint.setColor(i);

        }

    }

    public void stampChange(){
        if(n==1){
            t=0;
        }else{
            t=1;
        }
    }




}
