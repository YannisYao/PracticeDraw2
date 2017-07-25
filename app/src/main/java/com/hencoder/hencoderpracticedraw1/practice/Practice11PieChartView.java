package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint  = new Paint();
        paint.setStyle(Paint.Style.FILL); // 填充模式
        paint.setColor(Color.rgb(244,67,54));
        canvas.drawArc(180, 80, 680, 580, -180, 120, true, paint);

        paint.setColor(Color.rgb(255,193,7));
        canvas.drawArc(200, 100, 700, 600, -60, 58, true, paint); //
        paint.setColor(Color.rgb(156,39,176));
        canvas.drawArc(200, 100, 700, 600, 0, 8, true, paint); //

        paint.setColor(Color.rgb(158,158,158));
        canvas.drawArc(200, 100, 700, 600, 10, 8, true, paint); //
        paint.setColor(Color.rgb(0,150,136));
        canvas.drawArc(200, 100, 700, 600, 20, 56, true, paint); //

        paint.setColor(Color.rgb(33,150,243));
        canvas.drawArc(200, 100, 700, 600, 80, 100, true, paint); //
        paint.setTextSize(50);
        paint.setColor(Color.WHITE);
        canvas.drawText("饼图",400,700,paint);

        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(2);
        Path path = new Path();
        path.moveTo(130,100);
        path.lineTo(250,100);
        path.rLineTo(29,29);
        canvas.drawPath(path,paint);
        paint.setTextSize(30);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawText("Lollipop",15,100,paint);

        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(2);
        path.moveTo(820,200);
        path.lineTo(700,200);
        path.rLineTo(-30,30);
        canvas.drawPath(path,paint);
        paint.setTextSize(30);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawText("Marshmallow",830,200,paint);

        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(2);
        path.moveTo(820,200);
        path.lineTo(700,200);
        path.rLineTo(-30,30);
        canvas.drawPath(path,paint);
        paint.setTextSize(30);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawText("Marshmallow",830,200,paint);

        /**
         * 后续代码省略
         */


//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图
    }
}
