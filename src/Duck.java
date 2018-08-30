
public class Duck {

	String name;
	int numOfFriends = 0;
	String favFood = "";

	Duck(String name, int numOfFriends, String favFood) {
		this.numOfFriends = numOfFriends;
		this.favFood = favFood;
		this.name = name;

		System.out.println("Duck: " + name + "  was created.");
	}
	
	public void quack() {
		System.out.println(name + ": Quack");
	}

	public void waddle() {
		System.out.println(name + ": Waddle");
	}
	

	

}
