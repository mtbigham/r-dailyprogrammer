/*
Title:  [2/11/2012] Challenge #3 [easy]
Text:  Welcome to cipher day!

write a program that can encrypt texts with an alphabetical caesar cipher. This cipher can ignore numbers, symbols, and whitespace.

for extra credit, add a "decrypt" function to your program!
*/
import java.util.*;

public class easy_003{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter shift (0-26): ");
		int shift = Integer.parseInt(input.nextLine());
		
		System.out.print("Enter Message: ");
		char[] msg = input.nextLine().toLowerCase().toCharArray();
		
		printShifted(shift, msg);
	}
	
	private static void printShifted(int shift, char[] msg){
		for(int i = 0; i < msg.length; i++){
			if(msg[i] >= 'a' && msg[i] <= 'z'){
				msg[i] += shift;
				
				if(msg[i] > 'z'){
					msg[i] -= 26;
				}
			}
		}
		
		System.out.print("Shifted: ");
		System.out.println(msg);
	}
}