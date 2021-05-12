package CarInventory;

public class UtilityVehicle extends Car{
    public boolean hasFourWheelDrive;
    public UtilityVehicle(int vinNumber, String make, String model, int mileage, boolean hasFourWheelDrive) {
        super(vinNumber, make, model, mileage);
        this.hasFourWheelDrive = hasFourWheelDrive;
    }
    public boolean isHasFourWheelDrive() {
        return hasFourWheelDrive;
    }
}
