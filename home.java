import java.util.ArrayList;
import java.util.Scanner;

class HelloWorld {

    public static ArrayList<Integer> numList = new ArrayList<Integer>();
    
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

        if (randMax > numGrid)
        {
            //Setting up values
            int randMin = 1;
            numList.clear();
            int mid = numGrid/2;

            System.out.println("Random value in int from " + randMin + " to " + randMax + ":");
            
            String outputString = "| ";

            for (int x = 0; x < numGrid; x++)
            {
                for (int y = 0; y < numGrid; y++)
                {
                    boolean add = true;
                    if ((x==mid)&&(y==mid))
                    {
                        add = false;
                    }
                    outputString = outputString + genRand(randMin, randMax, numGrid, add) + " | ";
                }
                
                if (x < (numGrid-1))
                { outputString = outputString + "\n| "; }
                
            }

            System.out.println(outputString);
        }
        else
        {
            System.out.println("Number of places in grid exceeds your number of entries");
            System.out.println("Please try again");
        }

        in.close();
    }

    public static int genRand(int min, int max, int grid, boolean add)
    {
        boolean complete = false;
        int random_int = -1;
        

        while (complete == false)
        {
            random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);

            boolean temp = true;
            for (int i : numList)
            {
                if (random_int == i)
                    temp = false;
            }

            if (temp == true)
                complete = true;
        }
        
        if (add == true)
            numList.add(random_int);

        return random_int;
    }
}



/* Need to add:
 * - Loop back if exceed value
 * 
 * 
 
3x3:9 1:1
5x5:25 2:2
7x7:49 3:3

 */