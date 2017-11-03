/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.entite;

import javax.sound.midi.Instrument;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;

/**
 *
 * @author Formation
 */
public class Synthetiseur {

    private boolean on;
    private String instru;
    private int volume;

    /////////////allumage////////////
    public void allumage() {

        if (on == true) {
            on = false;
        } else {
            on = true;
        }
    }
///////////Volume Plus///////////

    public void volumePlus() {

        if (volume < 10) {
            volume++;
        }
    }

    /////////////volume moins//////
    public void volumeMoins() {
      
        if (volume > 0) 
            volume--;
        
    }

    //////////affichage////////////////
//    public void jouerNote(String note) {
//        String txt = String.format("le Synthé est: on=%s, l'instru est: %s, le volume est: %d, la note est: %s", this.on, this.instru, this.volume, note);
//        System.out.println(txt);
//    }
    ////////////Jouer la note//////////////////
    public void JouerNote (String laNote) throws MidiUnavailableException, InterruptedException {
        
        int abc = 0;
        
        if(laNote=="do"){
            abc=60;
        }
        
        if(laNote=="ré"){
            abc=62;
        }
        if(laNote=="mi"){
            abc=64;
        }
        if(laNote=="fa"){
            abc=66;
        }
        
        if(laNote=="sol"){
            abc=68;
        }
        if(laNote=="la"){
            abc=70;
        }
        if(laNote=="si"){
            abc=72;
        }
        if(laNote=="do1"){
            abc=74;
        }
        
        Synthesizer synth = MidiSystem.getSynthesizer();
        
        synth.open();
        MidiChannel[] channels = synth.getChannels();
        Instrument [] instrus = synth.getDefaultSoundbank().getInstruments();
        synth.loadInstrument (instrus[1] );
        channels[2].noteOn(abc,600);
        Thread.sleep(500);
    }
    
    
    //////////Get Set///////////////////
    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public String getInstru() {
        return instru;
    }

    public void setInstru(String instru) {
        this.instru = instru;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

}
