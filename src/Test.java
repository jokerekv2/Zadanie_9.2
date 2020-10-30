public class Test {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[2];
        vehicles[0] = new Car("Zygzak", 2, 8, false);
        vehicles[1] = new Truck("Lel", 6, 14, false, 220);

        printInfo(vehicles);
        changeAirConditioningStatus(vehicles);
        printInfo(vehicles);
    }

    private static void printInfo(Vehicle[] vehicles) {
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.toString() + "Spalanie jeśli coś dodatkowo obciąża: " +
                    vehicle.calculateFuelConsumption() + "\n");
        }
    }

    private static void changeAirConditioningStatus(Vehicle[] vehicles) {
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i] instanceof Car)
                ((Car) vehicles[i]).setAirConditioningStatus(true);
            else if (vehicles[i] instanceof Truck)
                ((Truck) vehicles[i]).setAirConditioningStatus(true);
        }
    }


}
