package Kalıtım;

public class InheritanceExample {

    public static void main(String[] args) {

        Araba araba = new Araba(5, "Mercede", 2021);
        Bisiklet bisiklet = new Bisiklet(18, "Salcano", 2000);
        
        
     
        araba.calistir();
        araba.hareketEt();
        araba.frenYap();
        araba.durdur();
        araba.arababilgiGoster();
        
        System.out.println("Bisiklet süreci");
        bisiklet.calistir();
        bisiklet.hareketEt();
        bisiklet.frenYap();
        bisiklet.durdur();
        bisiklet.zil();
        bisiklet.biskletBilgiGöster();
        
        
        
        
        
        
    }

}
