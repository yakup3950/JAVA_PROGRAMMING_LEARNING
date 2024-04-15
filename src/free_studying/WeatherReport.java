package free_studying;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

/*
WeatherReport [ArrayList, loop, operators]

    Create a program that will define an ArrayList of recent temperatures. There is always extreme temperatures so to get a better reading of the data remove the highest 2 and lowest 2 temperatures. Then give the following information based on the temperature:

        max temperature, min temperature, median (middle temperature), mean (average temperature)

        also, give a prediction temperature range for the next few days by using the average and both adding and subtracting 5 to create the range. The values for this predication can be whole numbers

        we can assume the amount of data will always be an odd number so there will be one median

    Ex:
        input:
            62.1, 68.9, 55.4, 44.8, 77.3, 43.0, 53.4, 47.1, 55.8, 42.3, 48.5

            // excluded:  42.3, 43.0, 68.9, 77.3
            // data sample: 44.8, 47.1, 48.5, 53.4, 55.4, 55.8, 62.1

        output:
            max: 62.1
            min: 44.8
            median: 53.4
            mean: 52.44
            predication: 47 - 57
 */
public class WeatherReport {
    public static void main(String[] args) {

//        ArrayList<Double> tempreture = new ArrayList<>(Arrays.asList(new Double[]{62.1, 68.9, 55.4, 44.8, 77.3, 43.0, 53.4, 47.1, 55.8, 42.3, 48.5}));

        double lowerBound = 50.00;
        double upperBound = 100.00;

        Random random = new Random();

        ArrayList<Double> tempreture = new ArrayList<>();
        int count = 0;

        do {
            double randomTemp = (random.nextInt((int) ((upperBound - lowerBound + 0.01) * 100)) + lowerBound * 100) / 100.0;

            tempreture.add(randomTemp);
            count++;

        } while (count < 11);

        //i    0     1     2     3     4     5     6     7    8     9     10  --> count0
        //   42.3, 43.0, 44.8, 47.1, 48.5, 53.4, 55.4, 55.8, 62.1, 68.9, 77.3
        //     -     0     1     2     3     4     5     6     7     8     9  --> count1  "O" INDEX IS SLIDING

        System.out.println("NORMAL : " + tempreture);
        Collections.sort(tempreture);
        System.out.println("SORTED : " + tempreture);

        //METHODS
        System.out.println("EXCLUDED : " + getExcluded(tempreture));
        System.out.println("DATA SAMPLE : " + getTempreture(tempreture));
        System.out.println("MIN : " + getMin(tempreture));
        System.out.println("MAX : " + getMax(tempreture));
        System.out.println("MEDIAN(MIDDLE) : " + (getMax(tempreture) + getMin(tempreture)) / 2);
        System.out.println("MEAN(AVERAGE) : " + (getMean(tempreture)));
        double average = getMean(tempreture);
        System.out.println("PREDICATION : " + (predication(average)));

    }

    public static ArrayList<Double> getTempreture(ArrayList<Double> tempreture) {

        Collections.sort(tempreture);

        int count1 = 0;

        int count0 = 0;

        for (int i = 0; i < tempreture.size(); i++) {

            if (count0 < 2) {

                tempreture.remove(tempreture.get(i));
                --i; //WHEN REMOVED. INDEXES ARE SLIDING. TO KEEP THE INDEX AT "0" DECREASING THE NEXT VALUE-
                count0++;

            }
        }

        while (count1 < 2) {

                tempreture.remove(tempreture.get(tempreture.size() - 1));

            count1++;
        }

        return tempreture;
    }

    public static ArrayList<Double> getExcluded(ArrayList<Double> tempreture) {

        Collections.sort(tempreture);

        ArrayList<Double> excluded = new ArrayList<>();

        int count0 = 0;

        for (int i = 0; i < tempreture.size(); i++) {

            if (count0 < 2) {
                excluded.add(tempreture.get(i));

                count0++;

            }
        }

        int count1 = tempreture.size();
        int count2 = 0;
        while (count1 > tempreture.size() - 2) {

            if (count2 < 2) {

                excluded.add((tempreture.get(count1 - 1)));

                count1--;
                count2++;

            }
        }

        return excluded;
    }

    public static Double getMin(ArrayList<Double> tempreture) {

        Collections.sort(tempreture);

        int count0 = 0;
        Double min = 0.0;

        for (int i = 0; i < tempreture.size(); i++) {

            if (count0 < 1) {

                min = tempreture.get(i);
                --i; //WHEN REMOVED. INDEXES ARE SLIDING. TO KEEP THE INDEX AT "0" DECREASING THE NEXT VALUE-
                count0++;

            }
        }

        return min;
    }

    public static Double getMax(ArrayList<Double> tempreture) {

        Collections.sort(tempreture);

        Double max = 0.0;
        int count = 0;

        while (count < 1) {

            if (count < 2) {

                max = tempreture.get(tempreture.size() - 1);

                count++;
            }
        }
        return max;
}

    public static double getMean(ArrayList<Double> tempreture) {


        Double mean = 0.0;
        double sum = 0.0;

        for (int i = 0; i < tempreture.size(); i++) {

            sum += tempreture.get(i);

            mean = sum / tempreture.size();

        }
        return mean;
    }

    public static String predication(double average) {

        String predication;

        double predicationLow = average - 5;
        double predicationHigh = average + 5;

//                Double predication1 = Double.valueOf(predicationLow);
//                Double predication2 = Double.valueOf(predicationHigh);

        double predication1 = Math.round(predicationLow);
        double predication2 = Math.round(predicationHigh);

        predication = "Low : " + predication1 + " - High : " + predication2;

        return predication;
    }

}















