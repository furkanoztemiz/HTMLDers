
public class Test {
    
    public static void main(String[] args) {
        
        
        Ogrenci Ahmet = new Ogrenci(22, "Ahmet ", "Yıldız", 77);
        Ogrenci Elif = new Ogrenci(19, "Elif", "Gunes", 66);
        
        
        System.out.println("Oluşturulan öğrenciye ait not bilgisi = " +  Elif.getNot() );
        Elif.setNot(99);
        System.out.println("Oluşturulan öğrenciye ait not bilgisi = " +  Elif.getNot() );
        
       
        
        
    }
    
    
    
}

