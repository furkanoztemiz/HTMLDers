package ATM;

import java.util.Scanner;

public class ABankHizmetler implements ATMService {

    Scanner kly = new Scanner(System.in);

    public ABankHizmetler() {
    }

    @Override
    public void bakiyeSor(Musteri musteri) {

        System.out.println("İstenen müsterinin bakiyesi = " + musteri.getBakiye());

    }

    @Override
    public void bilgiGetir(Musteri musteri) {

        System.out.println("Musterinin ismi " + musteri.getIsim());
        System.out.println("Musterinin soyismi " + musteri.getSoyisim());
        System.out.println("Musterinin Numarası " + musteri.getMusteriNo());
        System.out.println("Musterinin Adresi " + musteri.getAdres());
        System.out.println("Musterinin Bakiyesi " + musteri.getBakiye());
        System.out.println("Musterinin Sifresi " + musteri.getSifre());
        System.out.println("Musterinin TC NO " + musteri.getTCNo());

    }

    @Override
    public void paraCek(Musteri musteri, int tutar) {

        musteri.setBakiye(musteri.getBakiye() - tutar);
        System.out.println("Müsteri tarafından :" + tutar + "tutar çekilmiştir. Güncel Bakiye = " + musteri.getBakiye());

    }

    @Override
    public void paraYatir(Musteri musteri, int tutar) {
        musteri.setBakiye(musteri.getBakiye() + tutar);
        System.out.println("Müsteri tarafından :" + tutar + "tutar yüklenmiştir. Güncel Bakiye = " + musteri.getBakiye());

    }

    @Override
    public void paraTransfer(Musteri paraGonderen, Musteri paraAlan, int tutar) {

        if (paraGonderen.getBakiye() >= tutar) {
            System.out.println("Transfer öncesi bakiyeler = " + "gönderenBakiye " + paraGonderen.getBakiye() + "AlanBakiye " + paraAlan.getBakiye());
            paraGonderen.setBakiye(paraGonderen.getBakiye() - tutar);
            paraAlan.setBakiye(paraAlan.getBakiye() + tutar);
            System.out.println("Transfer sonrası bakiyeler = " + "gönderenBakiye " + paraGonderen.getBakiye() + "AlanBakiye " + paraAlan.getBakiye());

        } else {
            System.out.println("Yeterli bakiye bulunmamaktadır");
        }

    }

    @Override
    public void sifreIslemleri(Musteri musteri) {

        System.out.println("mevcut şifre =" + musteri.getSifre());
        System.out.println("değiştirmek istediğiniz şifreyi giriniz");
        int guncelKey = kly.nextInt();
        musteri.setSifre(guncelKey);

    }

}
