package tpcorba.exo4;

public class abonneImpl extends abonnePOA {
  private int numero;
  private String nom_prenom;
  
  public abonneImpl (int num) {
    this.numero = num;
  }
  
  public abonneImpl (int num, String nom, String prenom) {
    this.numero = num;
    this.nom_prenom = nom + " " + prenom;
  }
  
  public int numero () {
    return this.numero;
  }
  
  public String nom_prenom () {
    return this.nom_prenom;
  }
  
}
