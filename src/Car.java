public class Car extends Vehicle {
    private boolean airConditioningStatus;

    public Car(String name, double engineCapacity, double averageFuelConsumption, boolean airConditioningStatus) {
        super(name, engineCapacity, averageFuelConsumption);
        this.airConditioningStatus = airConditioningStatus;
    }

    public boolean isAirConditioningStatus() {
        return airConditioningStatus;
    }

    public void setAirConditioningStatus(boolean airConditioningStatus) {
        this.airConditioningStatus = airConditioningStatus;
    }

    public boolean getAirConditioningStatus(){
        return airConditioningStatus;
    }

    @Override
    public double calculateFuelConsumption() {
        if (airConditioningStatus)
            return getAverageFuelConsumption() + 0.8;
        else return 0;
    }

    @Override
    public String toString() {
        return super.toString() + "Air Conditioning Status: " + airConditioningStatus + "\n";
    }
}
