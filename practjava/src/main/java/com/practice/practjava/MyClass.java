package com.practice.practjava;

public class MyClass {

    public static void main(String[] args) {
        int n = 4;
        hourGlassHollow(n);
    }


    private static void hourGlassHollow(int n) {
        for (int r = 0; r <= 2 * n; r++) {
            int totalCol = r > n ? 2 * n - r : r;
            for (int s = 0; s < totalCol; s++) {
                System.out.print(" ");
            }
            for (int c = n; c >= totalCol; c--) {
                System.out.printf("rr "+c);
            //   if(c== totalCol) {
                   System.out.print("* ");
             //  } else{
              //     System.out.print(" ");
            //   }
            }
            System.out.println();
        }
    }

    private static void hourGlass(int n) {
        for (int r = 0; r <= 2*n; r++) {
            int totalCol =r> n ? 2*n -r : r;
            for (int s = 0; s < totalCol; s++) {
                System.out.print(" ");
            }
            for (int c = n; c >= totalCol; c--) {
                System.out.print("* ");
            }
            System.out.println();
        }

/*
* * * * *
 * * * *
  * * *
   * *
    *
   * *
  * * *
 * * * *
* * * * *
*/

    }
    private static void pattern10(int n) {
        int original = n;
        n = n*2;
        for (int r = 0; r <= n; r++) {
            for (int c = 0; c <= n; c++) {
               int minVal = original -Math.min(Math.min(r,c),Math.min(n-r, n-c));
                System.out.print(minVal +" ");
            }
            System.out.println();
        }
    }

    private static void pattern9(int n) {
        for (int r = 1; r <= n * 2; r++) {
            int totalCol = r > n ? n * 2 - r : r;
            for (int s = 0; s < n - totalCol; s++) {
                System.out.print("  ");
            }
            for (int c = totalCol; c >= 1; c--) { //decreasing
                if (c == totalCol) {
                    System.out.print(c + " ");
                } else {
                    System.out.print("  ");
                }
            }
            for (int c = 2; c <= totalCol; c++) { //increasing from mid
                if (c == totalCol) {
                    System.out.print(c + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        /*
        1
      2   2
    3       3
  4           4
5               5
  4           4
    3       3
      2   2
        1
        * */
    }
    private static void pattern8(int n) {
        for (int r = 1; r <= n * 2; r++) {

            int totalCol = r > n ? n * 2 - r : r;
            for (int s = 0; s < n - totalCol; s++) {
                System.out.print("  ");
            }
            for (int c = totalCol; c >= 1; c--) { //decreasing
                System.out.print(c + " ");
            }
            for (int c = 2; c <= totalCol; c++) { //increasing from mid
                System.out.print(c + " ");
            }
            System.out.println();
        }

        /*
        1
      2 1 2
    3 2 1 2 3
  4 3 2 1 2 3 4
5 4 3 2 1 2 3 4 5
  4 3 2 1 2 3 4
    3 2 1 2 3
      2 1 2
        1
        * */
    }


    private static void pattern7(int n) {
        for (int r = 1; r <= n; r++) {
            for (int s = 0; s < n-r; s++) {
                System.out.print("  ");
            }
            for (int c = r; c >= 1; c--) { //decreasing
                System.out.print(c+" ");
            }
            for (int c = 2; c <= r; c++) { //increasing from mid
                System.out.print(c+" ");
            }
            System.out.println();
        }
        /*
     1
   2 1 2
  3 2 1 2 3
 4 3 2 1 2 3 4
5 4 3 2 1 2 3 4 5
        * */
    }

    private static void pattern6(int n) {
        int counter = 1;
        for (int r = 0; r < 2 * n; r++) {
            int totalColInRow = r > n ? 2 * n - r : r;

            for (int s = 0; s < n - totalColInRow; s++) {
                System.out.print(" ");
            }
            for (int c = 0; c < totalColInRow; c++) {
                System.out.print(" " +counter++);
            }
            System.out.println("");
        }
    }

    private static void pattern5(int n) {
        for (int r = 0; r < 2 * n; r++) {
            int totalColInRow = r > n ? 2 * n - r : r;

            for (int s = 0; s < n - totalColInRow; s++) {
                System.out.print(" ");
            }
            for (int c = 0; c < totalColInRow; c++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

   /*
        Diamond
    *
   * *
  * * *
 * * * *
* * * * *
 * * * *
  * * *
   * *
    *

    */
    }


    private static void pattern4(int n) {
        for (int r = 0; r < 2*n; r++) {
            int totalColINRow = r> n? 2*n - r : r;
            for (int c = 0; c < totalColINRow; c++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        /*
   r  c
   1 1     *
   2 2     * *
  3 3      * * *
  4 4      * * * *
  5 5      * * * * * Formula changes after this
  6 4      * * * *
  7 3      * * *
  8 2      * *
  9 1      *
         * */
    }

    private static void pattern3(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
        /*
         *  *  *  *  *
         *  *  *  *
         *  *  *
         *  *
         *
         * */
    }

    private static void pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
        /*
         *
         *  *
         *  *  *
         *  *  *  *
         */
    }

    private static void pattern1(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        /*
         * * * * *
         * * * * *
         * * * * *
         * * * * *
         * * * * *
         * */
    }
}