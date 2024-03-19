package m16_loops_part1.Tasks;

public class ConversionOfSpeedTable {
    public static void main(String[] args) {
        System.out.println("KPH\t\t\t\tMPH\n___________________");
        int kilometer;
        double milePerHour;
        final int MILE = 62/100;
        for (kilometer = 20; kilometer <= 140; kilometer += 10) {
            System.out.print(kilometer);
            milePerHour = kilometer * MILE;
            System.out.println("\t\t\t\t" + milePerHour);
        }
    }
}
