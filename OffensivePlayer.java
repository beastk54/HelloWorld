/**
 * 
 */
package nflDrafter;

/**
 * @author beast
 *
 */
public class OffensivePlayer extends NFLPlayer
{
	private int touchdowns;
	private int yards;
	private int touches; //how many times the player got the ball
	
	
	public OffensivePlayer(String name){
		super(name);
	}
	
	public OffensivePlayer(double FT, double h, double w, String p, String n, int b, double v, int PR, int OR, String Uni)
	{
		super (FT,h,w,p,n,b,v,PR,OR, Uni);
		
	}
	
	public int getTDS(){
		
		return touchdowns;
	}
	public void setTDS(int tds){
		touchdowns=tds;
	}

	public int getYards(){
		
		return yards;
	}
	public void setYards(int yds){
		touchdowns=yds;
	}
	public int getTouches(){
		
		return touches;
	}
	public void setTouches(int tds){
		touches=tds;
	}
}
