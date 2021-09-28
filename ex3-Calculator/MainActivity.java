package com.example.calc;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    static String operator;
    static int operand1;
    static int operand2;
    static float floatOp1;
    static float floatOp2;
    static boolean float_flag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void typeChar(View view) {
        String txt = ((Button)view).getText().toString();
        if(txt.charAt(0)=='.')
        {
            float_flag=true;
            System.out.println("float flag is set");
        }
        TextView display = (TextView)findViewById(R.id.TextField);
        display.setText(display.getText().toString()+txt);
    }

    public void clearText(View view) {
        TextView display = (TextView)findViewById(R.id.TextField);
        display.setText("");

    }

    public void operandPress(View view) {
        operator = ((Button)view).getText().toString();
        System.out.println(operator + " pressed");
        TextView display = (TextView)findViewById(R.id.TextField);
        if(display.getText().toString().isEmpty())
        {
            return;
        }
        if(float_flag)
        {
            floatOp1= Float.parseFloat(display.getText().toString());
        }
        else{
            operand1 = Integer.parseInt(display.getText().toString());
        }
        clearText(view);
    }

    public void calculate(View view) {
        TextView display = (TextView)findViewById(R.id.TextField);
        if(display.getText().toString().isEmpty())
        {
            return;
        }
        if(float_flag)
        {
            floatOp2= Float.parseFloat(display.getText().toString());
        }
        else{
            operand2 = Integer.parseInt(display.getText().toString());
        }
        if(float_flag)
        {
            if(operator.charAt(0)=='+')
            {
                float result = floatOp1+floatOp2;
                display.setText(Float.toString(result));
            }
            else if(operator.charAt(0)=='-')
            {
                float result = floatOp1-floatOp2;
                display.setText(Float.toString(result));

            }
            else if(operator.charAt(0)=='x')
            {
                float result = floatOp1*floatOp2;
                display.setText(Float.toString(result));

            }
            else if(operator.charAt(0)=='/')
            {
                float result = floatOp1/floatOp2;
                display.setText(Float.toString(result));

            }
            else if(operator.charAt(0)=='%')
            {
                float result = floatOp1%floatOp2;
                display.setText(Float.toString(result));

            }


        }
        else {
            if(operator.charAt(0)=='+')
            {
                int result = operand1+operand2;
                display.setText(Integer.toString(result));
            }
            else if(operator.charAt(0)=='-')
            {
                int result = operand1-operand2;
                display.setText(Integer.toString(result));

            }
            else if(operator.charAt(0)=='x')
            {
                int result = operand1*operand2;
                display.setText(Integer.toString(result));

            }
            else if(operator.charAt(0)=='/')
            {
                int result = operand1/operand2;
                display.setText(Integer.toString(result));

            }
            else if(operator.charAt(0)=='%')
            {
                int result = operand1%operand2;
                display.setText(Integer.toString(result));

            }

        }


    }
}


