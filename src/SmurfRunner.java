
public class SmurfRunner {
	public static void main(String args[]){
		Smurf handy = new Smurf("handy");
		Smurf papaSmurf = new Smurf("PapaSmurf");
		Smurf smurfette = new Smurf("Smurfette");


	handy.eat();
System.out.println(handy.getName());
	
	papaSmurf.eat();
	smurfette.eat();
	
	System.out.println(papaSmurf.getHatColor());
	System.out.println(smurfette.getHatColor());
	
	
	
	}
}