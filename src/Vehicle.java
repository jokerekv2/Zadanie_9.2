public abstract class Vehicle {
    private String name;
    private double engineCapacity;
    private double averageFuelConsumption;

    public Vehicle(String name, double engineCapacity, double averageFuelConsumption) {
        this.name = name;
        this.engineCapacity = engineCapacity;
        this.averageFuelConsumption = averageFuelConsumption;
    }

    public abstract double calculateFuelConsumption();

    public abstract boolean getAirConditioningStatus();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public double getAverageFuelConsumption() {
        return averageFuelConsumption;
    }

    public void setAverageFuelConsumption(double averageFuelConsumption) {
        this.averageFuelConsumption = averageFuelConsumption;
    }


    @Override
    public String toString() {
        return "Name: " + name + "\n" + "Engine Capacity: " + engineCapacity + "\n" +
                "Average Fuel Consumption: " + averageFuelConsumption + "\n";
    }
}
