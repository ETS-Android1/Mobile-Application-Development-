package com.example.keyboardsimulation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

    String text;
    TextView textInput;
    Button q,w,e,r,t,y,u,i,o,p,a,s,d,f,g,h,j,k,l,z,x,c,v,b,n,m,caps,comma,dot,bs,space,enter,num;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        textInput = findViewById(R.id.textInput);
        q = findViewById(R.id.q);
        w = findViewById(R.id.w);
        e = findViewById(R.id.e);
        r = findViewById(R.id.r);
        t = findViewById(R.id.t);
        y = findViewById(R.id.y);
        u = findViewById(R.id.u);
        i = findViewById(R.id.i);
        o = findViewById(R.id.o);
        p = findViewById(R.id.p);
        a = findViewById(R.id.a);
        s = findViewById(R.id.s);
        d = findViewById(R.id.d);
        f = findViewById(R.id.f);
        g = findViewById(R.id.g);
        h = findViewById(R.id.h);
        j = findViewById(R.id.j);
        k = findViewById(R.id.k);
        l = findViewById(R.id.l);
        z = findViewById(R.id.z);
        x = findViewById(R.id.x);
        c = findViewById(R.id.c);
        v = findViewById(R.id.v);
        b = findViewById(R.id.b);
        n = findViewById(R.id.n);
        m = findViewById(R.id.m);
        comma = findViewById(R.id.comma);
        dot = findViewById(R.id.dot);
        bs = findViewById(R.id.bs);
        space = findViewById(R.id.space);
        caps = findViewById(R.id.caps);
        num = findViewById(R.id.num);
        enter = findViewById(R.id.enter);

        text = getIntent().getStringExtra("TextInput");
        textInput.setText(text);

        caps.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity4.this,MainActivity.class);
            intent.putExtra("TextInput",text);
            startActivity(intent);
        });

        num.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity4.this,MainActivity3.class);
            intent.putExtra("TextInput",text);
            startActivity(intent);
        });

        q.setOnClickListener(view -> {
            text = textInput.getText().toString();
            text = text+"Q";
            textInput.setText(text);
        });
        w.setOnClickListener(view -> {
            text = textInput.getText().toString();
            text = text+"W";
            textInput.setText(text);
        });
        e.setOnClickListener(view -> {
            text = textInput.getText().toString();
            text = text+"E";
            textInput.setText(text);
        });
        r.setOnClickListener(view -> {
            text = textInput.getText().toString();
            text = text+"R";
            textInput.setText(text);
        });
        t.setOnClickListener(view -> {
            text = textInput.getText().toString();
            text = text+"T";
            textInput.setText(text);
        });
        y.setOnClickListener(view -> {
            text = textInput.getText().toString();
            text = text+"Y";
            textInput.setText(text);
        });
        u.setOnClickListener(view -> {
            text = textInput.getText().toString();
            text = text+"U";
            textInput.setText(text);
        });
        i.setOnClickListener(view -> {
            text = textInput.getText().toString();
            text = text+"I";
            textInput.setText(text);
        });
        o.setOnClickListener(view -> {
            text = textInput.getText().toString();
            text = text+"O";
            textInput.setText(text);
        });
        p.setOnClickListener(view -> {
            text = textInput.getText().toString();
            text = text+"P";
            textInput.setText(text);
        });
        a.setOnClickListener(view -> {
            text = textInput.getText().toString();
            text = text+"A";
            textInput.setText(text);
        });
        s.setOnClickListener(view -> {
            text = textInput.getText().toString();
            text = text+"S";
            textInput.setText(text);
        });
        d.setOnClickListener(view -> {
            text = textInput.getText().toString();
            text = text+"D";
            textInput.setText(text);
        });
        f.setOnClickListener(view -> {
            text = textInput.getText().toString();
            text = text+"F";
            textInput.setText(text);
        });
        g.setOnClickListener(view -> {
            text = textInput.getText().toString();
            text = text+"G";
            textInput.setText(text);
        });
        h.setOnClickListener(view -> {
            text = textInput.getText().toString();
            text = text+"H";
            textInput.setText(text);
        });
        j.setOnClickListener(view -> {
            text = textInput.getText().toString();
            text = text+"J";
            textInput.setText(text);
        });
        k.setOnClickListener(view -> {
            text = textInput.getText().toString();
            text = text+"K";
            textInput.setText(text);
        });

        l.setOnClickListener(view -> {
            text = textInput.getText().toString();
            text = text+"L";
            textInput.setText(text);
        });
        z.setOnClickListener(view -> {
            text = textInput.getText().toString();
            text = text+"Z";
            textInput.setText(text);
        });
        x.setOnClickListener(view -> {
            text = textInput.getText().toString();
            text = text+"X";
            textInput.setText(text);
        });
        c.setOnClickListener(view -> {
            text = textInput.getText().toString();
            text = text+"C";
            textInput.setText(text);
        });
        v.setOnClickListener(view -> {
            text = textInput.getText().toString();
            text = text+"V";
            textInput.setText(text);
        });
        b.setOnClickListener(view -> {
            text = textInput.getText().toString();
            text = text+"B";
            textInput.setText(text);
        });
        n.setOnClickListener(view -> {
            text = textInput.getText().toString();
            text = text+"N";
            textInput.setText(text);
        });
        m.setOnClickListener(view -> {
            text = textInput.getText().toString();
            text = text+"M";
            textInput.setText(text);
        });
        dot.setOnClickListener(view -> {
            text = textInput.getText().toString();
            text = text+".";
            textInput.setText(text);
        });
        comma.setOnClickListener(view -> {
            text = textInput.getText().toString();
            text = text+",";
            textInput.setText(text);
        });
        space.setOnClickListener(view -> {
            text = textInput.getText().toString();
            text = text+" ";
            textInput.setText(text);
        });
        bs.setOnClickListener(view -> {
            text = textInput.getText().toString();
            if(text.length()>1)
                textInput.setText(text.substring(0,text.length()-1));
            else
                textInput.setText("");
        });
        enter.setOnClickListener(view -> {
            text = textInput.getText().toString();
            text = text+"\n";
            textInput.setText(text);
        });
    }
}
