package schoolname.com;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        do {
           System.out.println("Enter an Odd Number: ");
            s = new Scanner(System.in);
            int max = s.nextInt();
            int space = (max - 1) / 2;
            int p = 1;
            int newSpace = 0;
            int newP = max;

            for (int i = 0; i < max; i++) {
                printSpacedColumn(space, p);


                if (i >= (max / 2)) {
                    space += 1;
                } else {
                    space -= 1;
                }

                if (i < (max / 2)) {
                    p += 2;
                } else {
                    p -= 2;
                }
                //space = Math.abs(space);
            }

            System.out.println("****************************************************************************************");

            for (int j = 0; j < max; j++) {
                newPrintSpacedColumn(newSpace, newP);
                newSpace += 1;
                newP -= 2;
            }
        } while ((s.nextInt() % 2) != 0);
    }


    public static void printColumn(int col){
        for(int i = 0; i < col; i ++){
            System.out.print("# ");
        }
        System.out.println();
    }

    public static void printSpacedColumn(int skip, int print){
        for(int i = 0; i < skip; i++){
            System.out.print("  ");
        }
        printColumn(print);
    }

    public static void newPrintSpacedColumn(int skip, int print) {
        for (int i = 0; i < skip; i++) {
            System.out.print("  ");
        }
        printColumn(print);
    }

    public static void spacedColumnAfter(int skip, int print) {
        for (int i = 0; i < skip; i++) {
            System.out.print("  ");
        }
        printColumn(print);
    }
}
/*  //Number 1
        for(short a = 5; a >= 1; a--){
            for(short b = 1; b <= a; b++){
                System.out.print("# ");
            }
            System.out.println();
        }

        System.out.println("\n");
        //Number 2
        short z = 0;
        for(short c = 1; c <= 2; c++, z =0){
            for(short e = 1; e <= (3 - c); e++){
                System.out.print("  ");
            }
            while(z != 2 * c - 1){
                System.out.print("# ");
                z++;
            }
            System.out.println();
        }
        for (short k = 3; k >= 1; k--){
            for (short l = 1; l <= (3-k); l++){
                System.out.print("  ");
            }
            for(short m = k; m <= 2 * k - 1; m++){
                System.out.print("# ");
            }
            for(short m = 0; m < k - 1; m++) {
                System.out.print("# ");
            }
            System.out.println();
        }

        System.out.println("\n");
        //Number 3
        short d = 0;
        for(short c = 1; c <= 3; c++, d =0){
            for(short e = 1; e <= (3 - c); e++){
                System.out.print("  ");
            }
            while(d != 2 * c - 1){
                System.out.print("# ");
                d++;
            }
            System.out.println();
        }

        System.out.println("\n");
        //Number 4
        for(short i = 1; i <=5; i++){
	        for(short j = 1; j <= i; j++){
	            System.out.print("# ");
        }
        System.out.println();
    }

        System.out.println("\n");
        //Number 5
        for (short k = 3; k >= 1; k--){
            for (short l = 1; l <= (3-k); l++){
                System.out.print("  ");
            }
            for(short m = k; m <= 2 * k - 1; m++){
                System.out.print("# ");
            }
            for(short m = 0; m < k - 1; m++) {
                System.out.print("# ");
            }
            System.out.println();
        }
        */