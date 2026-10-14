
package ATM;


public interface ATMService {
    
    void bakiyeSor(Musteri musteri);
    void bilgiGetir(Musteri musteri);
    void paraCek(Musteri musteri,int tutar);
    void paraYatir(Musteri musteri, int tutar);
    void paraTransfer(Musteri paraGonderen, Musteri paraAlan, int tutar);
    void sifreIslemleri(Musteri musteri);
    
    
}
