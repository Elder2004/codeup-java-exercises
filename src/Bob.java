
import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {

        while (true) {

            System.out.print("Ask Bob anything...");
            Scanner scan = new Scanner(System.in);
            String msg = scan.nextLine();
            boolean isQuestion = msg.endsWith("?");
            boolean isShouting = msg.equals(msg.toUpperCase()) || msg.endsWith("!");
            boolean isSilence = msg.trim().isEmpty();


            {

            {
                if (isQuestion) {
                    System.out.println("Sure");

                } else if (isShouting) {
                    System.out.println("Whoa, chill out!");

                } else if (isSilence) {
                    System.out.println("Fine. Be that way!");

                } else {
                    System.out.println( "Whatever");
                }
            }
    }
            }}}
