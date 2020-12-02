public class Building implements CarbonFootPrint{
    double height;
    double storied;
    double width;

    public Building() {

    }

    public Building(double height, double storied, double width) {
        this.height = height;
        this.storied = storied;
        this.width = width;
    }

    @Override
    public Double getCarbonFootPrint() {
        return (height * storied * width);
    }

    @Override
    public String toString() {
        return "#==========================================#" +
                "\n\t\t\t\tBuilding\n" +
                "#==========================================#" +
                "\n#\t\t\t\theight=" + height +
                "\n#\t\t\t\tstoried=" + storied +
                "\n#\t\t\t\twidth=" + width +
                "\n#==========================================#";
    }
}
