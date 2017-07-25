package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.support.v4.text.TextUtilsCompat;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {
    String[] strs = {"Froyo","GB","ICS","JB","KitKat","L","M"};
    float[] xPoint = {546,530,530,350,200,100,400};

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        Path path = new Path();
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.WHITE);
        paint.setStrokeWidth(2);
        paint.setColor(Color.WHITE);
        path.moveTo(100,50);
        path.lineTo(100,550);
        path.lineTo(1050,550);
        canvas.drawPath(path,paint);
        paint.setStyle(Paint.Style.FILL);
        for(int i =0 ;i < xPoint.length;i++){
            if(i>0){
                paint.setColor(Color.GREEN);
            }
            canvas.drawRect(120+120*i,xPoint[i],120+120*i+100,550,paint);
        }

        paint.setColor(Color.WHITE);
        paint.setTextSize(50);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawText("直方图",450,700,paint);
        paint.setTextSize(30);
        for(int i =0;i<strs.length;i++){
            canvas.drawText(strs[i],120+120*i+getGap(strs[i]),580,paint);
        }

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
    }

    public float getGap(String str){
        if(TextUtils.isEmpty(str))
            return 0;
        return (100-str.length()*15)/2;
    }
}
