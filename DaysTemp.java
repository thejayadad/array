import java.util.Scanner;

public class DaysTemp {

    public static void main(String[] args) {
        //Print the day and temperature based on user input

        double[] temperature = {33, 55, 22, 66, 77, 33, 33};
        double totalTemp = 0;
        double averageTemp = 0;
        for(int i = 0; i < temperature.length; i++){
            totalTemp += temperature[i];
            averageTemp = totalTemp / 7;


        }


        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a day of the week ");
        String response = "";
        response = scan.nextLine();
        // if(response.contains("monday")){
        //     System.out.println("Monday's Temperature: " + temperature[0]);
        // } else if(response.contains("tuesday")){
        //     System.out.println("Tuesday Temperature: " + temperature[1]);
        // } else if(response.contains("wednesday")){
        //     System.out.println("Wednesday Temperature: " + temperature[2]);
        // } else if(response.contains("thursday")){
        //     System.out.println("Thursday Temperature: " + temperature[3]);

        // } else if(response.contains("friday")){
        //     System.out.println("Friday Temperature: " + temperature[4]);
        // } else if(response.contains("saturday")){
        //     System.out.println("Saturday Temperature: " + temperature[5]);
        // } else if(response.contains("sunday")){
        //     System.out.println("Sunday Temperature: " + temperature[6]);
        // } else if(response.contains("week")){
        //     System.out.println("Weekly Average: " + averageTemp);
        // }

        switch(response){
            case "monday":
                System.out.println("Monday's Temperature: " + temperature[0]);
                break;
            case "tuesday":
                System.out.println("Tuesday Temperature: " + temperature[1]);
                break;
            case "wednesday":
                System.out.println("Wednesday Temperature: " + temperature[2]);
                break;
            case "thursday":
                System.out.println("Thursday Temperature: " + temperature[3]);
                break;
            case "friday":
                System.out.println("Friday Temperature: " + temperature[4]);
                break;
                case "saturday":
                System.out.println("Saturday Temperature: " + temperature[5]);
                break;
                case "sunday":
                System.out.println("Sunday Temperature: " + temperature[6]);
                break;
            case "week":
                System.out.println("Weekly Average: " + averageTemp);
                break;
        }




    }
}
