package free_studying;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

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

        ArrayList<Double> tempreture = new ArrayList<>(Arrays.asList(new Double[]{62.1, 68.9, 55.4, 44.8, 77.3, 43.0, 53.4, 47.1, 55.8, 42.3, 48.5}));

        //i    0     1     2     3     4     5     6     7    8     9     10
        //   42.3, 43.0, 44.8, 47.1, 48.5, 53.4, 55.4, 55.8, 62.1, 68.9, 77.3
        //     -     0     1     2     3     4     5     6     7     8     9


        System.out.println("NORMAL : " + tempreture);
        Collections.sort(tempreture);
        System.out.println("SORTED : " + tempreture);

        //METHOD
        System.out.println("REMOVED : " + getTempreture(tempreture));

    }

    public static ArrayList<Double> getTempreture(ArrayList<Double> tempreture) {

        Collections.sort(tempreture);

        int count1 = 0;

        while (count1 < 2) {

            if (count1 < 2) {

                tempreture.remove(tempreture.get(tempreture.size() - 1));

            }
            count1++;
        }
        int count2 = 0;

        for (int i = 0; i < tempreture.size(); i++) {

            if (count2 < 2) {

                tempreture.remove(tempreture.get(i));

                --i; //WHEN REMOVED. INDEXES ARE SLIDING. TO KEEP THE INDEX AT "0" DECRISING THE NEXT VALUE-

                count2++;

            }
        }

        return tempreture;
    }

}











