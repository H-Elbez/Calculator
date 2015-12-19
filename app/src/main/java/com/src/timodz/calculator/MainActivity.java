package com.src.timodz.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
        Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bplus,bminus,bdiv,bmul,bdel,bback,bvergule,bresultat;
        TextView affichage ;
        int i ;
        float x , y ;
     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         b1 = (Button) findViewById(R.id.b1);
         b2 = (Button) findViewById(R.id.b2);
         b3 = (Button) findViewById(R.id.b3);
         b4 = (Button) findViewById(R.id.b4);
         b5 = (Button) findViewById(R.id.b5);
         b6 = (Button) findViewById(R.id.b6);
         b7 = (Button) findViewById(R.id.b7);
         b8 = (Button) findViewById(R.id.b8);
         b9 = (Button) findViewById(R.id.b9);
         b0 = (Button) findViewById(R.id.b0);
         bplus = (Button) findViewById(R.id.bplus);
         bminus = (Button) findViewById(R.id.bminus);
         bdiv = (Button) findViewById(R.id.bdiv);
         bmul = (Button) findViewById(R.id.bmul);
         bdel = (Button) findViewById(R.id.bclear);
         bback = (Button) findViewById(R.id.bdelete);
         bvergule = (Button) findViewById(R.id.bvergule);
         bresultat = (Button) findViewById(R.id.bresult);
         affichage = (TextView) findViewById(R.id.textView);
         i = 0 ;
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                affichage.setText(affichage.getText().toString().concat("1"));
            }
        });
         b0.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 affichage.setText(affichage.getText().toString().concat("0"));
             }
         });
         b2.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 affichage.setText(affichage.getText().toString().concat("2"));
             }
         });
         b3.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 affichage.setText(affichage.getText().toString().concat("3"));
             }
         });
         b4.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 affichage.setText(affichage.getText().toString().concat("4"));
             }
         });
         b5.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 affichage.setText(affichage.getText().toString().concat("5"));
             }
         });
         b6.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 affichage.setText(affichage.getText().toString().concat("6"));
             }
         });
         b7.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 affichage.setText(affichage.getText().toString().concat("7"));
             }
         });
         b8.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 affichage.setText(affichage.getText().toString().concat("8"));
             }
         });
         b9.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 affichage.setText(affichage.getText().toString().concat("9"));
             }
         });
         bdel.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 affichage.setText("");
             }
         });
         bplus.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 affichage.setText(affichage.getText().toString().concat("+"));
             }
         });
         bminus.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 affichage.setText(affichage.getText().toString().concat("-"));
             }
         });
         bmul.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 affichage.setText(affichage.getText().toString().concat("*"));
             }
         });
         bdiv.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 affichage.setText(affichage.getText().toString().concat("/"));
             }
         });
         bvergule.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 affichage.setText(affichage.getText().toString().concat("."));
             }
         });
         bplus.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 affichage.setText(affichage.getText().toString().concat("+"));
             }
         });
         bback.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 affichage.setText(affichage.getText().toString().substring(0, affichage.getText().length() - 1));
             }
         });
         bresultat.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 try {
                     while (affichage.getText().charAt(i) != '+' && affichage.getText().charAt(i) != '-'
                             && affichage.getText().charAt(i) != '*' && affichage.getText().charAt(i) != '/') {
                         i++;
                     }
                     x = Float.valueOf(affichage.getText().toString().substring(0, i));
                     y = Float.valueOf(affichage.getText().toString().substring(i + 1, affichage.getText().length()));

                     switch (affichage.getText().charAt(i)) {
                         case '+':
                             affichage.setText(String.valueOf(x + y));
                             break;
                         case '-':
                             affichage.setText(String.valueOf(x - y));
                             break;
                         case '*':
                             affichage.setText(String.valueOf(x * y));

                             break;
                         case '/':
                             affichage.setText(String.valueOf(x / y));
                             break;
                     }

                 }catch(Exception e){
                     affichage.setText("");
                     Toast.makeText(MainActivity.this,"Error !!" ,Toast.LENGTH_SHORT).show();
                 }
             }
         });

     }
}
