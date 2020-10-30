public class Truck extends Car {
    private double loadWeight;

    public Truck(String name, double engineCapacity, double averageFuelConsumption, boolean airConditioningStatus, double loadWeight) {
        super(name, engineCapacity, averageFuelConsumption, airConditioningStatus);
        this.loadWeight = loadWeight;
    }

    public double getLoadWeight() {
        return loadWeight;
    }

    public void setLoadWeight(double loadWeight) {
        this.loadWeight = loadWeight;
    }

    @Override
    public double calculateFuelConsumption() {
        int counter = (int) (loadWeight / 100);
        if (getAirConditioningStatus())
            return getAverageFuelConsumption() + 1.6 + 0.5 * counter;
        else if (!getAirConditioningStatus())
            return getAverageFuelConsumption() + 0.5 * counter;
        else
            return 0;
    }

    @Override
    public String toString() {
        return super.toString() + "Loaded Weight: " + loadWeight + "\n";
    }
}
