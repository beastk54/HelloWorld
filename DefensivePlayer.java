/**
 * 
 */
package nflDrafter;

/**
 * @author beast
 *
 */
public class DefensivePlayer extends NFLPlayer {
	private double sacks;
	private int tackles;
	private int interceptions;
	
	
	
	public DefensivePlayer(String name)
	{
		super(name);
	}
	
	public DefensivePlayer(double FT, double h, double w, String p, String n, int b, double v, int PR, int OR, String Uni)
	{
		super (FT,h,w,p,n,b,v,PR,OR, Uni);
		
	}

	public double getSacks(){
		
		return sacks;
	}
	public void setSacks(double s){
		sacks=s;
	}
	
	public int getTackles(){
		
		return tackles;
	}
	public void setTackles(int t){
		tackles=t;
	}
public int getInt(){
		
		return interceptions;
	}
	public void setInt(int i){
		interceptions=i;
	}
	
}
