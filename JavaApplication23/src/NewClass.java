
public class NewClass {
    
    int ogrno;
    String isim,bolum;

    public NewClass(int ogrno, String isim, String bolum) {
        this.ogrno = ogrno;
        this.isim = isim;
        this.bolum = bolum;
    }

  
    
    
    public static void main(String[] args) {
        
        NewClass ogr1 = new NewClass(12, "Ahmet", "Yazılım");
        NewClass ogr2 = new NewClass(14, "Mehmet", "Yazılım");
        NewClass ogr3 = new NewClass(14, "Mehmet", "Yazılım");
        System.out.println(ogr1.bolum);
        
    }
}
