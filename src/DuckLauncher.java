
public class DuckLauncher {

	public static void main(String[] arhs) {

		Duck Daffy = new Duck("Daffy", 0,"Bread");
		
		Duck Donald = new Duck("Donald", 2, "Prunes");
		
		Daffy.quack();
		
		Daffy.waddle();
		
		Donald.quack();
		
		Donald.waddle();
		
		Daffy.numOfFriends = 7;
		
		System.out.println(Daffy.numOfFriends);
		
		System.out.println(Donald.numOfFriends);
		
	}
}
