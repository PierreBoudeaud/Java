package gestion_classe;

public class Eleve {
	 private String nom;
	 private String adresse;
	 private String dateNaissance;
	 
	 public Eleve(String nom, String adresse, String dateNaissance){
	  this.nom = nom;
	  this.adresse = adresse;
	  this.dateNaissance = dateNaissance;
	 }
	 
	 public void Afficher(){
	  System.out.println(nom);
	  System.out.println("  | Habite : " + adresse);
	  System.out.println("  | Né le  : " + dateNaissance);
	 }
	 
	 public void ModifierNom(String nom){
	  this.nom = nom;
	 }
	 
	 public void ModifierAdresse(String adresse){
	  this.adresse = adresse;
	 }
	 
	 public void ModifierDateNaissance(String dateNaissance){
	  this.dateNaissance = dateNaissance;
	 }
	 
	 public String DonneNom(){
	  return(this.nom);
	 }
	}
