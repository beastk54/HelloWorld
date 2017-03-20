package nflDrafter;

import java.util.*;


public class DraftDriver {
	static Scanner scan=new Scanner(System.in);
	static NFLPlayer list[]= new NFLPlayer[10];
	static NFLPlayer Roster[]=new NFLPlayer[55];
	static String Select;
	static String TeamName;
	static int numPlayers=2;
	
	public static void main(String[] args){
		
		 // do next
		
		
		list[0]=createPlayer("Offense", 4.42,74,240,"RB","Brandon Kavanaugh", 28, 30.5,1,1,"Ohio State");
		list[1]=createPlayer("Offense", 4.62,76,212,"QB","Johnny Football", 12, 27.5,1,2,"Fresno State");
		list[2]=createPlayer("Offense", 4.36,78,220,"WR","Jacob Lacovic", 18, 34.5,1,3,"Arizona State");
		list[3]=createPlayer("Offense", 4.49,73,247,"RB","Ethan Connor", 22, 28,2,4,"Auburn");
		list[4]=createPlayer("Offense", 4.77,77,220,"QB","Kameron Sallee", 7, 26,2,5,"Grand Canyon University");
		list[5]=createPlayer("Defense", 4.51,75,246,"LB","Justin Gedaly", 27, 31,1,6,"Ohio State");
		list[6]=createPlayer("Defense", 4.67,74,250,"LB","Alex Taden", 24, 28,2,7,"Illinois");
		list[7]=createPlayer("Defense", 4.35,73,220,"DB","Mike Corner", 20, 33.5,1,8,"Western Dakota Tech");
		list[8]=createPlayer("Defense", 4.40,74,231,"DB","Lester Oddo", 18, 32.5,2,9,"Beloit College");
		list[9]=createPlayer("Defense", 4.46,70,240,"DB","Donovon Ingrassa", 14, 32,3,10,"Rutgers");
		
		Roster[0]=createPlayer("Offense", 4.88,80,310,"OL","Jonathon Alters", 38, 28.5,1,1,"Ohio State");
		Roster[1]=createPlayer("Defense", 4.59,79,295,"DL","Brady Toms", 35, 30.5,1,1,"Michigan");
		
		
		
		System.out.println("Enter your team name:");
		TeamName=scan.nextLine();
		menu();
		
		
	}
	
	public static NFLPlayer createPlayer(String side,double FT, double h, double w, String p, String n, int b, double v, int PR, int OR, String Uni){
		if(side.equalsIgnoreCase("Offense")){
			OffensivePlayer Player= new OffensivePlayer( FT, h, w, p, n, b,  v, PR,  OR, Uni);
			return Player;
		}
		else{
			DefensivePlayer Player= new DefensivePlayer( FT, h, w, p, n, b,  v, PR,  OR, Uni);
			return Player;
		}
	
	}
	public static void menu(){
		System.out.println(TeamName+" Main Menu:");
		System.out.println("Enter \"draft\" to draft a player on the board");
		System.out.println("Enter \"add\" to add a player to the draft board");
		System.out.println("Enter \"team\" to see your roster.");
		System.out.println("Enter \"search\" to search for a certain position");
		System.out.println("Enter \"back\" at any time to go back to previous selection");
		System.out.println(" ");
		System.out.println("Draft Board");
		for(int i=0;i<list.length;i++){
			System.out.println((i)+". "+list[i]);
		}
		
		System.out.println("Make your decision");
		 Select=scan.nextLine();
		 
		 if(Select.equalsIgnoreCase("draft")){
			 draft();
		 }
		 if(Select.equalsIgnoreCase("add")){
			 add();
		 }
		 if(Select.equalsIgnoreCase("team")){
			 team();
		 }
		 if(Select.equalsIgnoreCase("search")){
			 search();
		 }
	}
	public static void draft(){
		System.out.println("Select the number of the player you would like to draft");
		int num=scan.nextInt();
		Roster[numPlayers]=list[num];
		numPlayers++;
		NFLPlayer newList[]= new NFLPlayer[list.length-1];
		for(int x=0;x<newList.length;x++){
	
			if(x==num)
			{
				newList[x]=list[newList.length];
			}else
			{
				newList[x]=list[x];
			
			}
			
		}
		list=newList;
		menu();
	}
	public static void add(){
		double FortyTime;//40 yard dash time
		double Height; //in inches 
		double Weight;//in pounds
		double Vertical;//Vertical jump in inches
		
		int Bench;//reps at 225
		int PositionRank;
		int OverallRank;
		
		String College;
		String Position;
		String Name;
		
		System.out.println("Thank you for entering a new player into the database; we need some more information about the player.");
		System.out.println("What is the Player's Name?");
		Name=scan.next();
		System.out.println("What is the Player's Position?");
		Position=scan.next();
		System.out.println("What is the Player's College?");
		College=scan.next();
		
		System.out.println("What is the Player's Bench Reps at 225?");
		Bench=scan.nextInt();
		System.out.println("What is the Player's Position Rank?");
		PositionRank=scan.nextInt();
		System.out.println("What is the Player's Overall rank?");
		OverallRank=scan.nextInt();
		
		System.out.println("What is the Player's 40 yard dash time?");
		FortyTime=scan.nextDouble();
		System.out.println("What is the Player's Height in inches?");
		Height=scan.nextDouble();
		System.out.println("What is the Player's Weight in pounds?");
		Weight=scan.nextDouble();
		System.out.println("What is the Player's Vertical Jump in inches?");
		Vertical=scan.nextDouble();
		NFLPlayer newList[]= new NFLPlayer[list.length+1];
		int x=0;
		for(;x<newList.length;x++){
	
				newList[x]=list[x];
		}
		newList[x]=createPlayer(FortyTime, Height, Weight, Position, Name, Bench, Vertical, PositionRank, OverallRank, College);
		list=newList;
		menu();
	}
	public static void team(){
		for(int i=0;i<Roster.length;i++){
			System.out.println((i)+". "+Roster[i]);
		}
		
		menu();
	}
	public static void search(){
		System.out.println("What Position are you looking for?");
		String s=scan.nextLine();
		
		for(int b=0;b<list.length;b++){
		if(s.equalsIgnoreCase(list[b].Position))
		{
			System.out.println(list[b].toString());
		}
		}
		
		System.out.println(TeamName+" Main Menu:");
		System.out.println("Enter \"draft\" to draft a player on the board");
		System.out.println("Enter \"add\" to add a player to the draft board");
		System.out.println("Enter \"team\" to see your roster.");
		System.out.println("Enter \"search\" to search for a certain position");
		System.out.println("Enter \"back\" at any time to go back to previous selection");
		System.out.println("Make your decision");
		 Select=scan.nextLine();
		 
		 if(Select.equalsIgnoreCase("draft")){
			 draft();
		 }
		 if(Select.equalsIgnoreCase("add")){
			 add();
		 }
		 if(Select.equalsIgnoreCase("team")){
			 team();
		 }
		 if(Select.equalsIgnoreCase("search")){
			 search();
		 }else{
		menu();
		 }
	}
	public static NFLPlayer createPlayer(double FT, double h, double w, String p, String n, int b, double v, int PR, int OR, String Uni){
		OffensivePlayer Player= new OffensivePlayer( FT, h, w, p, n, b,  v, PR,  OR, Uni);
		return Player;
	}

}
