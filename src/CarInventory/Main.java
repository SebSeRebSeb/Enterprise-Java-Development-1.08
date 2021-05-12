package CarInventory;

public class Main {
    public static void main(String[] args) {
        Sedan CKlasse = new Sedan(33221, "Mercedes", "C-Klasse", 8_000);
        Truck GKlasse = new Truck(221133, "Mercedes", "G-Klasse", 12_000, 1_000);
        UtilityVehicle Tank = new UtilityVehicle(1122, "Wegmann", "Leopard", 500, true);

        System.out.println(GKlasse.getMake());
    }
}
