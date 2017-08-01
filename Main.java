package com.example.myhp.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main extends AppCompatActivity {
 String s="",s1="",s2="",resultString="";
    Button one1,one2,one3,one4,one5,one6,one7,one8,one9,one0,bAdd,bSub,bMul,bDiv,bEqual,bClear,bce;
    TextView res,exp;
    int c=-1,i,i1, result=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        one1 = (Button) findViewById(R.id.one);
        one2 = (Button) findViewById(R.id.two);
        one3 = (Button) findViewById(R.id.three);
        one4 = (Button) findViewById(R.id.four);
        one5 = (Button) findViewById(R.id.five);
        one6 = (Button) findViewById(R.id.six);
        one7 = (Button) findViewById(R.id.seven);
        one8 = (Button) findViewById(R.id.eight);
        one9 = (Button) findViewById(R.id.nine);
        one0 = (Button) findViewById(R.id.zero);
        bAdd = (Button) findViewById(R.id.add);
        bSub = (Button) findViewById(R.id.sub1);
        bMul = (Button) findViewById(R.id.mul);
        bDiv = (Button) findViewById(R.id.div);
        bClear = (Button) findViewById(R.id.clear);
        bce = (Button) findViewById(R.id.allClear);
        bEqual = (Button) findViewById(R.id.equal);

        res = (TextView) findViewById(R.id.textViewResult);
        exp = (TextView) findViewById(R.id.textViewInput);

 one1.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View view) {

         s = (String) res.getText();
         res.setText(s + "1");
         s = "";
     }
 });
        one2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                s = (String) res.getText();
                res.setText(s + "2");
                s = "";
            }
        });
        one3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                s = (String) res.getText();
                res.setText(s + "3");
                s = "";
            }
        });
        one4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                s = (String) res.getText();
                res.setText(s + "4");
                s = "";
            }
        });
        one5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                s = (String) res.getText();
                res.setText(s + "5");
                s = "";
            }
        });
        one6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                s = (String) res.getText();
                res.setText(s + "6");
                s = "";
            }
        });
        one7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                s = (String) res.getText();
                res.setText(s + "7");
                s = "";
            }
        });
        one8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                s = (String) res.getText();
                res.setText(s + "8");
                s = "";
            }
        });
        one9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                s = (String) res.getText();
                res.setText(s + "9");
                s = "";
            }
        });
        one0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                s = (String) res.getText();
                res.setText(s + "0");
                s = "";
            }
        });

        bAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             String temp = (String) res.getText();
                if (temp.isEmpty()) {
                    s1 = "0";}
                else if (!temp.equals("+")&&!temp.equals("-")&&!temp.equals("/")&&!temp.equals("*")){
                    s1 = temp;
                }
                c=0;
                resultString = "";
                res.setText("");
                exp.setText(s1 + " + ");
            }
        });
        bSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = (String) res.getText();
                if (temp.isEmpty()) {
                    s1 = "0";}
                else if (!temp.equals("+")&&!temp.equals("-")&&!temp.equals("/")&&!temp.equals("*")){
                    s1 = temp;
                }
                c=1;
                resultString = "";
                res.setText("");
                exp.setText(s1 + " - ");
            }
        });

        bMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = (String) res.getText();
                if (temp.isEmpty()) {
                    s1 = "0";}
                else if (!temp.equals("+")&&!temp.equals("-")&&!temp.equals("/")&&!temp.equals("*")){
                    s1 = temp;
                }
                c=2;
                resultString = "";
                res.setText("");
                exp.setText(s1 + " * ");
            }
        });
        bDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = (String) res.getText();
                if (temp.isEmpty()) {
                    s1 = "0";}
                else if (!temp.equals("+")&&!temp.equals("-")&&!temp.equals("/")&&!temp.equals("*")){
                    s1 = temp;
                }
                c=3;
                resultString = "";
                res.setText("");
                exp.setText(s1 + " / ");
            }
        });
       bEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String operator = "";
                if (s1.equalsIgnoreCase("+")||s1.equalsIgnoreCase("-")||s1.equalsIgnoreCase("*")||s1.equalsIgnoreCase("/"))
                    i=0;
                else if (s1 == null||s1.isEmpty())
                    i=0;
                else
                i = Integer.parseInt(s1);
                if (resultString.isEmpty()){
                s2 = (String) res.getText();
                 if (s2.equalsIgnoreCase("+")||s2.equalsIgnoreCase("-")||s2.equalsIgnoreCase("*")||s2.equalsIgnoreCase("/"))
                     i1=0;
                    if (s2==null||s2.isEmpty())
                        i1=0;
                    else
                 i1 = Integer.parseInt(s2);}
                if (c==0) {
                    operator = "+";
                    result = i + i1;
                }
                else if (c==1) {
                    operator = "-";
                    result = i - i1;
                }
                else if (c==2) {
                    operator = "*";
                    result = i * i1;
                }
                else if (c==3) {
                    operator = "/";
                    if (i1==0){
                        Toast.makeText(getApplicationContext(),"Invalid Input", Toast.LENGTH_LONG).show();
                        result=0;
                    }
                   else
                    result = i / i1;
                }
                else {
                    operator = "";
                    result = 0;
                }

                if (!operator.isEmpty())
                exp.setText(i + operator + i1);
                else
                    exp.setText("");

                resultString = String.valueOf(result);
                res.setText(resultString);
            }
        });
        bClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            s =(String) res.getText();
                if (s.equals("+")||s.equals("-")||s.equals("/")||s.equals("*"))
                    i = 0;
                else{
                    i = Integer.parseInt(s);
                    i = i/10;
               }
               if (i==0)
                   res.setText("");
                else
                    res.setText(i+"");
            }
        });
        bce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText("");
                exp.setText("");
                i=0;
                i1=0;
                c=-1;
                s1="";
                s2="";
                result=0;
                resultString="";
            }
        });
    }

}
