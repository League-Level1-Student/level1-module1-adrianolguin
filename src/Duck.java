
public class Duck {

	String name = "";

	int numOfFriends = 0;

	String favFood = "";

	
	public void quack() {
		System.out.println(name + ": Quack");
	}

	public void waddle() {
		System.out.println(name + ": Waddle");
	}
	

	Duck(String name, int numOfFriends, String favFood) {
		this.numOfFriends = numOfFriends;
		this.favFood = favFood;
		this.name = name;

		System.out.println("Duck: " + name + "  was created.");
	}

}
