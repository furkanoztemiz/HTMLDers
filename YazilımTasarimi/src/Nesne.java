
public class Nesne {

int deger;
String Adi;

    public Nesne(int deger, String Adi) {
        this.deger = deger;
        this.Adi = Adi;
    }

    public int getDeger() {
        return deger;
    }

    public void setDeger(int deger) {
        this.deger = deger;
    }

    public String getAdi() {
        return Adi;
    }

    public void setAdi(String Adi) {
        this.Adi = Adi;
    }

  
    public static void main(String[] args) {
        
        Nesne nesne1 = new Nesne(2, "Kalem");
        Nesne nesne2 = new Nesne(3, "Defter"); 
         Nesne nesne3 = new Nesne(4, "Silgi");
        System.out.println(nesne3.getAdi() + nesne3.getDeger());
        
        
    }
    
    
}
