package com.example.repens.drawingapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class DrawActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceStarte){
        super.onCreate(savedInstanceStarte);
        setContentView(R.layout.activity_canvas);
//        setContentView(new DrView(this));


/*        final CanvasView cv = (CanvasView) findViewById(R.id.canvas_view);


        Button bt = (Button) findViewById(R.id.clear_button);
        Button bt2 = (Button) findViewById(R.id.hozon);
        Button bt3 = (Button) findViewById(R.id.color);
        Button bt4 = (Button) findViewById(R.id.stamp);

        switch (cv.getId()){
            case R.id.clear_button:
                bt.setOnClickListener(new View.OnClickListener() {
                    @Override

                    public void onClick(View view) {
                        cv.allDelete();
                    }
                });

                break;
        }

*/



    }


    public void onClick(View view){
        final CanvasView cv = (CanvasView) findViewById(R.id.canvas_view);
        switch (view.getId()){
            case R.id.clear_button:
                cv.allDelete();
                break;
            case R.id.hozon:
                cv.hozon();
                break;
            case R.id.color:
                cv.colorChange();
                break;
            case R.id.stamp:
                cv.stampChange();
                break;



        }


/*        Button bt = (Button) findViewById(R.id.clear_button);
        Button bt2 = (Button) findViewById(R.id.hozon);
        Button bt3 = (Button) findViewById(R.id.color);
        Button bt4 = (Button) findViewById(R.id.stamp);
*/

    }




}
