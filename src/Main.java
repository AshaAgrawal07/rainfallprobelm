import java.scanner.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	int totalRain = 0;
	int counter = 0;

	while(scan.hasNext()) {
	    String rain = scan.nextString();
	    if (rain.contains("add ")) {
	        int addRain = rain.nextString(4);
	        totalRain += rain;
	        counter ++;
        } else if (rain.equalsIgnoreCase("average)")) {
	        System.out.println( totalRain/counter);
        } else if (rain.equalsIgnoreCase("clear")) {
	        totalRain = 0;
	        counter = 0;
        } else {
	        System.out.println("Sorry, don't understand: " + rain);
        }
    }

    }
}
