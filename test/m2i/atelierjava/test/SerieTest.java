/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.test;

import m2i.atelierjava.entite.Serie;
import org.junit.Test;

/**
 *
 * @author Formation
 */
public class SerieTest {
    
   @Test
   public void afficheOk ()
   {
       
    Serie s1 = new Serie();
    s1.initialise("Dexter", "bla bla", 2011, 7);
//    s1.setSynopsis("bla bla bla");
//    s1.setNbSaisons(7);
//    s1.setAnneeSortie(2011);
    s1.affiche();
       
    Serie s2 = new Serie();
    s2.initialise("Game of Thrones", "bla bla", 2012, 10);
//    s2.setTitre("Game of Thrones");
//    s2.setSynopsis("blo blo blo");
//    s2.setNbSaisons(11);
//    s2.setAnneeSortie(2012);
    s2.affiche();
       
   

       
    
       
       
   }
           
}
