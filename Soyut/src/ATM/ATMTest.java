
package ATM;

public class ATMTest {
    
    public static void main(String[] args) {
        
        Musteri musteri1 = new Musteri("Ahmet", "Yıldız", 1234, "Inonu Universitesi", 12556723, 5000,9999);
         
        Musteri musteri2 = new Musteri("Ayse", "Demir", 1111111, "TurgutÖzalÜniversitesi", 986543212, 12000, 0);
        
        
        
        
        
        ABankHizmetler ABankHizmetleri = new ABankHizmetler();
      
        
        ABankHizmetleri.paraTransfer(musteri1, musteri2, 2500);
        
        
    }
    
}
