package com.bakan.turnuva;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Random;

public class FutbolActivity extends AppCompatActivity {
    private TextView textViewBir,textViewIki,textViewUc,textViewDort,textViewBes,textViewAltı;
    Button button1,button2,button3,button4,button5,button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_futbol);

        //creating
        final Oyuncu Hakem=new Oyuncu(); // Macı baslatacak

        final Takım[] Takımlar=new Takım[11];
        final Takım[] Takımlar1=new Takım[6];
        final Takım[] Takımlar2=new Takım[3];
        final Takım[] Takımlar3=new Takım[2];


        final Takım FutbolBilgisayar=new Takım();
        final Takım FutbolEndustri=new Takım();
        final Takım FutbolElektronik=new Takım();
        final Takım FutbolJeofizik=new Takım();
        final Takım FutbolInsaat=new Takım();
        final Takım FutbolMaden=new Takım();
        final Takım FutbolCevre=new Takım();
        final Takım FutbolMakine=new Takım();
        final Takım FutbolTekstil=new Takım();
        final Takım FutbolJeoloji=new Takım();
        final Takım FutbolMalzeme=new Takım();

        Takımlar[0]=FutbolBilgisayar;
        Takımlar[1]=FutbolEndustri;
        Takımlar[2]=FutbolElektronik;
        Takımlar[3]=FutbolJeofizik;
        Takımlar[4]=FutbolInsaat;
        Takımlar[5]=FutbolMaden;
        Takımlar[6]=FutbolCevre;
        Takımlar[7]=FutbolMakine;
        Takımlar[8]=FutbolTekstil;
        Takımlar[9]=FutbolJeoloji;
        Takımlar[10]=FutbolMalzeme;


        //Adlandırma
        FutbolBilgisayar.setAd("Bilgisayar");
        FutbolEndustri.setAd("Endustri");
        FutbolElektronik.setAd("Elektronik");
        FutbolJeofizik.setAd("Jeofizik");
        FutbolInsaat.setAd("Insaat");
        FutbolMaden.setAd("Maden");
        FutbolCevre.setAd("Cevre");
        FutbolMakine.setAd("Makine");
        FutbolTekstil.setAd("Tekstil");
        FutbolJeoloji.setAd("Jeoloji");
        FutbolMalzeme.setAd("Malzeme");

        for(int i=0;i<11;i++) { ///////ilk başlangıç herkes yenilgisiz
            Takımlar[i].Kazandı=true;
        }
        for(int i=0;i<11;i++) { ///////ilk başlangıç herkes 0. turda
            Takımlar[i].Tur=0;
        }
        for(int i=0;i<11;i++) { ///////ilk başlangıç ToplamSkor 0
            Takımlar[i].ToplamSkor=0;

        }
        for(int i=0;i<11;i++) { ///////ilk başlangıç Avaraj 0
            Takımlar[i].Avaraj=0;
        }
        final String[] Fikstur0=new String[6];
        final String[] Fikstur1=new String[3];
        final String[] Fikstur2=new String[1];
        final String[] Fikstur3=new String[1];

        textViewBir = (TextView)findViewById(R.id.textView1);
        textViewIki = (TextView)findViewById(R.id.textView2);
        textViewUc = (TextView)findViewById(R.id.textView3);
        textViewDort = (TextView)findViewById(R.id.textView4);
        textViewBes = (TextView)findViewById(R.id.textView5);
        textViewAltı = (TextView)findViewById(R.id.textView6);

        /////gövde

        // sıfırıncı tur
        final Takım Bay1=Takımlar[Hakem.RandomSayı()]; //Takım sayısı tek olduğundan bay secildi
        Bay1.Tur=1;
        Bay1.Kazandı=true;

        int i=0;
        int Takım1id;
        int Takım2id;

        Takım Takım1 = null;
        Takım Takım2 = null;

        while(i<Takımlar.length/2){

            Takım1id=Hakem.RandomSayı();
            Takım2id=Hakem.RandomSayı();
            while(Takım1id==Takım2id){
                Takım1id=Hakem.RandomSayı();
            }
            while(!Takımlar[Takım1id].Kazandı||Takımlar[Takım1id].Tur!=0){
                Takım1id=Hakem.RandomSayı();

            }
            while(!Takımlar[Takım2id].Kazandı||Takımlar[Takım2id].Tur!=0){
                Takım2id=Hakem.RandomSayı();

            }
            if(Takım1id!=Takım2id){
                Takım1=Takımlar[Takım1id];
                Takım2=Takımlar[Takım2id];
                Fikstur0[i] =Hakem.FutbolMacYap(Takım1,Takım2);
                i++;
            }

        }
        int s=0;
        for(int k=0;k<11;k++){ // Birinci tura çıkanlar

            if(Takımlar[k].Kazandı&&Takımlar[k].Tur==1){
                Takımlar1[s]=Takımlar[k];
                s++;
            }
        }
        for(int a=0;a<Takımlar1.length;a++){ //birinci tura çıkanlar yazdırma
            System.out.println(a+". elaman"+Takımlar1[a].Ad);
        }

        //birinci tur baslangıc
        i=0;
        while(i<3){

            Takım1id=Hakem.RandomSayı1();
            Takım2id=Hakem.RandomSayı1();
            while(Takım1id==Takım2id){
                Takım1id=Hakem.RandomSayı1();
            }
            while(!Takımlar1[Takım1id].Kazandı||Takımlar1[Takım1id].Tur!=1){
                Takım1id=Hakem.RandomSayı1();

            }
            while(!Takımlar1[Takım2id].Kazandı||Takımlar1[Takım2id].Tur!=1){
                Takım2id=Hakem.RandomSayı1();
            }
            if(Takım1id!=Takım2id){
                Takım1=Takımlar1[Takım1id];
                Takım2=Takımlar1[Takım2id];
                Fikstur1[i] =Hakem.FutbolMacYap(Takım1,Takım2);
                i++;
            }

        }
        for(int a=0;a<Fikstur1.length;a++){ // Birinci tur Fikstur1
            System.out.println(a+". elaman"+Fikstur1[a]);
        }
        int m=0;
        for(int k=0;k<6;k++){ // ikinci tura çıkanlar

            if(Takımlar1[k].Kazandı&&Takımlar1[k].Tur==2){
                Takımlar2[m]=Takımlar1[k];
                m++;
            }
        }
        for(int a=0;a<Takımlar2.length;a++){ //ikincici tura çıkanlar yazdırma
            System.out.println(a+". elaman"+Takımlar2[a].Ad);
        }

        //ikinci tur baslangıc
        final Takım Bay2=Takımlar2[Hakem.RandomSayı2()]; //Takım sayısı tek olduğundan bay secildi
        Bay2.Tur=3;
        Bay2.Kazandı=true;
        i=0;
        System.out.println(Bay2.Ad+" takımı 2. turda bay secildi");

        while(i<1){

            Takım1id=Hakem.RandomSayı2();
            Takım2id=Hakem.RandomSayı2();
            while(Takım1id==Takım2id){
                Takım1id=Hakem.RandomSayı2();
            }
            while(!Takımlar2[Takım1id].Kazandı||Takımlar2[Takım1id].Tur!=2){
                Takım1id=Hakem.RandomSayı2();

            }
            while(!Takımlar2[Takım2id].Kazandı||Takımlar2[Takım2id].Tur!=2){
                Takım2id=Hakem.RandomSayı2();
            }

            if(Takım1id!=Takım2id){
                Takım1=Takımlar2[Takım1id];
                Takım2=Takımlar2[Takım2id];
                Fikstur2[i] =Hakem.FutbolMacYap(Takım1,Takım2);
                i++;
            }
        }
        for(int a=0;a<Fikstur2.length;a++){ // ikinci tur Fikstur2
            System.out.println(a+". elaman"+Fikstur2[a]);
        }
        m=0;
        for(int k=0;k<3;k++){ // ikinci tura çıkanlar

            if(Takımlar2[k].Kazandı&&Takımlar2[k].Tur==3){
                Takımlar3[m]=Takımlar2[k];
                m++;
            }
        }

        //final macı
        Fikstur3[0] =Hakem.FutbolMacYap(Takımlar3[0],Takımlar3[1]);

        System.out.println("Final Macı Sonucu "+Fikstur3[0]);
        m=0;
        Takım Sampiyon = null;
        for(int k=0;k<2;k++){

            if(Takımlar2[k].Kazandı&&Takımlar2[k].Tur==4){
                Sampiyon=Takımlar3[k];
                System.out.println("Sampiyon Takım:"+ Sampiyon.Ad);
                m++;
            }
        }
        int[] ToplamSkor=new int[11];
        int[] Avaraj=new int[11];

        for(int x=0;x<11;x++) {
            ToplamSkor[x]=Takımlar[x].ToplamSkor;
        }
        for(int x=0;x<11;x++) {
            Avaraj[x]=Takımlar[x].Avaraj;
        }
        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        button4 = (Button)findViewById(R.id.button4);
        button5 = (Button)findViewById(R.id.button5);
        button6 = (Button)findViewById(R.id.button6);

        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                textViewBir.setText(Fikstur0[0]);
                textViewIki.setText(Fikstur0[1]);
                textViewUc.setText(Fikstur0[2]);
                textViewDort.setText(Fikstur0[3]);
                textViewBes.setText(Fikstur0[4]);
                textViewAltı.setText("Bay Takım: "+ Bay1.Ad);
            }
        });

        final String bos=" ";
        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                textViewBir.setText(Fikstur1[0]);
                textViewIki.setText(Fikstur1[1]);
                textViewUc.setText(Fikstur1[2]);
                textViewDort.setText(bos);
                textViewBes.setText(bos);
                textViewAltı.setText(bos);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                textViewBir.setText(Fikstur2[0]);
                textViewIki.setText(bos);
                textViewUc.setText("Bay Takım: "+ Bay2.Ad);
                textViewDort.setText(bos);
                textViewBes.setText(bos);
                textViewAltı.setText(bos);
            }
        });
        final Takım finalSampiyon = Sampiyon;
        button4.setOnClickListener(new View.OnClickListener() {
        String asd="Futbol Turnuvası Sampiyonu :";
            @Override
            public void onClick(View v) {
                textViewBir.setText(Fikstur3[0]);
                textViewIki.setText(bos);
                textViewUc.setText(asd);
                textViewDort.setText(finalSampiyon.Ad);
                textViewBes.setText(bos);
                textViewAltı.setText(bos);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent goToStatistic = new Intent(FutbolActivity.this,StatisticActivity.class);
                startActivity(goToStatistic);

            }
        });
        button6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                textViewBir.setText(bos);
                textViewIki.setText(bos);
                textViewUc.setText(bos);
                textViewBes.setText(bos);
                textViewAltı.setText(bos);
            }
        });
    }
}

