import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//      1.

//        int userInput;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter something: ");
//        userInput = sc.nextInt();
//        System.out.println("You entered: --> \"" + userInput + "\" <--");

//        2.

        //Declare Variables

//        String name1;
//        String name2;
//        String name3;
//
//        //Accept User Imput

//        Scanner keyboard=new Scanner(System.in);
//        System.out.print("Please Enter First Name ");
//        name1=keyboard.nextLine();
//        System.out.print("Please Enter Second Name ");
//        name2=keyboard.nextLine();
//        System.out.print("Please Enter Third Name ");
//        name3=keyboard.nextLine();

//        System.out.println(name1);
//        System.out.println(name2);
//        System.out.println(name3);

//        3.

//           String mySentence;
//           Scanner keyboard=new Scanner(System.in);
//           System.out.println("Please write a sentence....");
//           mySentence=keyboard.nextLine();
//           System.out.print(mySentence);

//         4.
        System.out.print("Please enter the room length: ");
        String lengthString = sc.nextLine();
        double length = Double.parseDouble(lengthString);

        System.out.print("Please enter the room width: ");
        String widthString = sc.nextLine();
        double width = Double.parseDouble(widthString);


        double area = width * length;
        double perimeter = width * 2 + length * 2;

        System.out.printf("%.2f = %.2f x %.2f\n", area, length, width);
        System.out.printf("%.2f = 2 x %.2f + 2 x %.2f\n", perimeter, length, width);
//
    }
}

// 1. Exception in thread "main" java.util.InputMismatchException
//at java.base/java.util.Scanner.throwFor(Scanner.java:860)

//   3.do you capture all of the words? not with .next, but with  .nextline
