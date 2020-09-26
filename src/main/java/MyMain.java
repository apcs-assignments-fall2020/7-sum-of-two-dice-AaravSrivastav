import java.util.Scanner;

public class MyMain {

    // Rolls a single die
    // Returns a random integer between 1 and 6
    public static int rollDie() {
        // REPLACE YOUR CODE HERE
        return (int)(Math.random()*6+1);
    }

    // Rolls two dice n times
    // This method returns an int array of size 11, where each element is
    // the number of times a certain sum of two dice was rolled
    public static int[] sumOfTwoDice(int n) {
        
        int[] arr = new int[11];       
        for(int i= 0; i<n-1; i++)
        {
            int a = rollDie();
            int b = rollDie();
            int c = a+b;

            for(int j = 0; j<11; j++)
            {
                if(j==c)
                {
                    arr[c-2] = (arr[c-2] + 1);
                }
            }
        }

        return arr;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many pairs of dice would you like to roll?");
        int n = scan.nextInt();
        int[] arr = sumOfTwoDice(n);
        for(int i = 0; i<11; i++)
        {
            int num = i+2;
            double percent = ((double)(arr[i])/n)*100;
            System.out.println("% of rolls where sum == " + num + ": " + percent);
        }
        scan.close();
    }
}
