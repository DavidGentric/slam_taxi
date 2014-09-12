package nomPackage;

//importation du packet
import java.util.*;

import javax.swing.JOptionPane;

public class mainTaxi {
	//initialisation des variables globale
		static int unDepartement;
		static double uneDistance=0;
		static double uneDurée=0;
		static double uneHeureDepart=0;
		static double uneHeureArrivee=0;
		static double prixAPayer=0;
		static String unJour;
		static boolean allerRetour;
		static int prisEncharge;
		static double tarifAuKm;
		//initialisation du tablau de tarifs
		static final double [][] tableauDeTarif = {{21,2,0.86,1.72,21.93,1.29,2.58,21.93},{25,2.1,0.83,1.66,22.5,1.2,2.4,22.5},{39,2.1,0.83,1.66,22.5,1.23,2.46,25},{44,2.2,0.79,1.58,24.19,1.19,2.37,24.19},{72,2.15,0.79,1.58,22.86,1.19,2.38,22.86},{73,2.4,0.84,1.68,25.4,1.26,2.52,25.4},{74,3.15,0.92,1.84,17.3,1.38,2.76,17.3},{75,2.5,1,1.24,0,1.5,1.5,0},{85,2.3,0.8,1.6,22.2,1.2,2.4,22.2},{90,2.2,0.83,1.66,21,1.15,2.3,21}};



		public static void main(String arg[]){
			saisie();
			System.out.println("\n"+allerRetour);
			System.out.print("\n"+"Phase de saisie effectuer");
			calcul();
		}


		public static void saisie(){

			Scanner sc = new Scanner(System.in);
			//unDepartement
			try {
				System.out.println("saisir le départemant :");
				unDepartement = sc.nextInt();} 
			catch (Exception e) {
				controlInt();}
			//changemant de la vateur de unDepartement en @ du tablaux ex :
			//	unDepartement = 21;
			//	unDepartement=0;
			//	car 27 ==> tableauDeTarif [0][0]
			switch (unDepartement) {
			case 1:  unDepartement=21;
			unDepartement=0;
			break;
			case 2:  unDepartement=25;
			unDepartement=1;
			break;
			case 3:  unDepartement=39;
			unDepartement=2;
			break;
			case 4:  unDepartement=44;
			unDepartement=3;
			break;
			case 5:  unDepartement=72;
			unDepartement=4;
			break;
			case 6:  unDepartement=73;
			unDepartement=5;
			break;
			case 7:  unDepartement=74;
			unDepartement=6;
			break;
			case 8:  unDepartement=75;
			unDepartement=7;
			break;
			case 9:  unDepartement=85;
			unDepartement=8;
			break;
			case 10: unDepartement=90;
			unDepartement=9;
			break;

			}
			//uneDistance
			try {
				System.out.println("saisir une Distance :");
				uneDistance = sc.nextInt();

			}catch (Exception e) {
				controlInt();
			}


			//uneHeureDepart	
			try {
				System.out.println("saisir l'heure de départ");
				uneHeureDepart = sc.nextInt();

			} catch (Exception e) {
				controlInt();
			}


			//uneHeureArrivee
			try {
				System.out.println("saisir l'heure d'arrivée");
				uneHeureArrivee = sc.nextInt();
			} catch (Exception e) {
				controlInt();
			}


			//unJour
			try {
				System.out.println("saisir le jour :");
				unJour = sc.next();
			} catch (Exception e) {
				controlInt();
			}


			//allerRetour
			try {

				//System.out.println("Il y a u un aller retour ? Saisir oui ou non:");
				//Scanner s = new Scanner(System.in);
				//String allerRetour = s.next();
				
				System.out.println("saisir oui ou non");
				Scanner s = new Scanner(System.in);
				String res = s.next();

				allerRetour = res.matches("oui")?true:false;			
				
				
			} catch (Exception e) {
				controlbool();
			}
		}


		public static void ouiNonBool(String string) {
			System.out.println("saisir oui ou non");
			Scanner s = new Scanner(System.in);
			String res = s.next();

			boolean test = res.matches("oui")?true:false;
			System.out.print("\n"+test);
		}
		
		public static void calcul(){
			/*int prisEncharge;
			  double tarifAuKm;*/
			System.out.println("\n"+"Calcules en cours d'exécution...");
			switch (unJour) {
			//lundi
			case "lundi":  unJour = "lundi";
			if (allerRetour=true){
				//calule pour un aller retour en semaine
				semaineAR();
			}
			else {
				//calcule pour un aller simple en semaine
				semaineAS();
			}
			break;
			//mardi
			case "mardi":  unJour = "mardi";
			if (allerRetour=true){
				//calule pour un aller retour en semaine
				semaineAR();
			}
			else {
				//calcule pour un aller simple en semaine
				semaineAS();
			}
			break;

			//mercredi
			case "mercredi":  unJour = "mercredi";
			if (allerRetour=true){
				//calule pour un aller retour en semaine
				semaineAR();
			}
			else {
				//calcule pour un aller simple en semaine
				semaineAS();
			}
			break;

			//jeudi
			case "jeudi":  unJour = "jeudi";
			if (allerRetour=true){
				//calule pour un aller retour en semaine
				semaineAR();
			}
			else {
				//calcule pour un aller simple en semaine
				semaineAS();
			}
			break;

			//vendredi
			case "vendredi":  unJour = "vendredi";
			if (allerRetour=true){
				//calule pour un aller retour en semaine
				semaineAR();
			}
			else {
				//calcule pour un aller simple en semaine
				semaineAS();
			}
			break;

			//samedi
			case "samedi":  unJour = "samedi";
			if (allerRetour=true){
				//calule pour un aller retour en semaine
				semaineAR();
			}
			else {
				//calcule pour un aller simple en semaine
				semaineAS();
			}
			break;

			//dimanche
			case "dimanche":  unJour = "dimanche";
			if (allerRetour=true && uneHeureDepart >20){
				//calcule pour un aller retoure en semaine
				semaineAR();
			}
			else if (allerRetour=false && uneHeureDepart >20){
				//calcule pour un aller simple en semaine
				semaineAS();
			}
			else if (allerRetour=true && uneHeureDepart<=20){
				//calcule pour un aller retoure le dimanche de nuit
				dimancheNuitAR();
			}
			else if (allerRetour=false && uneHeureDepart<=20) {
				//calcule pour un aller simple le dimanche de nuit
				dimancheNuitAS();
			}
			else {
				//pb de saisi du jour
				System.out.println("\n"+"Les calcules on ecoué, il y a sans doute un pb de saisie du jour");
			}
			break;

			}


			//calcule de la prise en charge
			//prise en charge + (distance x tarif au km) = prixAPayer
		}

		public static void semaineAS(){
			//déclaration de variable temportaire pour le calcule
			double variableLocalpriseEnCharge=0;
			double variableLocalTarifKm=0;
			double variableLocaltarifHoraire=0;
			double temp1=0;
			
			tableauDeTarif [unDepartement][1]=variableLocalpriseEnCharge;
			tableauDeTarif [unDepartement][3]=variableLocalTarifKm;
			tableauDeTarif [unDepartement][4]=variableLocaltarifHoraire;
			temp1=variableLocalpriseEnCharge+uneDistance*variableLocalTarifKm;
			//'variableLocalpriseEnCharge'+'uneDistance'*'variableLocalTarifKm'='prixAPayer';
			System.out.println(temp1);

		}
		public static void semaineAR(){
			//déclaration de variable temportaire pour le calcule
			double variableLocalpriseEnCharge=0;
			double variableLocalTarifKm=0;
			double variableLocaltarifHoraire=0;
			
			tableauDeTarif [unDepartement][1]=variableLocalpriseEnCharge;
			tableauDeTarif [unDepartement][2]=variableLocalTarifKm;
			tableauDeTarif [unDepartement][4]=variableLocaltarifHoraire;
			
			//double prix=variableLocalpriseEnCharge+uneDistance*variableLocalTarifKm;

			//System.out.println(variableLocalpriseEnCharge+uneDistance*variableLocalTarifKm);
			System.out.println("\n coucou le prix est de :"+variableLocalpriseEnCharge+uneDistance*variableLocalTarifKm);
		}
		public static void dimancheNuitAS(){
			//déclaration de variable temportaire pour le calcule
			double variableLocalpriseEnCharge=0;
			double variableLocalTarifKm=0;
			double variableLocaltarifHoraire=0;
			double tempsDeTrajet=0;

			//uneHeureArrivee-uneHeureDepart=tempsDeTrajet;
			tableauDeTarif [unDepartement][1]=variableLocalpriseEnCharge;
			tableauDeTarif [unDepartement][6]=variableLocalTarifKm;
			tableauDeTarif [unDepartement][7]=variableLocaltarifHoraire;
			//variableLocalpriseEnCharge+uneDistance*variableLocalTarifKm+tempsDeTrajet(arondi a l'heure)*variableLocaltarifHoraire

		}
		public static void dimancheNuitAR(){
			//déclaration de variable temportaire pour le calcule
			double variableLocalpriseEnCharge=0;
			double variableLocalTarifKm=0;
			double variableLocaltarifHoraire=0;

			tableauDeTarif [unDepartement][1]=variableLocalpriseEnCharge;
			tableauDeTarif [unDepartement][5]=variableLocalTarifKm;
			tableauDeTarif [unDepartement][7]=variableLocaltarifHoraire;
			System.out.println(variableLocalpriseEnCharge+uneDistance*variableLocalTarifKm);
		}


		//controle saisi int
		public static void controlInt(){
			//JOptionPane.showMessageDialog(null,"une valeur bool !!! true ou false","Probléme de format",JOptionPane.ERROR_MESSAGE); 
		}
		//controle saisi int
		public static void controlbool(){
			//JOptionPane.showMessageDialog(null,"une valeur bool !!! true ou false","Probléme de format",JOptionPane.ERROR_MESSAGE);
		}


}