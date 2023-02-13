import java.util.Arrays;
import java.util.Scanner;

public class Main {


public static void main(String[] args) {
    //Capture the the height of each player
    //Find the height of the tallest player and average of all players

    Scanner scan = new Scanner(System.in);
    int numPlayers;
    System.out.println("How many players are on the team?");
    numPlayers = scan.nextInt();
    double [] players = new double[numPlayers];

    for(int i = 0; i < numPlayers; i++){
        System.out.println("Pleasae enter player " + (i+1) +  " height in inches: ");
        double response = scan.nextDouble();
        players[i] = response;
    }
    double heightTotal = 0;
    for(int i = 0; i < players.length; i++){
        heightTotal += players[i];
    }
    double tallestPlayer = players[0];
    for(int i = 0; i < players.length; i++){
        if(tallestPlayer < players[i]){
            tallestPlayer = players[i];
        }
    }
    System.out.println(Arrays.toString(players));
    System.out.println("Total Players: " + numPlayers);
    System.out.println("Tallest Player: " + tallestPlayer);
    System.out.println("The height total is: " + heightTotal);
    double average = heightTotal / numPlayers;
    System.out.println("The teams average height is: " + average);



}


}
