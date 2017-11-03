/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.entite;

import java.util.Date;

/**
 *
 * @author Formation
 */
public class Film {

    private String titre;
    private String Synopsis;
    private int anneeDeProduction;
    private Date dateCreation;
    
    public void initialise(String titre, String synopsis, int anneeDeProduction, Date dateCreation){
        this.titre = titre;
        this.Synopsis = synopsis;
        this.anneeDeProduction = anneeDeProduction;
        this.dateCreation = dateCreation;
    }
    
//    public void affiche(){
//        System.out.println("titre du film: " + titre + ", " + "Synopsis: " + Synopsis + ", annee de Production: " + anneeDeProduction +", " + "annee de Creation: "+ dateCreation );
//    }
    
    public void affiche(){
        System.out.println( String.format("titre film: %s, Synopsis: %s, annee production: %d, annee creation: %s", this.titre, this.Synopsis, this.anneeDeProduction, this.dateCreation));
    }
    

    public String getSynopsis() {
        return Synopsis;
    }

    public void setSynopsis(String Synopsis) {
        this.Synopsis = Synopsis;
    }

    
    
    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
    


    public String getTitre() {
        return titre;
    }

    public void setTitre(String t) {
       this.titre = t;
    }

    public int getAnneeDeProduction(){
        return anneeDeProduction ;
    }

    public void setAnneeDeProduction(int adp) {
        this.anneeDeProduction = adp;
    }
    
}
