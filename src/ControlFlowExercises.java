import java.util.Random;
import java.util.Scanner;
import java.util.Formatter;

public class ControlFlowExercises {
    public static void main(String[] args) {


//       1a. loops Basic

//
//        int count = 5;
//        while (count <= 15) {
//            System.out.println("Count is: " + count);
//            count++;


//          1b. Do while

//            int counter = 0;
//            do {
//                counter +=2;
//                System.out.println("Count is: " + counter);
//
//            } while (counter < 100);

//
//
//            int counter = 100;
//            do {
//                System.out.println("Count is: " + counter);
//                --counter;
//            } while (counter >= -10);


//                long counter = 2;
//                do {
//                    counter *= counter;
//                    System.out.println("Count is: " + counter);
//
//                } while (counter <= 10000);


//        for (int i = 1; i <= 100; i++) {
//            if (i % 15 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(String.valueOf(i));
//            }

//
//


        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Number to start the Power Table....");
        int start = scan.nextInt();


        System.out.println(" Here  is your Power Table!\n");
        System.out.println("number  | squared | cubed");
        System.out.println("------  | ------- | -----");

            Formatter fmt;

            for (int i = 1; i <= start; i++) {
                fmt = new Formatter();

                fmt.format("%4d    |%4d     | %4d", i, i * i, i * i * i);
                System.out.println(fmt);
            }
        System.out.println("Do you want to continue? y/n");
            String option = scan.nextLine();


        if(!option.equalsIgnoreCase("y")) {
            System.out.println("Ok, good bye");

        }



//        int  getGrade = scan.nextInt();
//        for (int i = 100; i >= 0; i--) {
//            System.out.println(i + " =  :" + getGrade (i));
        }
        }







