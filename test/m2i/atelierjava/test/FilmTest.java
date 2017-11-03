/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.test;

import java.util.Date;
import m2i.atelierjava.entite.Film;
import org.junit.Test;

/**
 *
 * @author Formation
 */
public class FilmTest {
    
    @Test
    public void afficheFilm(){
        Date d = new Date();
        
        Film f1 = new Film();
        f1.initialise("Spiderman", "il a des supers pouvoirs...", 1900, d);
        f1.affiche();
        
        Film f2 = new Film();
        f2.initialise("Batman", "chauve souris", 1800, new Date());
        f2.affiche();
        
        //////////////////////////////////////////////////
//        
//        f1.setTitre("Dracula");
//        f2.setTitre("Kung Fu Panda");
//        f1.setAnneeDeProduction(2001);
//        f2.setAnneeDeProduction(2010);
//        
//        System.out.println(f1.getAnneeDeProduction()+ " "+ f2.getAnneeDeProduction());
   
    }
    
}
