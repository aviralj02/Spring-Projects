package org.ncu.lab.GreetingApp;
import java.util.Scanner;

import org.ncu.lab.FortuneTeller.FortuneTeller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import sportsCoach.Coach;

@Component("engGreet")
public class EnglishGreetingService implements GreetingService{
	Scanner sc = new Scanner(System.in);
	// Dependency
	FortuneTeller fortune;
	Coach cricCoach;
	Coach basketCoach;
	Coach footCoach;
	
	// Dependency Constructor Injection
	 @Autowired 
	 public EnglishGreetingService(@Qualifier("engFortune")FortuneTeller fortune, @Qualifier("cric") Coach cricCoach, @Qualifier("basket") Coach basketCoach, @Qualifier("foot") Coach footCoach) {
		 this.fortune = fortune;
		 this.cricCoach = cricCoach;
	     this.basketCoach = basketCoach;
		 this.footCoach = footCoach;
	 }
	
	@Override
	public void greet(String name) {
		System.out.println("Hello "+name);
		System.out.println();
	}
	
	@Override
	public void fortune(String name) {
		fortune.tellFortune(name);
	}
	
	public void workout(String name) {
		System.out.print("Enter sport (cricket/basketball/football): ");
		String sport = sc.next().toLowerCase();
		System.out.println();
		if (sport.equals("cricket")) {
			cricCoach.tellWorkout(name, "english");
		}
		else if (sport.equals("basketball")) {
			basketCoach.tellWorkout(name, "english");
		}
		else if (sport.equals("football")) {
			footCoach.tellWorkout(name, "english");
		}
		else {
			System.out.println("Wrong sport entered!");
		}
	}
}
