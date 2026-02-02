package etudiant;

import java.util.Scanner;

import point.Point;

public class etudiant {
	private String nom;

	public etudiant() {
		nom = null;
	}

	public etudiant(String nom) {
		this.nom = nom;
	}

	public static etudiant demande() {
		Scanner etud = new Scanner(System.in);

		System.out.print("Entrez nom d'etudiant : ");
		String nom = etud.nextLine();
		return new etudiant(nom);
	}

	public void afficher() {
		System.out.println("Nom D'etudiant: , "+nom+"");
		
	}

	public static void main(String[] argc) {
		
		etudiant e1 = demande();
		etudiant e2 =demande();
		
		e1.afficher();
		e2.afficher();
		
System.out.println("Les etudiants sont: "+e1+"  "+e2+"");
	}

}
