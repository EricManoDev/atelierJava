/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.test;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Formation
 */
public class Variablestest 
{
   
    //@Test
    
    public void testConcerneKingstonEtJamaique ()
            
   {}
//        
//        String txt1 = new String ("couCOU123!");
//        String txt2= txt1.toUpperCase();
//        
//       System.out.println(txt2);
   
// ex 1
//        String a = "Jamaïque";
//        String b = "Kingston";
//        String c = b.toUpperCase() + ", " + a.toUpperCase();
//
//        System.out.println (c);    
//    ex 2    
//        int a = 123;
//        String b = "coucou";
//        String c = new String (a+b);
//        String d = new String (b+a);
//        
//        System.out.println(c);
//        System.out.println(d);
       
       
// ex 3
       
//       {
//       int a = 10;
//       String b = "20";
//       int c = a + Integer.parseInt(b);
//       int d = Integer.parseInt(b) + a;
//       
//               
//        System.out.println("a + b = " + c);
//        System.out.println("b + a = " + d);
//       
//        }
// 
      @Test
      public void test4 (){
              
        System.out.println( carre(11));
      }
    
      public int carre (int nb){
        
          
       return nb*nb;
        
        }
      
      @Test
      public void testConcatene (){
          String a = "maison";
          String b = "blanche";
          String c = concatene (a,b);
                  
         System.out.println(c);
      }

      public String concatene(String a, String b){
          
          String c = a + " " + b;
          return c;
      }
           @Test
    
      public void testIntPuissance (){
          
          int n = 3;
          int p = 4;
          int a = n*(n*p);
          
      }
}