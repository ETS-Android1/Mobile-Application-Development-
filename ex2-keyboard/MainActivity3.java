package com.example.keyboardsimulation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    String text;
    TextView textInput;
    Button one,two,three,four,five,six,seven,eight,nine,zero,at,ash,rupee,us,and,hiphen,plus;
    Button openPara,closePara,slash,star,doubleQuote,apostrophe,colon,semicolon,exclamation;
    Button question,comma,dot,bs,space,enter,abc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        textInput = findViewById(R.id.textInput);
        one  = findViewById(R.id.one);
        two  = findViewById(R.id.two);
        three  = findViewById(R.id.three);
        four  = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        zero = findViewById(R.id.zero);
        at = findViewById(R.id.at);
        ash = findViewById(R.id.ash);
        rupee = findViewById(R.id.rupee);
        us = findViewById(R.id.us);
        and = findViewById(R.id.and);
        hiphen = findViewById(R.id.hiphen);
        plus = findViewById(R.id.plus);
        openPara = findViewById(R.id.openPara);
        closePara = findViewById(R.id.closePara);
        slash = findViewById(R.id.slash);
        star = findViewById(R.id.star);
        doubleQuote = findViewById(R.id.doubleQuote);
        apostrophe = findViewById(R.id.apostrophe);
        colon = findViewById(R.id.colon);
        semicolon = findViewById(R.id.semiColon);
        exclamation = findViewById(R.id.exclamation);
        question = findViewById(R.id.question);
        comma = findViewById(R.id.comma);
        dot = findViewById(R.id.dot);
        bs = findViewById(R.id.bs);
        space = findViewById(R.id.space);
        abc = findViewById(R.id.abc);
        enter = findViewById(R.id.enter);

        text = getIntent().getStringExtra("TextInput");
        textInput.setText(text);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textInput.getText().toString();
                text = text+"1";
                textInput.setText(text);
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textInput.getText().toString();
                text = text+"2";
                textInput.setText(text);
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textInput.getText().toString();
                text = text+"3";
                textInput.setText(text);
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textInput.getText().toString();
                text = text+"4";
                textInput.setText(text);
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textInput.getText().toString();
                text = text+"5";
                textInput.setText(text);
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textInput.getText().toString();
                text = text+"6";
                textInput.setText(text);
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textInput.getText().toString();
                text = text+"7";
                textInput.setText(text);
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textInput.getText().toString();
                text = text+"8";
                textInput.setText(text);
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textInput.getText().toString();
                text = text+"9";
                textInput.setText(text);
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textInput.getText().toString();
                text = text+"0";
                textInput.setText(text);
            }
        });
        at.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textInput.getText().toString();
                text = text+"@";
                textInput.setText(text);
            }
        });
        ash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textInput.getText().toString();
                text = text+"#";
                textInput.setText(text);
            }
        });
        rupee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textInput.getText().toString();
                text = text+"₹";
                textInput.setText(text);
            }
        });
        us.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textInput.getText().toString();
                text = text+"_";
                textInput.setText(text);
            }
        });
        and.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textInput.getText().toString();
                text = text+"&";
                textInput.setText(text);
            }
        });
        hiphen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textInput.getText().toString();
                text = text+"-";
                textInput.setText(text);
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textInput.getText().toString();
                text = text+"+";
                textInput.setText(text);
            }
        });
        openPara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textInput.getText().toString();
                text = text+"(";
                textInput.setText(text);
            }
        });
        closePara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textInput.getText().toString();
                text = text+")";
                textInput.setText(text);
            }
        });
        slash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textInput.getText().toString();
                text = text+"/";
                textInput.setText(text);
            }
        });
        star.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textInput.getText().toString();
                text = text+"*";
                textInput.setText(text);
            }
        });
        doubleQuote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textInput.getText().toString();
                text = text+"\"";
                textInput.setText(text);
            }
        });
        apostrophe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textInput.getText().toString();
                text = text+"\'";
                textInput.setText(text);
            }
        });
        colon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textInput.getText().toString();
                text = text+":";
                textInput.setText(text);
            }
        });
        semicolon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textInput.getText().toString();
                text = text+";";
                textInput.setText(text);
            }
        });
        exclamation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textInput.getText().toString();
                text = text+"!";
                textInput.setText(text);
            }
        });
        question.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textInput.getText().toString();
                text = text+"?";
                textInput.setText(text);
            }
        });
        abc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity3.this,MainActivity.class);
                intent.putExtra("TextInput",text);
                startActivity(intent);
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textInput.getText().toString();
                text = text+".";
                textInput.setText(text);
            }
        });
        comma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textInput.getText().toString();
                text = text+",";
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

    }
}
