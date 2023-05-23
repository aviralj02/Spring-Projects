package sportsCoach;

import org.springframework.stereotype.Component;

@Component("basket")
public class BasketballCoach implements Coach {
	String Eworkout = "practice your aim everyday";
	String Fworkout = "(practice your aim everyday) in French";
	String Sworkout = "(practice your aim everyday) in Spanish";

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
