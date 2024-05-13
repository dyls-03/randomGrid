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
        
        String outputString = "| ";

        for (int x = 0; x < numGrid; x++)
        {
            for (int y = 0; y < numGrid; y++)
            {
                outputString = outputString + genRand(randMin, randMax) + " | ";
            }
            
            if (x < (numGrid-1))
            { outputString = outputString + "\n| "; }
            
        }

        System.out.println(outputString);

        in.close();
    }

    public static int genRand(int min, int max)
    {
        int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);

        return random_int;
    }
}



/* Need to add:
 * - Check if grid number is greater than values avaialble, don't let program proceed if grid number is larger than randoms
 * 
 * 
 */