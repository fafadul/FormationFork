import java.util.Scanner;

public class Fork {

	static int nb1 = 0;
	static int nb2 = 0;
	static int nb3 = 0;
	static int nbuser = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nbuser = 0;

		// Read Keyboarb
		while (nbuser != -1) {
			Scanner readKeyb = new Scanner(System.in);
			System.out.println("Enter an integer number: ");
			nbuser = readKeyb.nextInt();
			System.out.println("The highest numbers are: " + SendInt(nbuser));

		}
		System.out.println("End of program");
	}

	public static String SendInt(int nbuser) {
		if (nbuser > nb1) {
			nb3 = nb2;
			nb2 = nb1;
			nb1 = nbuser;
		}
		if (nbuser > nb2 && nbuser < nb1) {
			nb3 = nb2;
			nb2 = nbuser;
		}
		if (nbuser > nb3 && nbuser < nb2) {
			nb3 = nbuser;
		}
		String str = nb1 + ", " + nb2 + " and " + nb3;
		return str;
	}
}
