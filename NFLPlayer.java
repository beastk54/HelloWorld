/**
 * 
 */
package nflDrafter;

/**
 * @author beast
 *
 */
public abstract class NFLPlayer {

	public double FortyTime;//40 yard dash time
	public double Height; //in inches 
	public double Weight;//in pounds
	public double Vertical;//Vertical jump in inches
	
	public int Bench;//reps at 225
	public int PositionRank;
	public int OverallRank;
	
	public String College;
	public String Position;
	public String Name;
	
	public NFLPlayer(String n){
		Name=n;
	}
	public NFLPlayer(double FT, double h, double w, String p, String n, int b, double v, int PR, int OR, String Uni){
		FortyTime=FT;
		Height=h;
		Weight=w;
		Position=p;
		Name=n;
		Bench=b;
		Vertical=v;
		PositionRank=PR;
		OverallRank=OR;
		College=Uni;
	}
	public double getForty(){
		return FortyTime;
	}
	public void setForty(double ft){
		FortyTime=ft;
	}
	public double getHeight(){
		return Height;
	}
	public void setHeight(double h){
		Height=h;
		
	}
	public double getWeight(){
		return Weight;
	}
	public void setWeight(double w){
		Weight=w;
	}
	public double getVertical(){
		return Vertical;
	}
	public void setVertical(double v){
		Vertical=v;
	}
	public int getBench(){
		return Bench;
	}
	public void setBench(int b){
		Bench=b;
	}
	public int getPositionRank(){
		return PositionRank;
	}
	public void setPositionRank(int pr){
		PositionRank=pr;
	}
	public int getOverallRank(){
		return OverallRank;
	}
	public void OverallRank(int or){
		OverallRank=or;
	}
	public String getCollege(){
		return College;
	}
	public void setCollege(String c){
		College=c;
	}
	public String getPosition(){
		return Position;
	}
	public void setPosition(String p){
		Position=p;
	}
	public String getName(){
		return Name;
	}
	public void setName(String n){
		Name=n;
	}
	
}
