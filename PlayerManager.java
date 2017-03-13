/**
 * 
 */
package nflDrafter;
import java.util.*;
/**
 * @author beast
 *
 */
public class PlayerManager {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		
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
		
		
		System.out.println("How many players are you adding to the database?");
		int players=scan.nextInt();		
		NFLPlayer list[]= new NFLPlayer[players];

		for(int i=0;i<10;i++){
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
			
			list[i]= createPlayer(FortyTime, Height, Weight, Position, Name, Bench, Vertical, PositionRank, OverallRank, College);
		}
	}
	public static NFLPlayer createPlayer(double FT, double h, double w, String p, String n, int b, double v, int PR, int OR, String Uni){
		OffensivePlayer Player= new OffensivePlayer( FT, h, w, p, n, b,  v, PR,  OR, Uni);
		return Player;
	}

}
