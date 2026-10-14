
public class Walkman {

   public int volume;
    public String muzikAdi;
    public int deger;
    public Walkman(int volume, String muzikAdi, int deger) {
        this.volume = volume;
        this.muzikAdi = "muzikAdi";
        this.deger = deger;
    }

    public Walkman() {
        
        this.volume = 50;
        this.muzikAdi = "CanDostum";
    }
    
    
    public static void main(String[] args) {
        
     
        Walkman nesne = new Walkman(44, "Asd");
        System.out.println(nesne.volume);
        System.out.println(nesne.muzikAdi);
    }
    
    
            
            

}