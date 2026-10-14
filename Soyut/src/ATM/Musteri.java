/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ATM;


public class Musteri {
 private String isim,Soyisim;
 private int MusteriNo;
 private String Adres;
 private int TCNo;
 private int bakiye;
 private int sifre;

    public Musteri(String isim, String Soyisim, int MusteriNo, String Adres, int TCNo, int bakiye, int sifre) {
        this.isim = isim;
        this.Soyisim = Soyisim;
        this.MusteriNo = MusteriNo;
        this.Adres = Adres;
        this.TCNo = TCNo;
        this.bakiye = bakiye;
        this.sifre = sifre;
    }

 
 
    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return Soyisim;
    }

    public void setSoyisim(String Soyisim) {
        this.Soyisim = Soyisim;
    }

    public int getMusteriNo() {
        return MusteriNo;
    }

    public void setMusteriNo(int MusteriNo) {
        this.MusteriNo = MusteriNo;
    }

    public String getAdres() {
        return Adres;
    }

    public void setAdres(String Adres) {
        this.Adres = Adres;
    }

    public int getTCNo() {
        return TCNo;
    }

    public void setTCNo(int TCNo) {
        this.TCNo = TCNo;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }

    public int getSifre() {
        return sifre;
    }

    public void setSifre(int sifre) {
        this.sifre = sifre;
    }

    
 
 
}
