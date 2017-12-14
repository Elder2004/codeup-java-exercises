import java.util.Random;
public class ServerNameGenerator {

    public static void main(String[] args){

        String[] myAdjectives = {"Peace","Season", "Christmas", "Thanksgiving","Autumn", "Winter","Summer","Rain","Picnics", "Camping"};
        String[] myNouns = {"Direction","Forward", "Behind", "Slowing Down", "BreakTime","Going","Thoughtful","Fellowship", "Understanding", "Wisdom"};
        Random  random = new Random();
        int index =  random.nextInt(myAdjectives.length);
        int index2 =  random.nextInt(myNouns.length);
        System.out.print("What time it is:  ");
        System.out.println(myAdjectives[index] + "-" +(myNouns[index2]));

    }

    }


