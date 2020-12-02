public class Car implements CarbonFootPrint{
    double engineStrength;
    int petrolCapacity;
    int numberOfGears;

    public Car() {

    }

    public Car(double engineStrength, int petrolCapacity, int numberOfGears) {
        this.engineStrength = engineStrength;
        this.petrolCapacity = petrolCapacity;
        this.numberOfGears = numberOfGears;
    }

    @Override
    public Double getCarbonFootPrint() {
        return (engineStrength * petrolCapacity * numberOfGears);
    }

    @Override
    public String toString() {
        return "#==========================================#" +
                "\n\t\t\t\tCar\n" +
                "#==========================================#" +
                "\n#\t\tengineStrength=" + engineStrength +
                "\n#\t\tpetrolCapacity=" + petrolCapacity +
                "\n#\t\tnumberOfGears=" + numberOfGears +
                "\n#==========================================#";
    }
}
