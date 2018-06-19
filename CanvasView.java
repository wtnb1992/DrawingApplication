package com.example.repens.drawingapplication;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.jar.Attributes;

import static android.graphics.Color.BLACK;
import static android.graphics.Color.RED;

public class CanvasView extends View {
/*
//    private final ArrayList<Path> pathList;
//    private final Paint paint;

    private ArrayList<Path> pathList;
    private Paint paint;
    private Path mypath;
    int i;
    int n = 1;
    int t=1;



    /*    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

    }
*//*
public CanvasView(Context context){
    super(context);

    //初期化
    pathList = new ArrayList<Path>();
    i = BLACK;

    paint = new Paint();
    paint.setColor(i);
//    paint.setColor(Color.BLACK);
    paint.setAntiAlias(true);
    paint.setColor(i);
    paint.setStyle(Paint.Style.STROKE);
    paint.setStrokeWidth(10);
    paint.setStrokeCap(Paint.Cap.ROUND);
    paint.setStrokeJoin(Paint.Join.ROUND);


/*    paint.setStyle(Paint.Style.STROKE);
    paint.setAntiAlias(true);
    paint.setStrokeWidth(10);*//*
}

public CanvasView(Context context, AttributeSet attrs){
    super(context,attrs);

    //初期化
    pathList = new ArrayList<Path>();
    i = BLACK;

    paint = new Paint();
/*    paint.setColor(BLACK);
    paint.setStyle(Paint.Style.STROKE);
    paint.setAntiAlias(true);
    paint.setStrokeWidth(10);
*//*
    paint.setAntiAlias(true);
    paint.setColor(i);
    paint.setStyle(Paint.Style.STROKE);
    paint.setStrokeWidth(10);
    paint.setStrokeCap(Paint.Cap.ROUND);
    paint.setStrokeJoin(Paint.Join.ROUND);


}*/


//    @Override
//    protected void onDraw(Canvas canvas){
//        for(Path path : pathList){
//            canvas.drawPath(path,paint);
//        }
//        invalidate();
/*        for (int z = 0; z < pathList.size(); z++ ){
            Path pt =pathList.get(z);
            canvas.drawPath(pt,paint);
        }
        if(mypath != null){
            canvas.drawPath(mypath,paint);
        }
    }

    private Path drawingPath;
private float pos_x,pos_y;

@Override
    public boolean onTouchEvent(MotionEvent event){
    switch(event.getAction()){
        case MotionEvent.ACTION_DOWN:
/*            drawingPath = new Path();
            drawingPath.moveTo(event.getX(),event.getY());
            pathList.add(drawingPath);
*//*
            pos_x = event.getX();
            pos_y = event.getY();
            mypath = new Path();
            mypath.moveTo(pos_x, pos_y);

            invalidate();
            break;
        case MotionEvent.ACTION_UP:
//            drawingPath.moveTo(event.getX(),event.getY());

            mypath.moveTo(event.getX(), event.getY());
            pathList.add(mypath);



            invalidate();
            break;
        case  MotionEvent.ACTION_MOVE:*/
//            drawingPath.lineTo(event.getX(),event.getY());
//            drawingPath.close();
/*
            pos_x += event.getX();
            pos_y += event.getY();
            mypath.lineTo(pos_x, pos_y);



            invalidate();
            break;
    }
    return true;     //返却は必ずtrue*/
  /*      if (event.getAction() == MotionEvent.ACTION_DOWN) {
            pos_x = event.getX();
            pos_y = event.getY();
            mypath = new Path();
            mypath.moveTo(pos_x, pos_y);
        }
        if (event.getAction() == MotionEvent.ACTION_MOVE) {
            pos_x += event.getX();
            pos_y += event.getY();
            mypath.lineTo(pos_x, pos_y);
            invalidate();
        }
        if (event.getAction() == MotionEvent.ACTION_UP) {
            mypath.moveTo(event.getX(), event.getY());
            pathList.add(mypath);
            invalidate();
        }
        return true;

*/

//}
/*
public void allDelete(){
    pathList.clear();  //リストが保持しているPathを削除
    invalidate();
}


public void colorChange(){

//    pathList = new ArrayList<Path>();

/*    paint = new Paint();
    paint.setColor(Color.RED);
    paint.setStyle(Paint.Style.STROKE);
    paint.setAntiAlias(true);
    paint.setStrokeWidth(10);
*/
//    drawingPath.reset();

//    paint = new Paint();
/*    if(i==BLACK) {
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
}*/



/*

    int i = BLACK;
    private Paint  paint;

    private Canvas canvas;
    private Bitmap bitmap;
    private Path  path;

        public CanvasView(Context context) {
        super(context);

        path = new Path();
               paint.setColor(i);
        paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(10);
    }

    @Override
    protected void onDraw(Canvas canvas) {
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

//    public void setColor(int color){
 //       paint.setColor(color);
 //   }




    public void allDelete(){
//        canvas.clear();  //リストが保持しているPathを削除

    }

    public void colorChange(){

//    pathList = new ArrayList<Path>();

//    drawingPath.reset();
i=RED;
//    paint = new Paint();
    paint.setColor(i);


}*/


    private Canvas canvas;
    private Bitmap bitmap;
    private Paint paint;
    private Path path;
    int i;
    int n=1;
    int t;

    public CanvasView(Context context, AttributeSet attrs){
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
        if(n==1){

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
        }}else{
            Bitmap bmp = BitmapFactory.decodeResource(getResources(),R.drawable.image);
            canvas.drawBitmap(bmp,x,y,paint);
            invalidate();

        }
        return true;
    }



    public void allDelete(){
//        pathList.clear();  //リストが保持しているPathを削除
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
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
//            t=0;
            n=0;
        }else{
//            t=1;
            n=1;
        }

    }

    public void hozon(){
        Bitmap image = Bitmap.createBitmap(640,480, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(image);
        try{
            FileOutputStream fos = new FileOutputStream(new File("sample.png"));
            image.compress(Bitmap.CompressFormat.PNG,100,fos);
            fos.close();

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }



    }





}





