/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.test;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.midi.MidiUnavailableException;
import m2i.atelierjava.entite.Synthetiseur;
import org.junit.Test;

/**
 *
 * @author Formation
 */
public class SynthetiseurTest {

    
    /////// affichage synthe////////
//    @Test
    public void testSynthetiseurOk(){
        
       Synthetiseur st = new Synthetiseur();
       st.allumage();
       st.setInstru("piano");
       st.jouerNote("do");
       st.volumePlus();
       st.jouerNote("fa");  
    }
    
    
    /////////Test son/////
    @Test
    public void synthTest(){
        try {
            Synthetiseur st= new Synthetiseur();
            
            st.JouerNote("do");
            st.JouerNote("sol");
            st.JouerNote("fa");
            st.JouerNote("mi");
            st.JouerNote("ré");
            st.JouerNote("mi");
            st.JouerNote("do");
            st.JouerNote("do");
            
           
            
        } catch (MidiUnavailableException ex) {
            Logger.getLogger(SynthetiseurTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(SynthetiseurTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}
