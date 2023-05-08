package AssistedPractice10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularCheck {
	

	    public static void main(String[] args) {
	        String input = "The fox wins mike tyson loses";
	        String pattern = "fox";
	        
	
	        Pattern p = Pattern.compile(pattern);

	     
	        Matcher m = p.matcher(input);

	       
	        if (m.find()) {
	            System.out.println("Pattern found at index " + m.start());
	        } else {
	            System.out.println("Pattern not found");
	        }
	    }
	}

