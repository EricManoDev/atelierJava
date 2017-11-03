/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.test;

import m2i.atelierjava.entite.Avion;
import m2i.atelierjava.entite.SousMarin;
import m2i.atelierjava.entite.Vehicule;
import org.junit.Test;

/**
 *
 * @author Formation
 */
public class VehiculeTest {
    
//    @Test
    public void testAvion(){
        
       Avion a = new Avion("Dassault", true, "Falcon", "blanc", 0, 0, 0, 0, 0);
       
       a.avancer();
       a.afficher();
        
    }
    
// @Test
    public void testVehicule(){
        
        Vehicule vehic1 = new Vehicule("Peugeot", false, "3008", "noir", 7, 0, 0, 0, 7);
        vehic1.avancer();
        vehic1.avancer();
        vehic1.avancer();
        vehic1.afficher();
          
          
        Vehicule vehic2 = new Vehicule("Nissan", true, "Qashqai", "gris", 5, 0, 0, 0, 41);
        vehic2.reculer();
        vehic2.reculer();
        vehic2.afficher();
    }
    
//    @Test
    public void testSousMarin(){
        
       SousMarin sm = new SousMarin("Le Torpilleur", true, "modele A", "noir", 4, 0, 0, 0, 3, false);
       
       sm.avancer();
       sm.afficher();
       sm.setMonte(true);
       sm.avancer();
       sm.afficher();
    }
    }
    
