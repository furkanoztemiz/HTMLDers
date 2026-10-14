
public class Ogrenci {
    
   private int yas;
   private String Isim;
   private String Soyisim;
   private int not;

    public Ogrenci(String Isim, int not) {
        this.Isim = Isim;
        this.not = not;
    }

    public Ogrenci(String Isim) {
        this.Isim = Isim;
    }

    
    
    public Ogrenci(int yas, String Isim, String Soyisim, int not) {
        this.yas = yas;
        this.Isim = Isim;
        this.Soyisim = Soyisim;
        this.not = not;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String getIsim() {
        return Isim;
    }

    public void setIsim(String Isim) {
        this.Isim = Isim;
    }

    public String getSoyisim() {
        return Soyisim;
    }

    public void setSoyisim(String Soyisim) {
        this.Soyisim = Soyisim;
    }

    public int getNot() {
        return not;
    }

    public void setNot(int not) {
        this.not = not;
    }
    
    
    public static void main(String[] args) {
        
        Ogrenci ilkogrenci = new Ogrenci("Furkan", 100);
        
        System.out.println(ilkogrenci.getIsim());
        System.out.println(ilkogrenci.getNot());
        ilkogrenci.setIsim("Mehmet");
      System.out.println(ilkogrenci.getIsim());
        
       
        
    }
    
    
    
    
    
}





