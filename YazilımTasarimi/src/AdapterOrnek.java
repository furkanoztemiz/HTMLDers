// Hedef Arabirim
interface FahrenheitProvider {
    double getTemperatureInFahrenheit();
}

// Hedef Arabirimini Gerçekleştiren Sınıf
class CelsiusTemperatureProvider {
    private double temperatureInCelsius;

    public CelsiusTemperatureProvider(double temperatureInCelsius) {
        this.temperatureInCelsius = temperatureInCelsius;
    }

    public double getTemperatureInCelsius() {
        return temperatureInCelsius;
    }
}

// Adaptör Sınıfı
class TemperatureAdapter implements FahrenheitProvider {
    private CelsiusTemperatureProvider celsiusTemperatureProvider;

    public TemperatureAdapter(CelsiusTemperatureProvider celsiusTemperatureProvider) {
        this.celsiusTemperatureProvider = celsiusTemperatureProvider;
    }

    @Override
    public double getTemperatureInFahrenheit() {
        // Celsius sıcaklığını Fahrenheit'a çevirme formülü
        return (celsiusTemperatureProvider.getTemperatureInCelsius() * 9 / 5) + 32;
    }
}

// Kullanım
public class AdapterOrnek {
    public static void main(String[] args) {
        // CelsiusTemperatureProvider kullanımı
        CelsiusTemperatureProvider celsiusProvider = new CelsiusTemperatureProvider(30);
        System.out.println("Celsius Sıcaklık: " + celsiusProvider.getTemperatureInCelsius() + " °C");

        // TemperatureAdapter kullanımı
        TemperatureAdapter adapter = new TemperatureAdapter(celsiusProvider);
        System.out.println("\nFahrenheit Adapter:");
        System.out.println("Fahrenheit Sıcaklık: " + adapter.getTemperatureInFahrenheit() + " °F");
    }
}
