package com.bakan.turnuva;

import java.util.Random;

/**
 * Created by BAKAN on 4.05.2018.
 */

public class Oyuncu extends Takım{
   /* String Ad;
    String Bolum;
    int Skor;
    int ToplamSkor;
    int Avaraj;
    int Tur;
    boolean Kazandı;


    Oyuncu(){
    }

    public Oyuncu(String ad, String bolum, int skor,int toplamSkor,int avaraj, int tur, boolean kazandı) {
        Ad = ad;
        Bolum = bolum;
        Skor = skor;
        Avaraj=avaraj;
        Tur = tur;
        Kazandı=kazandı;
        ToplamSkor=toplamSkor;
    }



    public void setAd(String ad) {
        Ad = ad;
    }

    public void setBolum(String bolum) {
        Bolum = bolum;
    }

    public void setSkor(int skor) {
        Skor = skor;
    }

    public String getAd() {

        return Ad;
    }

    public String getBolum() {
        return Bolum;
    }

    public int getSkor() {
        return Skor;
    }
    public int getToplamSkor() {
        return ToplamSkor;
    }

    public void setToplamSkor(int toplamSkor) {
        ToplamSkor = toplamSkor;
    }

    public int getAvaraj() {
        return Avaraj;
    }

    public void setAvaraj(int avaraj) {
        Avaraj = avaraj;
    }

    public int getTur() {
        return Tur;
    }

    public void setTur(int tur) {
        Tur = tur;
    }

    public boolean getKazandı() {
        return Kazandı;
    }

    public void setKazandı(int tur) {
        Tur = tur;
    }

    Random SayıUret=new Random();



    public String FutbolMacYap(Oyuncu Takım1, Oyuncu Takım2){

        Takım1.Skor=SayıUret.nextInt(10);
        Takım2.Skor=SayıUret.nextInt(10);
        if (Takım1.Skor==Takım2.Skor){
            ++Takım1.Skor;
        }
       if (Takım1.Skor>Takım2.Skor){
            Takım1.Kazandı=true;
            Takım2.Kazandı=false;
            Takım1.Tur++;
        }
       if (Takım2.Skor>Takım1.Skor){
            Takım2.Kazandı=true;
            Takım1.Kazandı=false;
            Takım2.Tur++;
        }
        Takım1.ToplamSkor=Takım1.ToplamSkor+Takım1.Skor;
        Takım2.ToplamSkor=Takım2.ToplamSkor+Takım2.Skor;

        Takım1.Avaraj=Takım1.Avaraj+Takım1.Skor-Takım2.Skor;
        Takım2.Avaraj=Takım2.Avaraj+Takım2.Skor-Takım1.Skor;


        String Sonuc= Takım1.Ad+" - "+ Takım2.Ad+": "+Takım1.Skor+" - "+Takım2.Skor;
    return Sonuc;

    }
    public String BasketbolMacYap(Oyuncu Takım1, Oyuncu Takım2){

        Takım1.Skor=50+SayıUret.nextInt(30);
        Takım2.Skor=50+SayıUret.nextInt(30);
        if (Takım1.Skor==Takım2.Skor){
            ++Takım1.Skor;
        }
        if (Takım1.Skor>Takım2.Skor){
            Takım1.Kazandı=true;
            Takım2.Kazandı=false;
            Takım1.Tur++;
        }
        if (Takım2.Skor>Takım1.Skor){
            Takım2.Kazandı=true;
            Takım1.Kazandı=false;
            Takım2.Tur++;
        }
        Takım1.ToplamSkor=Takım1.ToplamSkor+Takım1.Skor;
        Takım2.ToplamSkor=Takım2.ToplamSkor+Takım2.Skor;

        Takım1.Avaraj=Takım1.Avaraj+Takım1.Skor-Takım2.Skor;
        Takım2.Avaraj=Takım2.Avaraj+Takım2.Skor-Takım1.Skor;


        String Sonuc= Takım1.Ad+" - "+ Takım2.Ad+": "+Takım1.Skor+" - "+Takım2.Skor;
        return Sonuc;

    }
    public String HentbolMacYap(Oyuncu Takım1, Oyuncu Takım2){

        Takım1.Skor=50+SayıUret.nextInt(30);
        Takım2.Skor=50+SayıUret.nextInt(30);
        if (Takım1.Skor==Takım2.Skor){
            ++Takım1.Skor;
        }
        if (Takım1.Skor>Takım2.Skor){
            Takım1.Kazandı=true;
            Takım2.Kazandı=false;
            Takım1.Tur++;
        }
        if (Takım2.Skor>Takım1.Skor){
            Takım2.Kazandı=true;
            Takım1.Kazandı=false;
            Takım2.Tur++;
        }
        Takım1.ToplamSkor=Takım1.ToplamSkor+Takım1.Skor;
        Takım2.ToplamSkor=Takım2.ToplamSkor+Takım2.Skor;

        Takım1.Avaraj=Takım1.Avaraj+Takım1.Skor-Takım2.Skor;
        Takım2.Avaraj=Takım2.Avaraj+Takım2.Skor-Takım1.Skor;


        String Sonuc= Takım1.Ad+" - "+ Takım2.Ad+": "+Takım1.Skor+" - "+Takım2.Skor;
        return Sonuc;

    }
    public String VoleybolMacYap(Oyuncu Takım1, Oyuncu Takım2){

        Takım1.Skor=SayıUret.nextInt(5);
        Takım2.Skor=SayıUret.nextInt(5);
        if (Takım1.Skor==Takım2.Skor){
            ++Takım1.Skor;
        }
        if (Takım1.Skor>Takım2.Skor){
            Takım1.Kazandı=true;
            Takım2.Kazandı=false;
            Takım1.Tur++;
            Takım1.Skor=5;
        }
        if (Takım2.Skor>Takım1.Skor){
            Takım2.Kazandı=true;
            Takım1.Kazandı=false;
            Takım2.Tur++;
            Takım2.Skor=5;
        }
        Takım1.ToplamSkor=Takım1.ToplamSkor+Takım1.Skor;
        Takım2.ToplamSkor=Takım2.ToplamSkor+Takım2.Skor;

        Takım1.Avaraj=Takım1.Avaraj+Takım1.Skor-Takım2.Skor;
        Takım2.Avaraj=Takım2.Avaraj+Takım2.Skor-Takım1.Skor;


        String Sonuc= Takım1.Ad+" - "+ Takım2.Ad+": "+Takım1.Skor+" - "+Takım2.Skor;
        return Sonuc;
    }
    public String MasatenisiMacYap(Oyuncu Takım1, Oyuncu Takım2){

        Takım1.Skor=SayıUret.nextInt(5);
        Takım2.Skor=SayıUret.nextInt(5);
        if (Takım1.Skor==Takım2.Skor){
            ++Takım1.Skor;
        }
        if (Takım1.Skor>Takım2.Skor){
            Takım1.Kazandı=true;
            Takım2.Kazandı=false;
            Takım1.Tur++;
            Takım1.Skor=5;
        }
        if (Takım2.Skor>Takım1.Skor){
            Takım2.Kazandı=true;
            Takım1.Kazandı=false;
            Takım2.Tur++;
            Takım2.Skor=5;
        }
        Takım1.ToplamSkor=Takım1.ToplamSkor+Takım1.Skor;
        Takım2.ToplamSkor=Takım2.ToplamSkor+Takım2.Skor;

        Takım1.Avaraj=Takım1.Avaraj+Takım1.Skor-Takım2.Skor;
        Takım2.Avaraj=Takım2.Avaraj+Takım2.Skor-Takım1.Skor;


        String Sonuc= Takım1.Ad+" - "+ Takım2.Ad+": "+Takım1.Skor+" - "+Takım2.Skor;
        return Sonuc;

    }
    public int RandomSayı(){

        int a=SayıUret.nextInt(11);
        return a;
    }
    public int RandomSayı1(){

        int a=SayıUret.nextInt(6);
        return a;
    }
    public int RandomSayı2(){

        int a=SayıUret.nextInt(3);
        return a;
    }
*/
}

