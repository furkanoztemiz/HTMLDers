
public class NewClass {

    public void NesneTopla(int a, int b) {
        System.out.println("girilen değerlerin toplamı = " + (a + b));
    }

    public int NesneToplaR(int a, int b) {
        return a + b;
    }

    public static void NesneToplaStatic(int a, int b) {

        System.out.println("girilen değerlerin toplamı = " + (a + b));

    }

    public static int NesneToplaRStatic(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        NewClass.NesneToplaStatic(55, 22);
        
     }

}
