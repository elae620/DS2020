package ex2;

public class Documentaire extends Film {
	private String Sujet;
	private float Tarif=2; 

	public Documentaire(String titre,String realisateur,String pays,int duree,String sujet) {
		super(titre,realisateur,pays, duree);
	    Sujet=sujet;
	}
	
	public String toString() {
		return(super.toString()+"\nSujet:"+this.Sujet);
	}
	
	public float totalVenteBillets() {
		return(getNbPlaces()*this.Tarif);
	}
	
	


}
