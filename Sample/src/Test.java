class Arac {
    void hareketEt() {
        System.out.println("Araç hareket ediyor.");
    }
}

class Araba extends Arac {
    void otomatikCam() {
        System.out.println("Otomatik cam açılıyor.");
    }
}

public class Test {
    public static void main(String[] args) {
        // Upcasting
        Arac arac = new Araba();

        // Downcasting
        if (arac instanceof Araba) {
            Araba arabam = (Araba) arac;
            arabam.otomatikCam();
        } else {
            System.out.println("Bu nesne Araba sınıfına ait değil.");
        }
    }
}
