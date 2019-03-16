package com.bakan.turnuva;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {
    Button btnFutbol,btnBasketbol,btnVoleybol,btnHentbol,btnMasatenisi ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btnFutbol=(Button)findViewById(R.id.btnFutbol);
        btnBasketbol=(Button)findViewById(R.id.btnBasketbol);
        btnVoleybol=(Button)findViewById(R.id.btnVoleybol);
        btnHentbol=(Button)findViewById(R.id.btnHentbol);
        btnMasatenisi=(Button)findViewById(R.id.btnMasatenisi);


        //intent futbol
        btnFutbol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent futbolgecis= new Intent(SecondActivity.this ,FutbolActivity.class);
                startActivity(futbolgecis);
            }
        });

        //intent basketbol
        btnBasketbol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent basketbolgecis= new Intent(SecondActivity.this ,BasketbolActivity.class);
                startActivity(basketbolgecis);
            }
        });

        // intent voleybol
        btnVoleybol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent voleybolgecis= new Intent(SecondActivity.this ,VoleybolActivity.class);
                startActivity(voleybolgecis);
            }
        });

        // intent Hentbol
        btnHentbol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hentbolgecis= new Intent(SecondActivity.this ,HentbolActivity.class);
                startActivity(hentbolgecis);
            }
        });

        // intent masatenisi
        btnMasatenisi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent masatensigecis= new Intent(SecondActivity.this ,MasatenisiActivity.class);
                startActivity(masatensigecis);
            }
        });
    }
}
