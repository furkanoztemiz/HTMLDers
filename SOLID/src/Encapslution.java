
public class Encapslution {
    private int A;
    private String isim;
    private String Soyisim;

    public Encapslution(int A, String isim, String Soyisim) {
        this.A = A;
        this.isim = isim;
        this.Soyisim = Soyisim;
    }

    public int getA() {
        return A;
    }

    public void setA(int A) {
        this.A = A;
    }

    public String getIsim() {
        return isim;
    }

    private void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return Soyisim;
    }

    public void setSoyisim(String Soyisim) {
        this.Soyisim = Soyisim;
    }
    
    
    public static void main(String[] args) {
        Encapslution ens = new Encapslution(3, "Ahmet", "Yıldız");
        
        
        System.out.println(ens.isim);
        ens.setIsim("Mehmet");
        System.out.println(ens.isim);
        
    }
    
}
