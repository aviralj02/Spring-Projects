package org.ncu.lab.FortuneTeller;
import java.util.*;

import org.springframework.stereotype.Component;


@Component("freFortune")
public class FrenchFortuneService implements FortuneTeller {
	Scanner sc = new Scanner(System.in);
	
	String[] fortune = {
			"ok",
			"lol",
			"haha",
			"heh",
			"okay",
			"shh",
			"goat",
			"dost",
			"friend",
			"NO"
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
		// TODO Auto-generated method stub
		int numZ = getZodiac().length();
		int sum = getNumber() + numZ;
		int indexNum = sum % fortune.length;
		System.out.println("\n"+name+"'s fortune is: "+fortune[indexNum]);
	}
}
