package com.example.movingbanner;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;
public class MainActivity extends AppCompatActivity {
 private TextView banner, coord, counter_text;
 int _counter;
 private Button counter;
 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_main);
 banner = (TextView) findViewById(R.id.banner);
 counter_text = (TextView) findViewById(R.id.counter);
 coord = (TextView) findViewById(R.id.coord);
 counter = (Button) findViewById(R.id.button);
 _counter=0;
 counter.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View v) {
 _counter++;
 if(_counter%2==0)
 {
 counter_text.setText("OFF");
 }
 else{
 counter_text.setText("ON");
 }
 }});
 new Thread(new Runnable() {
 public void run() {
 int i = 0;
 while (i < 100) {
 try {
 Thread.sleep(100);
 } catch (InterruptedException e) {
 e.printStackTrace();
 }
 runOnUiThread(new Runnable() {
 @Override
public void run() {
 banner.animate().translationXBy(20f);
 coord.animate().translationXBy(20f);
 Random random = new Random(); int color =
Color.argb(255, random.nextInt(256), random.nextInt(256),
random.nextInt(256));
 banner.setTextColor(color);
int[] location = new int[2];
 banner.getLocationOnScreen(location);
coord.setText("(X, Y) : (" + location[0] + ", "
+ location[1] + ")");
 }
 });
 }
 }
 }).start();
 }
}
