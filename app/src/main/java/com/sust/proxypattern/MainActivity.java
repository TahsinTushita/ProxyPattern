package com.sust.proxypattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button user,admin;
    private Draw drawer = new ProxyDrawing();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user=findViewById(R.id.userbtn);
        admin=findViewById(R.id.adminbtn);

        user.setOnClickListener(this);
        admin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.userbtn){
            drawer.draw("user",findViewById(android.R.id.content));
        }
        if(v.getId()==R.id.adminbtn){
            drawer.draw("admin",findViewById(android.R.id.content));
        }
    }
}
