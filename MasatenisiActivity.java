package com.bakan.turnuva;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MasatenisiActivity extends AppCompatActivity {
    private TextView textViewBir,textViewIki,textViewUc,textViewDort,textViewBes,textViewAltı;
    Button button1,button2,button3,button4,button5,button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_masatenisi);



        //creating
        final Oyuncu Hakem=new Oyuncu(); // Macı baslatacak

        final Takım[] Takımlar=new Takım[11];
        final Takım[] Takımlar1=new Takım[6];
        final Takım[] Takımlar2=new Takım[3];
        final Takım[] Takımlar3=new Takım[2];


        final Takım MasatenisiBilgisayar=new Takım();
        final Takım MasatenisiEndustri=new Takım();
        final Takım MasatenisiElektronik=new Takım();
        final Takım MasatenisiJeofizik=new Takım();
        final Takım MasatenisiInsaat=new Takım();
        final Takım MasatenisiMaden=new Takım();
        final Takım MasatenisiCevre=new Takım();
        final Takım MasatenisiMakine=new Takım();
        final Takım MasatenisiTekstil=new Takım();
        final Takım MasatenisiJeoloji=new Takım();
        final Takım MasatenisiMalzeme=new Takım();

        Takımlar[0]=MasatenisiBilgisayar;
        Takımlar[1]=MasatenisiEndustri;
        Takımlar[2]=MasatenisiElektronik;
        Takımlar[3]=MasatenisiJeofizik;
        Takımlar[4]=MasatenisiInsaat;
        Takımlar[5]=MasatenisiMaden;
        Takımlar[6]=MasatenisiCevre;
        Takımlar[7]=MasatenisiMakine;
        Takımlar[8]=MasatenisiTekstil;
        Takımlar[9]=MasatenisiJeoloji;
        Takımlar[10]=MasatenisiMalzeme;


        //Adlandırma
        MasatenisiBilgisayar.setAd("Bilgisayar");
        MasatenisiEndustri.setAd("Endustri");
        MasatenisiElektronik.setAd("Elektronik");
        MasatenisiJeofizik.setAd("Jeofizik");
        MasatenisiInsaat.setAd("Insaat");
        MasatenisiMaden.setAd("Maden");
        MasatenisiCevre.setAd("Cevre");
        MasatenisiMakine.setAd("Makine");
        MasatenisiTekstil.setAd("Tekstil");
        MasatenisiJeoloji.setAd("Jeoloji");
        MasatenisiMalzeme.setAd("Malzeme");

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
                Fikstur0[i] =Hakem.MasatenisiMacYap(Takım1,Takım2);
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
                Fikstur1[i] =Hakem.MasatenisiMacYap(Takım1,Takım2);
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
                Fikstur2[i] =Hakem.MasatenisiMacYap(Takım1,Takım2);
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
        Fikstur3[0] =Hakem.MasatenisiMacYap(Takımlar3[0],Takımlar3[1]);

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

        for(int x=0;x<11;x++) { ///////ilk başlangıç herkes 0. turda
            ToplamSkor[x]=Takımlar[x].ToplamSkor;
        }
        for(int x=0;x<11;x++) { ///////ilk başlangıç herkes 0. turda
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

            String asd="Masa Tenisi Turnuvası Sampiyonu :";
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
                textViewBir.setText(bos);
                textViewIki.setText(bos);
                textViewUc.setText(bos);
                textViewBes.setText(bos);
                textViewAltı.setText(bos);
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

