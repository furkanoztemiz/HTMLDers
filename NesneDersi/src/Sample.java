
public class Sample {

    int sayi;
    String name;
    String renk;

    public Sample(int sayi, String name, String renk) {
        this.sayi = sayi;
        this.name = name;
        this.renk = renk;
    }

    public int deneme() {

        return 0;

    }
    
    public static int yasS(){
        
         return 0;
    }

    public static void main(String[] args) {
        Sample smp = new Sample(12, "ABC", "YELLOW");
        smp.deneme();   
    }

}
