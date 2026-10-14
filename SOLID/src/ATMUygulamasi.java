import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Hesap {
    private String hesapNo;
    private String adi;
    private double bakiye;

    public Hesap(String hesapNo, String adi, double bakiye) {
        this.hesapNo = hesapNo;
        this.adi = adi;
        this.bakiye = bakiye;
    }

    public String getHesapNo() {
        return hesapNo;
    }

    public String getAdi() {
        return adi;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void paraCek(double miktar) {
        if (miktar > 0 && miktar <= bakiye) {
            bakiye -= miktar;
            System.out.println(adi + " hesabından " + miktar + " TL çekildi. Yeni bakiye: " + bakiye);
        } else {
            System.out.println("Hatalı işlem: Geçersiz miktar veya yetersiz bakiye.");
        }
    }

    public void paraYatir(double miktar) {
        if (miktar > 0) {
            bakiye += miktar;
            System.out.println(adi + " hesabına " + miktar + " TL yatırıldı. Yeni bakiye: " + bakiye);
        } else {
            System.out.println("Hatalı işlem: Geçersiz miktar.");
        }
    }

    // Fatura ödeme işlemi
    public void faturaOde(double miktar) {
        if (miktar > 0 && miktar <= bakiye) {
            bakiye -= miktar;
            System.out.println(adi + " hesabından " + miktar + " TL fatura ödendi. Yeni bakiye: " + bakiye);
        } else {
            System.out.println("Hatalı işlem: Geçersiz miktar veya yetersiz bakiye.");
        }
    }

    // Okul harcı ödeme işlemi
    public void okulHarciOde(double miktar) {
        if (miktar > 0 && miktar <= bakiye) {
            bakiye -= miktar;
            System.out.println(adi + " hesabından " + miktar + " TL okul harcı ödendi. Yeni bakiye: " + bakiye);
        } else {
            System.out.println("Hatalı işlem: Geçersiz miktar veya yetersiz bakiye.");
        }
    }
}

class ATM {
    public Map<String, Hesap> hesaplar;

    public ATM() {
        hesaplar = new HashMap<>();
    }

    public void hesapEkle(String hesapNo, String adi, double bakiye) {
        hesaplar.put(hesapNo, new Hesap(hesapNo, adi, bakiye));
    }

    public void paraCek(String hesapNo, double miktar) {
        if (hesaplar.containsKey(hesapNo)) {
            Hesap hesap = hesaplar.get(hesapNo);
            hesap.paraCek(miktar);
        } else {
            System.out.println("Hesap bulunamadı.");
        }
    }

    public void paraTransfer(String gonderenHesapNo, String alanHesapNo, double miktar) {
        if (hesaplar.containsKey(gonderenHesapNo) && hesaplar.containsKey(alanHesapNo)) {
            Hesap gonderen = hesaplar.get(gonderenHesapNo);
            Hesap alan = hesaplar.get(alanHesapNo);
            gonderen.paraCek(miktar);
            alan.paraYatir(miktar);
        } else {
            System.out.println("Hesaplar bulunamadı.");
        }
    }

    // Fatura ödeme işlemi
    public void faturaOde(String hesapNo, double miktar) {
        if (hesaplar.containsKey(hesapNo)) {
            Hesap hesap = hesaplar.get(hesapNo);
            hesap.faturaOde(miktar);
        } else {
            System.out.println("Hesap bulunamadı.");
        }
    }

    // Okul harcı ödeme işlemi
    public void okulHarciOde(String hesapNo, double miktar) {
        if (hesaplar.containsKey(hesapNo)) {
            Hesap hesap = hesaplar.get(hesapNo);
            hesap.okulHarciOde(miktar);
        } else {
            System.out.println("Hesap bulunamadı.");
        }
    }
}

public class ATMUygulamasi {
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.hesapEkle("123456", "Ahmet", 1000.0);
        atm.hesapEkle("789012", "Ayşe", 2000.0);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Para Çek");
            System.out.println("2. Para Transferi");
            System.out.println("3. Fatura Ödeme");
            System.out.println("4. Okul Harcı Ödeme");
            System.out.println("5. Bakiye Sorgula");
            System.out.println("6. Çıkış");
            System.out.print("Seçiminizi yapın: ");
            int secim = scanner.nextInt();

            if (secim == 1) {
                System.out.print("Hesap Numarasını Girin: ");
                String hesapNo = scanner.next();
                System.out.print("Çekmek İstediğiniz Miktarı Girin: ");
                double miktar = scanner.nextDouble();
                atm.paraCek(hesapNo, miktar);
            } else if (secim == 2) {
                System.out.print("Gönderen Hesap Numarasını Girin: ");
                String gonderenHesapNo = scanner.next();
                System.out.print("Alıcı Hesap Numarasını Girin: ");
                String alanHesapNo = scanner.next();
                System.out.print("Transfer Miktarını Girin: ");
                double miktar = scanner.nextDouble();
                atm.paraTransfer(gonderenHesapNo, alanHesapNo, miktar);
            } else if (secim == 3) {
                System.out.print("Hesap Numarasını Girin: ");
                String hesapNo = scanner.next();
                System.out.print("Ödenecek Fatura Miktarını Girin: ");
                double miktar = scanner.nextDouble();
                atm.faturaOde(hesapNo, miktar);
            } else if (secim == 4) {
                System.out.print("Hesap Numarasını Girin: ");
                String hesapNo = scanner.next();
                System.out.print("Ödenecek Okul Harcı Miktarını Girin: ");
                double miktar = scanner.nextDouble();
                atm.okulHarciOde(hesapNo, miktar);
            } else if (secim == 5) {
                System.out.print("Hesap Numarasını Girin: ");
                String hesapNo = scanner.next();
                if (atm.hesaplar.containsKey(hesapNo)) {
                    Hesap hesap = atm.hesaplar.get(hesapNo);
                    System.out.println(hesap.getAdi() + " hesabının bakiyesi: " + hesap.getBakiye());
                } else {
                    System.out.println("Hesap bulunamadı.");
                }
            } else if (secim == 6) {
                System.out.println("Çıkış Yapılıyor...");
                break;
            } else {
                System.out.println("Geçersiz seçim. Tekrar deneyin.");
            }
        }

        scanner.close();
    }
}
