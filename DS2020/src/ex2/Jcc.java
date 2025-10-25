package ex2;

public class Jcc {
	private Film[] competition;
	private int Annee;
	private int NBFMAX=30;
	private static int nbF=0;
	

	public Jcc(int taille,int annee  ) {
		Annee=annee;
		competition=new Film[taille];
	}
	
	public void ajoutFilm(Film f) {
		if (nbF<competition.length) {
			competition[nbF]=f;
			nbF++;
			System.out.print("\nFilm ajoutee!");
		}else {
			System.out.print("\nLa competition est au complet!");
		}
	}
	
	public void listeFilmJcc() {
		for(int i=0;i<nbF;i++) {
			System.out.print("\nFilm "+i+" :"+competition[i].getTitre());
		}
	}
	
	public float totalVenteBilletsJCC() {
		float total=0;
		for(int i=0;i<nbF;i++) {
			total+=competition[i].totalVenteBillets();
		}
		return (total);
	}
	
	

	public static void main(String[] args) {
		Jcc jcc=new Jcc(2,2021);
		Film f1=new Documentaire("Le dernier refuge","Ousman","Mali",86,"la guerre civile");
		f1.setNbPlaces(30);
		Film f2=new Film("Insurrection","Jilani Saadi","Tunisie",105);
		f2.setNbPlaces(45);
		jcc.ajoutFilm(f1);
		jcc.ajoutFilm(f2);
		float total=0;
		total+=f1.totalVenteBillets();
		total+=f2.totalVenteBillets();
        System.out.print("\nmontant total des billets: "+total);
	}

}

 
