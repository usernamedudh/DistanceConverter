package app;

public class Main {
    public static void main(String[] args) {
        System.out.println("Конвертер відстані: милі - кілометри");
        System.out.println("10 миль = " + milesToKm(10) + " км");
        System.out.println("16 км = " + kmToMiles(16) + " миль");

    }

    public static double milesToKm(double miles) {
        return miles * 1.60934;
    }

    public static double kmToMiles(double km) {
        return km / 1.60934;
    }
}
