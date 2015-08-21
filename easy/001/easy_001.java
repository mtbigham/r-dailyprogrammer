import java.util.*;
import java.lang.StringBuilder;
import java.io.FileWriter;
import java.io.IOException;

public class easy_001{
	public static void main(String[] args){
		List<String> questions = Arrays.asList("What is your name?", "What is your age?", "What is your username?");
		List<String> answers = new ArrayList<String>();
		Scanner input = new Scanner(System.in);
		
		//Gonna try out the Java8 Streams!
		//for each question, add the input to the answer list
		questions.stream()
			.filter(s -> {
				System.out.println(s);
				return true;
			})
			.forEach(s -> answers.add(input.next()));
			
		//build the data string for output
		StringBuilder data = new StringBuilder();
		for(String s : answers){
			if(data.length() != 0){
				data.append(",");
			}
			data.append(s);
		}
		data.append("\n");
		
		//write user info to output file
		FileWriter fw = new FileWriter("easy_001_output", true);
		fw.write(data.toString());
		fw.close();
		
		//print answers to console
		System.out.println(
			"Your name is " + answers.get(0)+
			", your age is " + answers.get(1)+
			", and your username is " + answers.get(2)
		);
	}
}