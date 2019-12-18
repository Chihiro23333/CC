package tv.bgm.demo_diyview.chapterone;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

public class SpiderView extends View {

    private Paint linePaint;
    private Paint pointPaint;
    private Paint fillPaint;
    private float radius;
    private float centerX;
    private int centerY;
    private int squreCount = 6;

    public SpiderView(Context context) {
        super(context);
        init();
    }

    public SpiderView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        linePaint = new Paint();
        linePaint.setColor(Color.RED);
        linePaint.setStyle(Paint.Style.STROKE);
        linePaint.setStrokeWidth(5);

        fillPaint = new Paint();
        fillPaint.setColor(Color.argb(125,125,125,125));
        fillPaint.setStyle(Paint.Style.FILL);

        pointPaint = new Paint();
        pointPaint.setColor(Color.GREEN);
        pointPaint.setStrokeWidth(20);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        radius = (int) (Math.min(w, h) / 2 * 0.9f);
        centerX = w / 2;
        centerY = h / 2;
        super.onSizeChanged(w, h, oldw, oldh);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawSqure(canvas);

        drawLine(canvas);

        drawFill(canvas);
    }

    private void drawFill(Canvas canvas) {
        float[] points = {1, 3, 1, 6, 2, 4};
        Path path = new Path();
        float coner = (float) (2 * Math.PI / squreCount);
        for (int j = 0; j < squreCount; j++) {
            float percent = points[j]/squreCount;
            if (j == 0) {
                path.moveTo(centerX + radius * percent, centerY);
            } else {
                float x = (float) (centerX + radius * Math.cos(coner * j) * percent);
                float y = (float) (centerY + radius * Math.sin(coner * j) * percent);
                path.lineTo(x, y);
            }
        }
        path.close();
        canvas.drawPath(path, fillPaint);
    }

    private void drawLine(Canvas canvas) {
        float coner = (float) (2 * Math.PI / squreCount);
        for (int i = 0; i < squreCount; i++) {
            float x = (float) (centerX + radius * Math.cos(coner * i));
            float y = (float) (centerY + radius * Math.sin(coner * i));
            canvas.drawLine(centerX, centerY, x, y, linePaint);
        }
    }

    private void drawSqure(Canvas canvas) {
        canvas.drawPoint(centerX, centerY, pointPaint);
        Path path = new Path();
        float coner = (float) (2 * Math.PI / squreCount);
        float r = radius / squreCount;
        for (int i = 1; i <= squreCount; i++) {
            float curR = r * i;
            path.reset();
            for (int j = 0; j < squreCount; j++) {
                if (j == 0) {
                    path.moveTo(centerX + curR, centerY);
                    canvas.drawPoint(centerX + curR, centerY, pointPaint);
                } else {
                    float x = (float) (centerX + curR * Math.cos(coner * j));
                    float y = (float) (centerY + curR * Math.sin(coner * j));
                    path.lineTo(x, y);
                    canvas.drawPoint(x, y, pointPaint);
                }
            }
            path.close();
            canvas.drawPath(path, linePaint);
        }
    }
}
