package com.bakan.turnuva;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {
Button btnBaslat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnBaslat=(Button)findViewById(R.id.btnBaslat);





        btnBaslat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent SecondGecis=new Intent(MainActivity.this, SecondActivity.class);
                startActivity(SecondGecis);
            }
        });
    }



}
