package com.example.graphicalprimitives;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.animation.AnimatorSet;
        import android.animation.ObjectAnimator;
        import android.annotation.SuppressLint;
        import android.graphics.Bitmap;
        import android.graphics.BitmapFactory;
        import android.graphics.Canvas;
        import android.graphics.Color;
        import android.graphics.Matrix;
        import android.graphics.Paint;
        import android.graphics.RectF;
        import android.graphics.drawable.AnimationDrawable;
        import android.view.animation.Animation;
        import android.view.animation.AnimationUtils;
        import android.graphics.drawable.BitmapDrawable;
        import android.graphics.drawable.Drawable;
        import android.os.Handler;
        import android.view.View;
        import android.widget.Button;
        import android.widget.ImageView;

        import java.util.EventListener;

        import static android.os.SystemClock.sleep;

public class MainActivity extends AppCompatActivity {
    ImageView im;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9;
    int clicks;

    public void reset_im() {
        im.setScaleX(1);
        im.setScaleY(1);
        im.setRotation(0);
        im.setBackgroundResource(0);
        im.setImageResource(0);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        im = (ImageView)findViewById(R.id.imageView);
        b1 = (Button)findViewById(R.id.button1);
        b2 = (Button)findViewById(R.id.button2);
        b3 = (Button)findViewById(R.id.button3);
        b4 = (Button)findViewById(R.id.button4);
        b5 = (Button)findViewById(R.id.button5);
        b6 = (Button)findViewById(R.id.button6);
        b7 = (Button)findViewById(R.id.button7);
        b8 = (Button)findViewById(R.id.button8);
        clicks = 0;
        final Paint paint = new Paint();
        paint.setColor(Color.RED);
        paint.setAntiAlias(true);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reset_im();
                Bitmap tempBitmap = Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888);
                Canvas tempCanvas = new Canvas(tempBitmap);
                tempCanvas.drawRect(25, 50, 75, 75, paint);
                im.setImageBitmap(tempBitmap);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reset_im();
                Bitmap tempBitmap = Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888);
                Canvas tempCanvas = new Canvas(tempBitmap);
                tempCanvas.drawCircle(50, 50, 20, paint);
                im.setImageBitmap(tempBitmap);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reset_im();
                Bitmap tempBitmap = Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888);
                Canvas tempCanvas = new Canvas(tempBitmap);
                tempCanvas.drawLine(0, 0, 100, 100, paint);
                im.setImageBitmap(tempBitmap);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reset_im();
                Bitmap tempBitmap = Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888);
                Canvas tempCanvas = new Canvas(tempBitmap);
                RectF a = new RectF(10, 10, 90, 90);
                tempCanvas.drawArc(a, 225, 90, true, paint);
                im.setImageBitmap(tempBitmap);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reset_im();
                im.setBackgroundResource(R.drawable.movie);
                AnimationDrawable anim = (AnimationDrawable) im.getBackground();
                anim.start();
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bitmap bitmap = Bitmap.createBitmap(300, 300,
                        Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmap);
                Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
                paint.setColor(Color.BLACK);
                canvas.drawLine(50, 150, 250, 150, paint);
                paint.setColor(Color.BLACK);
                canvas.drawLine(50, 150, 50, 200, paint);
                paint.setColor(Color.BLACK);
                canvas.drawLine(50, 200, 250, 200, paint);
                paint.setColor(Color.BLACK);
                canvas.drawLine(250, 150, 250, 200, paint);
                paint.setColor(Color.BLACK);
                canvas.drawLine(100, 150, 100, 100, paint);
                paint.setColor(Color.BLACK);
                canvas.drawLine(200, 150, 100, 150, paint);
                paint.setColor(Color.BLACK);
                canvas.drawLine(200, 100, 200, 150, paint);
                paint.setColor(Color.BLACK);
                canvas.drawLine(100, 100, 200, 100, paint);
                paint.setColor(Color.BLACK);
                canvas.drawCircle(100, 200, 20, paint);
                paint.setColor(Color.BLACK);
                canvas.drawCircle(200, 200, 20, paint);
                paint.setColor(Color.YELLOW);
                canvas.drawCircle(230, 175, 8, paint);
                im.setImageBitmap(bitmap);
                float x = im.getX();
                ObjectAnimator animCar = ObjectAnimator.ofFloat(im, "x", x + 400);
                animCar.setDuration(1000);
                AnimatorSet a = new AnimatorSet();
                a.play(animCar).before(ObjectAnimator.ofFloat(im, "x", x).setDuration(1000));
                a.start();
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reset_im();
                im.setImageResource(R.drawable.image);
                if(clicks == 0) {
                    im.setScaleX(1f);
                    im.setScaleY(1f);
                }
                else {
                    im.setRotation(180f);
                }
                clicks++;
                clicks %= 2;
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reset_im();
                im.setImageResource(R.drawable.image);
                if(clicks == 0) {
                    im.setScaleX(0.5f);
                    im.setScaleY(0.5f);
                }
                else {
                    im.setScaleX(1.05f);
                    im.setScaleY(1.05f);
                }
                clicks++;
                clicks %= 2;
            }
        });

    }
}
