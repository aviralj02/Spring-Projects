package sportsCoach;

import org.springframework.stereotype.Component;

@Component("cric")
public class CricketCoach implements Coach {
	String Eworkout = "Run 5kms a day";
	String Fworkout = "(Run 5kms a day) in French";
	String Sworkout = "(Run 5kms a day) in Spanish";
	
	@Override
	public void tellWorkout(String name, String lang) {
		if(lang.equals("english")) {
			System.out.println(name + ", " + Eworkout);
		}
		else if(lang.equals("french")) {
			System.out.println(name + ", " + Fworkout);
		}
		else if(lang.equals("spanish")) {
			System.out.println(name + ", " + Sworkout);
		}
	}
}
