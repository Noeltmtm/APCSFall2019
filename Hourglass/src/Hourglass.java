import java.util.*;
/*Noel Lkhagvatsogt
 * 10/11/19
 * This code prints out an hourglass
 * size can be changed by adjusting the size variable
 */
public class Hourglass {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		boolean quit = false;
		while(!quit) {
			System.out.println("What size do you want the hourglass to be? ");
			String hourglassString = "";
			//size of the hourglass
			int size = userInput.nextInt();
		
			//prints very top of hourglass
			hourglassString +="|";
			for(int i = 0; i < size; i++) {
				hourglassString += "\"";
			}
			hourglassString += "| \n";
		
			//prints top half of hourglass
			for(int row = 1; row <= (size/2 -1); row++) {
				for(int spaces = 0; spaces < row; spaces++) {
					hourglassString +=" ";
				}
				hourglassString +="\\";
				for(int colon = 0; colon < -2*row +size; colon++) {
					hourglassString +=":";
				}
				hourglassString +=("/ \n");
			}
		
			//prints middle of hourglass
			for (int spaces = 0; spaces < size/2; spaces++) {
				hourglassString += (" ");
			}
			if(size % 2 ==0) {
				hourglassString +=("|| \n");
			}else {
				hourglassString +=("||| \n");
			}
		
			//prints bottom half of hourglass
			for (int row = size/2 -1; row > 0; row--) {
				for(int spaces = 0; spaces < row; spaces ++) {
					hourglassString += (" ");
				}
				hourglassString += ("/");
				for(int colon = 0; colon < -2*row+size; colon++) {
					hourglassString += (":");
				}
				hourglassString += ("\\ \n");
			}
		
			//prints bottom of the hourglass
			hourglassString += ("|");
			for(int i = 0; i < size; i++) {
				hourglassString += ("\"");
			}
			hourglassString +=("| \n");
			System.out.println(hourglassString);
			System.out.print("Continue? (Type \'quit\' to quit), type any key to continue:");
			Scanner userExit = new Scanner(System.in);
			String testQuit = userExit.nextLine();
			if(testQuit.equals("quit")) {
				quit = true;
				userInput.close(); 
			}
		}
	}
}
