package ex2;

import java.util.Scanner;

/* exercice 1
  1) faux
  2)b
  3)bonjour majeur
 */


public class Film {
	protected String Titre;
	protected String Realisateur;
	protected String PaysOrigine;
	protected int Duree;
	protected int NbPlaces;

	public Film(String titre,String realisateur,String pays,int duree) {
		Titre=titre;
		Realisateur=realisateur;
		PaysOrigine=pays;
		Duree=duree;    
	}
	
	public int getNbPlaces() {
		return(this.NbPlaces);
	}
	
	public String getTitre() {
		return(this.Titre);
	}
	
	public void setNbPlaces(int nbPlaces) {
		this.NbPlaces=nbPlaces;
	}
	
	public String toString() {
		return(this.Titre+"de"+this.Realisateur+"("+this.PaysOrigine+")"+"-"+this.Duree+"min");
	}
	
	public float totalVenteBillets() {
		int nbEtudiants=0;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.print("\nDonner le nombre des places pour etudiants: ");
			nbEtudiants=sc.nextInt();
		}while(this.getNbPlaces()<nbEtudiants);
		float total=((this.getNbPlaces()-nbEtudiants)*3)+nbEtudiants*2;
		return (total);
	}
	


}

