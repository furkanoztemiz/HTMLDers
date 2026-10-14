// Araba sınıfını tanımla

class Araba {

    // Sınıfın özellikleri (alanları)
    String marka;
    String model;
    int uretimYili;

    public Araba(String marka, String model, int uretimYili) {
        this.marka = marka;
        this.model = model;
        this.uretimYili = uretimYili;
    }
    
    
    

    // Sınıfın metotları
    void calistir() {
        System.out.println("Araba çalıştı.");
    }

    void durdur() {
        System.out.println("Araba durdu.");
    }

    void bilgileriGoster() {
        System.out.println("Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Üretim Yılı: " + uretimYili);
    }
}

public class ArabaApp {

    public static void main(String[] args) {
        // Araba sınıfından bir nesne (örnek) oluştur
        Araba araba1 = new Araba("Mercedes", "E class ", 2020);

        // Nesnenin özelliklerini ayarla
//        araba1.marka = "Toyota";
//        araba1.model = "Corolla";
//        araba1.uretimYili = 2022;

        // Arabayı çalıştır
        araba1.calistir();

        // Araba hakkında bilgi göster
        araba1.bilgileriGoster();

        // Arabayı durdur
        araba1.durdur();
    }
}
