package Poly;

class Hayvan {

    public void sesCikar() {
        System.out.println("Genel hayvan sesi");
    }

}

class kopek extends Hayvan {

    @Override
    public void sesCikar() {

        System.out.println(" Hav hav");

    }

    public void oyna() {
        System.out.println("Kopek top ile oynuyor");
    }

}

class kedi extends Hayvan {

    @Override
    public void sesCikar() {

        System.out.println(" miyav miyav");

    }

    public void oyna() {
        System.out.println("Kedi ip ile oynuyor");
    }

}


class papagan extends Hayvan {

    @Override
    public void sesCikar() {

        System.out.println(" papağan konuşuyor");

    }

    public void oyna(String tekrar) {
        System.out.println("Papağan " + tekrar + "diyor");
    }

}




public class PolymorphismExample {

    public static void main(String[] args) {
        
        Hayvan hayvan = new kedi();
        
        
        
        if (hayvan instanceof papagan){
            ((papagan) hayvan).oyna("Babacık cici kuş ");
        }else if (hayvan instanceof kopek){
            ((kopek) hayvan).oyna();
        }else 
            ((kedi) hayvan).oyna();
        
    }
    
}
