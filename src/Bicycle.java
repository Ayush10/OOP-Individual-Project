public class Bicycle implements CarbonFootPrint{
    double weight;
    double tyreAir;
    double grease;
    int numberOfSeats;

    public Bicycle() {

    }

    public Bicycle(double weight, double tyreAir, double grease, int numberOfSeats) {
        this.weight = weight;
        this.tyreAir = tyreAir;
        this.grease = grease;
        this.numberOfSeats = numberOfSeats;
    }


    @Override
    public Double getCarbonFootPrint() {
        return (weight * tyreAir * grease) / numberOfSeats;
    }

    @Override
    public String toString() {
        return "#==========================================#" +
                "\n\t\t\t\tBicycle\n" +
                "#==========================================#" +
                "\n#\t\t\t\tweight=" + weight +
                "\n#\t\t\t\ttyreAir=" + tyreAir +
                "\n#\t\t\t\tgrease=" + grease +
                "\n#\t\t\t\tnumberOfSeats=" + numberOfSeats +
                "\n#==========================================#";
    }
}
