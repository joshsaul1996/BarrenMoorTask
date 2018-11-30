package barrenMoorGame;

import java.util.Scanner;

public class Campaign {
	
	public static void main(String[] args){
		System.out.println(playerInput1());
		System.out.println(playerInput2());
		System.out.println(playerInput3());
		
	}


	public static String playerInput1() {
	int l;
	Scanner sc = new Scanner(System.in);
	System.out.println("Its dusk, you awaken in a derelict building surrounded by marshland in the distance you hear dolphoids battlecries" 
	+ "\n" + "You see a sign, do you want to look at the sign (Press 1 for Yes, Press 2 for Im Good thanks)?" );
	l = sc.nextInt();
	sc.close();
	
	if (l == 1) {
		return (" ");}
	else{
		return ("You've made a grave mistake the sign bestows upon you the power of Magic and the power to wield a compass" + "\n" + "you are overwhelmed with guilt and disappointment so hand yourself over to the dolphoids for their next supper ");}
			}
	
	public static String playerInput2() {
	int l;
	Scanner sc = new Scanner(System.in);
	System.out.println("It's in Times New Roman *You mouth vomit slightly* it reads 'QA Consulting' *although 'Quantum Alpha Consulting' sounds way cooler*" 
	+ "\n" + "You notice a compass on the floor, enscribed on the compass is GFCA, *turn compass over* property of Gareth's Fan Club's Army." + "\n" + "(Press 1 to take Compass, 2 to try and navigate using the stars" );
	l = sc.nextInt();
	sc.close();
		
	if (l == 1) {
		return (" ");}
	else{
			return ("It turns out horoscopes arent the most accurate method of navigation although yours was right today wasnt going to be your day");}
	}		

	
	public static String playerInput3() {
		int North = 1;
		int	East = 2;
		int South = 3;
		int West;
		int l;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("*You feel an overwhelming need to explore* you decide leaving the relatively safe confines of QA is a good idea" 
		+ "\n" + "Which direction do you choose? (North = 1 , East = 2, South = 3 West = 4" );
		l = sc.nextInt();
		sc.close();
		
			switch (l) {
				case 1:
					if (l == 1) {
						return ("You have chosen North");
						}
					
					
				case 2:
					if (l == 2) {
						return ("You have chosen East");
					}
			
				case 3:
					if (l == 3) {
						return ("You have chosen South");
					}
					
				case 4:
					if (l == 4) {
						return ("You have chosen West");
					}
					
				
			}
	}}

