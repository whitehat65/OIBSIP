package com.example.prashantcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    EditText fn,sn;
    Button add,sub,div,mult;
    TextView r,r1;
//Prashant Added COmment
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fn=findViewById(R.id.fn);
        sn=findViewById(R.id.sn);
        add=findViewById(R.id.add);
        sub=findViewById(R.id.sub);
        div=findViewById(R.id.div);
        mult=findViewById(R.id.mult);
        r=findViewById(R.id.r);
        r1=findViewById(R.id.r1);

        add.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if(fn.getText().toString().isEmpty() || sn.getText().toString().isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Enter Values", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    int a=Integer.parseInt(fn.getText().toString());
                    int b=Integer.parseInt(sn.getText().toString());
                    int c=a+b;
                    r.setText(String.valueOf(c));
                }
            }
        });
        sub.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if(fn.getText().toString().isEmpty() || sn.getText().toString().isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Enter Values", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    int a=Integer.parseInt(fn.getText().toString());
                    int b=Integer.parseInt(sn.getText().toString());
                    int c=a-b;
                    r.setText(String.valueOf(c));
                }
            }
        });
        div.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if(fn.getText().toString().isEmpty() || sn.getText().toString().isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Enter Values", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    int a=Integer.parseInt(fn.getText().toString());
                    int b=Integer.parseInt(sn.getText().toString());
                    int c=a/b;
                    r.setText(String.valueOf(c));
                }
            }
        });
        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(fn.getText().toString().isEmpty() || sn.getText().toString().isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Enter Values", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    int a=Integer.parseInt(fn.getText().toString());
                    int b=Integer.parseInt(sn.getText().toString());
                    int c=a*b;
                    r.setText(String.valueOf(c));
                }
            }
        });
    }
}