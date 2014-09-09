package nomPackage;

import java.util.Scanner;

public class test {
	public static void test(){
		System.out.println("Il y a u un aller retour ? Saisir oui ou non:");
		Scanner s = new Scanner(System.in);
		String allerRetour = s.next();
		//	boolean allerRetour = res.matches("oui")?true:false;
		System.out.print("\n"+allerRetour);
	}
	public static void test2(){
		double a = 1;
		double b = 3;

		System.out.println(a+b);
	}

}
