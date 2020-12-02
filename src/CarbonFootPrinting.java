import java.util.ArrayList;

public class CarbonFootPrinting {

    public static void main(String[] args) {
        int i = 0;
        ArrayList<CarbonFootPrint> list = new ArrayList<>();

        list.add(new Building(61.12, 70.003, 83.145));
        list.add(new Car(10.0054, 20, 8));
        list.add(new Bicycle(22.667, 14.15, 12.33345, 2));

        for (CarbonFootPrint carbonFootPrint: list) {
            System.out.println(list.get(i));
            System.out.printf("\tCarbonFootPrint release is: %.2f", carbonFootPrint.getCarbonFootPrint());
            if (i == 2) {
                System.out.println("#\n#==========================================#");
            }
            System.out.println();
            i++;
        }
    }
}
