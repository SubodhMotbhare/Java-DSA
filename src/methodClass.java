import java.util.*; 

public class methodClass {
	public static void printMyName(String name) {
		System.out.println("Subodh"+ " " +name);
		return;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name = ");
		String Name = sc.next();
		printMyName(Name);

	}

}


//Here in methodClass we use the printMyName() with static keyword. If we no use
//the static keywod it gives the error when we call the given method in main() method
//body.