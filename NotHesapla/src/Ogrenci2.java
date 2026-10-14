



public class Ogrenci2 {
    int girisSenesi;
    String ogrenciAdi;
    int not;
    String bolum;

    public Ogrenci2(int girisSenesi, String ogrenciAdi, int not, String bolum) {
        this.girisSenesi = girisSenesi;
        this.ogrenciAdi = ogrenciAdi;
        this.not = not;
        this.bolum = bolum;
    }

    public Ogrenci2(String ogrenciAdi, int not, String bolum) {
        this.ogrenciAdi = ogrenciAdi;
        this.not = not;
        this.bolum = bolum;
    }

    public Ogrenci2(int not, String bolum) {
        this.not = not;
        this.bolum = bolum;
    }

    public Ogrenci2(String bolum) {
        this.bolum = bolum;
    }

    public Ogrenci2(String ogrenciAdi, String bolum) {
        this.ogrenciAdi = ogrenciAdi;
        this.bolum = bolum;
    }
    
    
    
    
    
    public static void main(String[] args) {
        Ogrenci2 ogrenci = new Ogrenci2(2022, "Furkan", 90, "Yazılım Muh");
        Ogrenci2 ogrenci2 = new Ogrenci2("Bilgisayar Mühendisliği");
        
    
    }
    
    
}
