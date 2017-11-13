package com.swallow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*final View view = findViewById(R.id.view);
        final TextView tv = (TextView) findViewById(R.id.tv);
        ViewTreeObserver vto = view.getViewTreeObserver();

        vto.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {

            @Override
            public void onGlobalLayout() {
                view.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                int height = view.getHeight();
                int width = view.getWidth();

                tv.setText("高度：" + height + ";宽度：" + width);
            }
        });*/
    }
}
