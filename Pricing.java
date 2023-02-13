import java.util.Scanner;

public class Pricing {


    public static void main(String[] args) {
        //CREATE AN ARRAY TO HOLD ORIGINAL PRICES AND DISCOUNTED PRICES AT 20%
        Scanner scan = new Scanner(System.in);
        double [][] prices = new double[5][2];

        for(int i = 0; i < 5; i ++){
            System.out.println("Original Price: ");
            prices[i][0] = scan.nextDouble();
            prices[i][1] = prices[i][0] *.80;
        }
        for(int i = 0; i < 5; i++){
            System.out.println("Item " + (i+1));
            System.out.println("Original Price: " + prices[i][0]);
            System.out.println("Discounted Price: " + prices[i][1]);
            System.out.println("");
            System.out.println("******");

        }

    }
}
