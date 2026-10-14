/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.yazarkasa;


class Urun{

int UrunID;
String UrunAdi;
String UrunKategori;
float UrunFiyat;
int StokAdet;

}

class Personel{
String PersonelId;
String PersonelAdi;
String PersonelBirim;


}


class Fatura{
int FaturaID;
Urun urun;
Personel personel;
String Date;
float faturaTutar;


}




public interface Yazarkasa {

void satısYap(Personel kasiyer, Urun urun);
void UrunBilgisi(Urun urun);
void zRaporu(Fatura fatura);
void faturaOlustur(Personel personel, Fatura fatura);

}


class IBMkasa implements Yazarkasa{

    @Override
    public void satısYap(Personel kasiyer, Urun urun) {
       

    }

    @Override
    public void UrunBilgisi(Urun urun) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void zRaporu(Fatura fatura) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void faturaOlustur(Personel personel, Fatura fatura) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


}


abstract class SatınAlmaBirimi{


abstract void UrunBilgisi(Urun urun);
abstract void UrunSatınAl(Personel SatınAlan, Urun AlınanUrun);
abstract void StokDurumu(Urun urun);
abstract public void IrsaliyeFatura(Urun urun);

}

