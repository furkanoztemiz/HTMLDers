/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kalıtım;

public class Arac {

    private String marka;
    private int sene;

    public Arac(String marka, int sene) {
        this.marka = marka;
        this.sene = sene;
    }

    public void calistir() {
        System.out.println("Araç çalıştırıldı ");

    }

    public void durdur() {
        System.out.println("Araç durduruldu");
    }

    public void hareketEt() {
        System.out.println("Araç hareket ediyor");
    }

    public void frenYap() {
        System.out.println("Araç fren yapıyor");
    }

    public void bilgiGoster() {
        System.out.println("Marka = " + marka);
        System.out.println("Yılı  = " + sene);
    }

}