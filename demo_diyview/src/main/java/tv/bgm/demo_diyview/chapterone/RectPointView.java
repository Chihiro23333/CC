package tv.bgm.demo_diyview.chapterone;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

public class RectPointView extends View {

    private Paint mPaint;
    private Rect mRect;
    private int x;
    private int y;

    public RectPointView(Context context) {
        super(context);
        init();
    }

    public RectPointView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        mPaint = new Paint();
        mPaint.setColor(Color.RED);
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setStrokeWidth(20);
        mRect = new Rect(100, 100, 300, 400);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if(mRect.contains(x,y)){
            mPaint.setColor(Color.RED);
        }else {
            mPaint.setColor(Color.GREEN);
        }
        canvas.drawRect(mRect, mPaint);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        x = (int) event.getX();
        y = (int) event.getY();
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                invalidate();
               return true;

            case MotionEvent.ACTION_UP:
                x = -1;
                y = -1;
                invalidate();
                break;

                default:
        }
        return super.onTouchEvent(event);
    }
}
