
public class Ogrenci {

    public static int notGetirS(int not) {

        return not*not;
    }
     static void notGetirStatic(int not) {

        if (not < 100 & not > 90) {
            System.out.println("Alınan not 90");
        }
        

    }

    public int notGetirN(int not) {

        return not/2;
    }

    void notGetir(int not) {

        if (not < 100 & not > 90) {
            System.out.println("Alınan not  =" + not);
        }else{
            
            System.out.println("Dersten kaldınız");
        }

    }

   
    
    
    
    public static void main(String[] args) {
        
  
        
        Ogrenci ogrenci = new Ogrenci();
        Ogrenci ogrenci1 = new Ogrenci();
        Ogrenci ogrenci2 = new Ogrenci();
        Ogrenci ogrenci3 = new Ogrenci();
        
        ogrenci.notGetir(94);
        ogrenci1.notGetir(77);
        ogrenci2.notGetir(80);
        ogrenci3.notGetir(99);
        
        
      
        
        
    }

}
