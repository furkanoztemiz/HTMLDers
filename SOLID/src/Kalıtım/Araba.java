/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kalıtım;


public class Araba extends Arac {

    private int kapiSayisi;

    public Araba(int kapiSayisi, String marka, int sene) {
        super(marka, sene);
        this.kapiSayisi = kapiSayisi;
    }

    @Override
    public void hareketEt() {

        System.out.println("Araba hızlı hareket ediyor");

    }

    @Override
    public void frenYap() {
        System.out.println("Araba sert fren yapıyor");

    }

    public void arababilgiGoster() {
        bilgiGoster();
        System.out.println("Arabadaki kapı sayısı =" + kapiSayisi);

    }

}