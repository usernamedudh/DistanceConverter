package app;

public class Main {
    public static void main(String[] args) {
        System.out.println("Конвертер відстані: милі - кілометри");
    }

    public static double milesToKm(double miles) {
        return miles * 1.60934;
    }

    public static double kmToMiles(double km) {
        return km / 1.60934;
    }
}
