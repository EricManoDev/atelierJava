/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.entite;

/**
 *
 * @author Formation
 */
public class Serie {
    
        
    private String titre;
    private int anneeSortie;
    private int nbSaisons;
    private String Synopsis;
    
    public void initialise(String titre, String synopsis, int anneeSortie,int nbSaisons ){
        
        this.titre = titre;
        this.anneeSortie = anneeSortie;
        this.nbSaisons = nbSaisons;
        this.Synopsis = synopsis;
               
    }
    
    public void affiche(){
        
        System.out.println(titre + " " + anneeSortie + " " + nbSaisons + " " + Synopsis );
    }
    
    

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getAnneeSortie() {
        return anneeSortie;
    }

    public void setAnneeSortie(int anneeSortie) {
        this.anneeSortie = anneeSortie;
    }

    public int getNbSaisons() {
        return nbSaisons;
    }

    public void setNbSaisons(int nbSaisons) {
        this.nbSaisons = nbSaisons;
    }

    public String getSynopsis() {
        return Synopsis;
    }

    public void setSynopsis(String Synopsis) {
        this.Synopsis = Synopsis;
    }

    
    
  
}
