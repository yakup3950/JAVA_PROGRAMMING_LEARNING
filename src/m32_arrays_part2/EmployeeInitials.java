package m32_arrays_part2;

import java.util.Arrays;
public class EmployeeInitials {
    public static void main(String[] args) {

        String[] employee = {"Yakup Coskun", "Huriye Coskun", "Duygu Coskun", "Arzu Coskun", "Minik Kus", "Koca Kaplan"};

            String[] init = nameInitials(employee);
            System.out.println(Arrays.toString(init));
    }
    public static String[] nameInitials(String[] employee) {

        String first = "", second = "";
        String[] initials = new String[employee.length];

        for (int i = 0, j=0; i < employee.length; i++, j++) {

            first = employee[i].substring(0, 1);
            second = employee[i].substring(employee[i].indexOf(" ") + 1, employee[i].indexOf(" ") + 2);

                initials[j] = first + second;
        }
        return initials;
    }
}
