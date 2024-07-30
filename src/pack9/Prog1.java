package pack9;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class Prog1 {
    public static void main(String[] args) {
        pattern6(5);
    }


    /*
    *
    * *
    * * *
    * * * *
    * */
    private static void pattern1(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void pattern2(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void pattern3(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5
    * */

    private static void pattern4(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col +" ");
            }
            System.out.println();
        }
    }

    /*
     *
     **
     ***
     ****
     *****
     ****
     ***
     **
     *
    * */

    private static void pattern5(int n){
        for (int row = 1; row < n * 2; row++) {
            int totalColumnCount = row > n ? (2 * n  - row) : row;

            for (int col = 1; col <= totalColumnCount; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
     ----*
     ---**
     --***
     -****
     *****
     * */

    private static void pattern6(int n){
        for (int row = 1; row <= n; row++) {

            int slaces = n - row;
            for (int i = 0; i <= slaces; i++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();

            ZoneId.getAvailableZoneIds().forEach(System.out::println);


            LocalDateTime localDateTime = LocalDateTime.now();
            LocalTime localTime = localDateTime.atZone(ZoneId.of("Asia/Dubai")).toLocalTime();
            System.out.println(localTime);
        }
    }


}
