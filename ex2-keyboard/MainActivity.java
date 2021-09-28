package com.example.keyboardsimulation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String text;
    TextView textInput;
    Button q,w,e,r,t,y,u,i,o,p,a,s,d,f,g,h,j,k,l,z,x,c,v,b,n,m,caps,comma,dot,bs,space,enter,num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

        q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textInput.getText().toString();
                text = text+"Q".toLowerCase();
                textInput.setText(text);
            }
        });
        w.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textInput.getText().toString();
                text = text+"W".toLowerCase();
                textInput.setText(text);
            }
        });
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textInput.getText().toString();
                text = text+"E".toLowerCase();
                textInput.setText(text);
            }
        });
        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textInput.getText().toString();
                text = text+"R".toLowerCase();
                textInput.setText(text);
            }
        });
        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textInput.getText().toString();
                text = text+"T".toLowerCase();
                textInput.setText(text);
            }
        });
        y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textInput.getText().toString();
                text = text+"Y".toLowerCase();
                textInput.setText(text);
            }
        });
        u.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textInput.getText().toString();
                text = text+"U".toLowerCase();
                textInput.setText(text);
            }
        });
        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textInput.getText().toString();
                text = text+"I".toLowerCase();
                textInput.setText(text);
            }
        });
        o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textInput.getText().toString();
                text = text+"O".toLowerCase();
                textInput.setText(text);
            }
        });
        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textInput.getText().toString();
                text = text+"P".toLowerCase();
                textInput.setText(text);
            }
        });
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textInput.getText().toString();
                text = text+"A".toLowerCase();
                textInput.setText(text);
            }
        });
        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textInput.getText().toString();
                text = text+"S".toLowerCase();
                textInput.setText(text);
            }
        });
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textInput.getText().toString();
                text = text+"D".toLowerCase();
                textInput.setText(text);
            }
        });
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textInput.getText().toString();
                text = text+"F".toLowerCase();
                textInput.setText(text);
            }
        });
        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textInput.getText().toString();
                text = text+"G".toLowerCase();
                textInput.setText(text);
            }
        });
        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textInput.getText().toString();
                text = text+"H".toLowerCase();
                textInput.setText(text);
            }
        });
        j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textInput.getText().toString();
                text = text+"J".toLowerCase();
                textInput.setText(text);
            }
        });
        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textInput.getText().toString();
                text = text+"K".toLowerCase();
                textInput.setText(text);
            }
        });
        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textInput.getText().toString();
                text = text+"L".toLowerCase();
                textInput.setText(text);
            }
        });
        z.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textInput.getText().toString();
                text = text+"Z".toLowerCase();
                textInput.setText(text);
            }
        });
        x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textInput.getText().toString();
                text = text+"X".toLowerCase();
                textInput.setText(text);
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textInput.getText().toString();
                text = text+"C".toLowerCase();
                textInput.setText(text);
            }
        });
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textInput.getText().toString();
                text = text+"V".toLowerCase();
                textInput.setText(text);
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textInput.getText().toString();
                text = text+"B".toLowerCase();
                textInput.setText(text);
            }
        });
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textInput.getText().toString();
                text = text+"N".toLowerCase();
                textInput.setText(text);
            }
        });
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textInput.getText().toString();
                text = text+"M".toLowerCase();
                textInput.setText(text);
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textInput.getText().toString();
                text = text+".".toLowerCase();
                textInput.setText(text);
            }
        });
        comma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textInput.getText().toString();
                text = text+",".toLowerCase();
                textInput.setText(text);
            }
        });
        space.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textInput.getText().toString();
                text = text+" ";
                textInput.setText(text);
            }
        });
        bs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textInput.getText().toString();
                if(text.length()>1)
                    textInput.setText(text.substring(0,text.length()-1));
                else
                    textInput.setText("");
            }
        });
        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textInput.getText().toString();
                text = text+"\n";
                textInput.setText(text);
            }
        });

        caps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity4.class);
                intent.putExtra("TextInput",text);
                startActivity(intent);
            }
        });

       num.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity3.class);
                intent.putExtra("TextInput",text);
                startActivity(intent);
            }
        });
    }
}
