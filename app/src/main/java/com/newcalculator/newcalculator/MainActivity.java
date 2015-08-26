package com.newcalculator.newcalculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

public class MainActivity extends ActionBarActivity implements OnClickListener {


    EditText disp;
    int num1;
    int num2;
    String optr;

    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btn10;
    private Button btndiv;
    private Button btnmultiply;
    private Button btnsubtract;
    private Button btnadd;
    private Button equal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btnsubtract = (Button) findViewById(R.id.btnsubtract);
        btnadd = (Button) findViewById(R.id.btnadd);
        btnmultiply = (Button) findViewById(R.id.btnmultiply);
        btndiv = (Button) findViewById(R.id.btndiv);
        disp = (EditText) findViewById(R.id.display);
        equal  = (Button) findViewById(R.id.equal);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btnsubtract.setOnClickListener(this);
        btnadd.setOnClickListener(this);
        btnmultiply.setOnClickListener(this);
        btndiv.setOnClickListener(this);
        equal.setOnClickListener(this);
    }


public void operation()
{
    if(optr.equals("+")){
        num2 = Integer.parseInt(disp.getText().toString());
        disp.setText("");
        num1 = num1 + num2;
        disp.setText("Result :" + Integer.toString(num1));

    }
    else if(optr.equals("-")){
        num2 = Integer.parseInt(disp.getText().toString());
        disp.setText("");
        num1 = num1 - num2;
        disp.setText("Result : " + Integer.toString(num1));

    }
    else if(optr.equals("*")){
        num2 = Integer.parseInt(disp.getText().toString());
        disp.setText("");
        num1 = num1 * num2;
        disp.setText("Result : " + Integer.toString(num1));

    }
    else if(optr.equals("/")){
        num2 = Integer.parseInt(disp.getText().toString());
        disp.setText("");
        num1 = num1 / num2;
        disp.setText("Result : " + Integer.toString(num1));
    }
}


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {

        Editable str = disp.getText();
        switch(v.getId()){
            case R.id.btn1:
                if(num2 !=0){
                    num2 = 0;
                    disp.setText("");

                }
                str = str.append(btn1.getText());
                disp.setText(str);
                break;

            case R.id.btn2:
                if(num2 !=0){
                    num2 = 0;
                    disp.setText("");

                }
                str = str.append(btn2.getText());
                disp.setText(str);
                break;

            case R.id.btn3:
                if(num2 !=0){
                    num2 = 0;
                    disp.setText("");

                }
                str = str.append(btn3.getText());
                disp.setText(str);
                break;

            case R.id.btn4:
                if(num2 !=0){
                    num2 = 0;
                    disp.setText("");

                }
                str = str.append(btn4.getText());
                disp.setText(str);
                break;

            case R.id.btn5:
                if(num2 !=0){
                    num2 = 0;
                    disp.setText("");

                }
                str = str.append(btn5.getText());
                disp.setText(str);
                break;

            case R.id.btn6:
                if(num2 !=0){
                    num2 = 0;
                    disp.setText("");

                }
                str = str.append(btn6.getText());
                disp.setText(str);
                break;

            case R.id.btn7:
                if(num2 !=0){
                    num2 = 0;
                    disp.setText("");

                }
                str = str.append(btn7.getText());
                disp.setText(str);
                break;

            case R.id.btn8:
                if(num2 !=0){
                    num2 = 0;
                    disp.setText("");

                }
                str = str.append(btn8.getText());
                disp.setText(str);
                break;

            case R.id.btn9:
                if(num2 !=0){
                    num2 = 0;
                    disp.setText("");

                }
                str = str.append(btn9.getText());
                disp.setText(str);
                break;

        case R.id.btnadd: optr = "+";
        if(num1 == 0)
        {
            num1 = Integer.parseInt(disp.getText().toString());
            disp.setText("");
        }
        else if(num2 != 0)
        {
            num2 = 0; disp.setText("");
        }
        else
        {
            num2 = Integer.parseInt(disp.getText().toString());
            disp.setText("");
            num1 = num1 + num2;
            disp.setText("Result : " + Integer.toString(num1));
        }
        break;
        case R.id.btnsubtract: optr = "-";
            if(num1 == 0)
            {
                num1 = Integer.parseInt(disp.getText().toString());
                disp.setText("");
            } else if(num2 != 0){ num2 = 0;
                disp.setText("");
            }
            else{ num2 = Integer.parseInt(disp.getText().toString());
                disp.setText("");
                num1 = num1 - num2;
                disp.setText("Result : " + Integer.toString(num1));
            }
            break;
            case R.id.btnmultiply: optr = "*";
                if(num1 == 0)
                {
                    num1 = Integer.parseInt(disp.getText().toString()); disp.setText("");
                }
                else if(num2 != 0)
                { num2 = 0; disp.setText("");
                } else{ num2 = Integer.parseInt(disp.getText().toString());
                    disp.setText("");
                    num1 = num1 * num2; disp.setText("Result : " + Integer.toString(num1));
                } break;
            case R.id.btndiv: optr = "/"; if(num1 == 0)
            { num1 = Integer.parseInt(disp.getText().toString());
                disp.setText(""); }
            else if(num2 != 0){ num2 = 0;
                disp.setText("");
            }
            else{ num2 = Integer.parseInt(disp.getText().toString());
                disp.setText("");
                num1 = num1 / num2;
                disp.setText("Result : " + Integer.toString(num1));
            }
                break;
            case R.id.equal: if(!optr.equals(null))
            {
                if(num2 != 0){ if(optr.equals("+")){
                    disp.setText("");
                 disp.setText("Result : " + Integer.toString(num1));
                }
                else if(optr.equals("-"))
                {
                    disp.setText("");
                    disp.setText("Result : " + Integer.toString(num1));
                }
                else if(optr.equals("*"))
                {
                    disp.setText("");
                    disp.setText("Result : " + Integer.toString(num1));
                }
                else if(optr.equals("/")){
                    disp.setText("");
                    disp.setText("Result : " + Integer.toString(num1)); }
                } else{ operation(); } }
                break; } }

    }

