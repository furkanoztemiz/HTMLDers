// Temel bileşenimiz
interface Kahve {
    String icerik();
    double fiyat();
}

// Temel bileşenin somut uygulaması
class SadeKahve implements Kahve {
    @Override
    public String icerik() {
        return "Sade Kahve";
    }

    @Override
    public double fiyat() {
        return 5.0;
    }
}

// Decorator arayüzü
interface KahveDecorator extends Kahve {
}

// Decorator'ın somut uygulaması - Süt ekleyen Decorator
class SutDecorator implements KahveDecorator {
    private Kahve kahve;

    public SutDecorator(Kahve kahve) {
        this.kahve = kahve;
    }

    @Override
    public String icerik() {
        return kahve.icerik() + ", Süt";
    }

    @Override
    public double fiyat() {
        return kahve.fiyat() + 2.0;
    }
}

// Decorator'ın somut uygulaması - Şeker ekleyen Decorator
class SekerDecorator implements KahveDecorator {
    private Kahve kahve;

    public SekerDecorator(Kahve kahve) {
        this.kahve = kahve;
    }

    @Override
    public String icerik() {
        return kahve.icerik() + ", Şeker";
    }

    @Override
    public double fiyat() {
        return kahve.fiyat() + 1.0;
    }
}

// Kullanım
public class DecoratorOrnek {
    public static void main(String[] args) {
        // Sade kahve
        Kahve sadeKahve = new SadeKahve();
        System.out.println("İçerik: " + sadeKahve.icerik());
        System.out.println("Fiyat: " + sadeKahve.fiyat());

        // Sade kahveye süt ekleme
        Kahve sutluKahve = new SutDecorator(sadeKahve);
        System.out.println("İçerik: " + sutluKahve.icerik());
        System.out.println("Fiyat: " + sutluKahve.fiyat());

        // Sade kahveye şeker ekleme
        Kahve sekerliKahve = new SekerDecorator(sadeKahve);
        System.out.println("İçerik: " + sekerliKahve.icerik());
        System.out.println("Fiyat: " + sekerliKahve.fiyat());

        // Sade kahveye süt ve şeker ekleme
        Kahve sutluSekerliKahve = new SekerDecorator(new SutDecorator(sadeKahve));
        System.out.println("İçerik: " + sutluSekerliKahve.icerik());
        System.out.println("Fiyat: " + sutluSekerliKahve.fiyat());
    }
}
