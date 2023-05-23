package sportsCoach;

import org.springframework.stereotype.Component;

@Component("foot")
public class FootballCoach implements Coach {
	String Eworkout = "practice penalty shoot-out.";
	String Fworkout = "(practice penalty shoot-out.) in French";
	String Sworkout = "(practice penalty shoot-out.) in Spanish";

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
