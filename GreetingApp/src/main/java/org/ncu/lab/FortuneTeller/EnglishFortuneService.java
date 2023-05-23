package org.ncu.lab.FortuneTeller;
import java.util.*;

import org.springframework.stereotype.Component;

@Component("engFortune")
public class EnglishFortuneService implements FortuneTeller{
	Scanner sc = new Scanner(System.in);
	
	String[] fortune = {
			"Someone is looking up to you. Don't let that person down",
			"RUN!",
			"No snowflake is an avalanche ever feels responsible",
			"If you eat something and nobody sees you eat it, it has no calories",
			"Someone in your life needs a letter from you",
			"Soon you will receive a letter from a loved one",
			"Never do anything halfway",
			"Don't be afraid to take that big step",
			"You will move to a wonderful new home within the year",
			"A new romance is in the future",
	};
	public int getNumber() {
		System.out.print("Enter your favorite number: ");
    	int num = sc.nextInt();
    	return num;
	}
	public String getZodiac() {
		System.out.print("Enter you zodiac: ");
    	String zodiac = sc.next().toLowerCase();
    	return zodiac;
	}
	@Override
	public void tellFortune(String name) {
		int numZ = getZodiac().length();
		int sum = getNumber() + numZ;
		int indexNum = sum % fortune.length;
		System.out.println("\n"+name+"'s fortune is: "+fortune[indexNum]);
	}
}
