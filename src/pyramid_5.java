//1 2 3 4 5
//1 2 3 4
//1 2 3
//1 2
//1


public class pyramid_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		for(int i = n; i<=n; i--) {
			for(int j= 1; j<=i; j++) {
				System.out.print(j+"");
			}
			System.out.print("\n");
		}

	}

}
