
public class Eleve {
	private String nom, adresse, dateNaissance;
	
	//Construit l'objet élève
	public Eleve(String nom, String adresse, String dateNaissance){
		this.nom = nom;
		this.adresse = adresse;
		this.dateNaissance = dateNaissance;
	}

	//modifie nom
	public void setNom(String nom) {
		this.nom = nom;
	}

	//modifie adresse
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	//modifie date naissance
	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	
	public void afficherEleve(){
		System.out.println(this.nom + " " + this.adresse + " " + this.dateNaissance);
	}
	
	public String getNom(){
		return this.nom;
	}
}
