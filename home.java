import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello");

        System.out.println("Enter grid amount: ");
        Scanner in = new Scanner(System.in);
        String strNumGrid = in.nextLine();
        int numGrid =  Integer.parseInt(strNumGrid);
        System.out.println("You've asked for a " + numGrid + "x" + numGrid + " grid.");

        System.out.println("How many entries do you have?");
        String strNumVals = in.nextLine();
        int randMax = Integer.parseInt(strNumVals);

        int randMin = 1; // Minimum value of range

        System.out.println("Random value in int from " + randMin + " to " + randMax + ":");
        int random_int = (int) Math.floor(Math.random() * (randMax - randMin + 1) + randMin);4
        System.out.println(random_int);
    }
}