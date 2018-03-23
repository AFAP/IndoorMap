package com.afap.indoormap;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by atom on 2018/3/23.
 */

public class MapView extends View {


    public MapView(Context context) {
        super(context);
    }

    public MapView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MapView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    private Paint mPaint = new Paint();

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        // 设置最基本的属性
        // 设置画笔颜色
        // 可直接引入Color类，如Color.red等
        mPaint.setColor(Color.RED);
        // 设置画笔模式
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeWidth(2);
        canvas.drawRect(200, 200, 800, 800, mPaint);

        mPaint.setColor(Color.BLUE);

        canvas.drawRect(250, 150, 850, 750, mPaint);


    }
}
