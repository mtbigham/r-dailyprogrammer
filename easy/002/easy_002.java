import java.util.*;

public class easy_002{
	public static void main(String[] args){
		
		String output;
		
		switch(args[0]){
			case "add":
				output = add(args[1], args[2]);
				break;
			case "sub":
				output = sub(args[1], args[2]);
				break;
			case "mult":
				output = mult(args[1], args[2]);
				break;
			case "div":
				output = div(args[1], args[2]);
				break;
			default:
				output = "Invalid operation, try again.";
				break;
		}
		
		System.out.println(output);
	}
	
	private static String add(String x, String y){
		return Integer.toString(Integer.parseInt(x)+Integer.parseInt(y));
	}
	
	private static String sub(String x, String y){
		return Integer.toString(Integer.parseInt(x)-Integer.parseInt(y));
	}
	
	private static String mult(String x, String y){
		return Integer.toString(Integer.parseInt(x)*Integer.parseInt(y));
	}
	
	private static String div(String x, String y){
		return Integer.toString(Integer.parseInt(x)/Integer.parseInt(y))+
			", Remainder: "+
			Integer.toString(Integer.parseInt(x)%Integer.parseInt(y));
	}
}