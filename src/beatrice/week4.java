/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beatrice;

/**
 *
 * @author hp
 */
public class week4 {
      public static void main(String[] args) {
          //Types of loops:
          //1. For loop
          
          //starting point 0, followed by range 0 to 4, followed by increment or decrement. eg; (x++ or x--)
          //The increment or decrement is optional but its adviced we put a value.
          //If you want to increment or decrement by a certain number,we use (x+= or x-=)
//          for(int x=190; x>150; x-=2){
//              System.out.println(x);
//              
//          }
         //2. While loop  
         
////         int x = 4;
////         
////         
////         //this is the condition that has to be met for it to run
////         //An exclamation mark means the statement is negative
////         
////         while(x<50){
////             
////             System.out.println(x);
////             x+=8;
////         }

String[] names = new String[]{"Kamau", "Mungai", "Ndonga", "Maha", "Kairetu", "Kulture", "Meeeee"};   
int[] ages = new int[]{14, 24, 34, 44, 17, 19, 26};
double weight =45.0;
 float height = 1.6f;   
 
        



int y = 2;
          while (y>10){
          
           y-=100;
          
          }
          for (int x=2; x<names.length; x+=2){
                System.out.println(names[x]+ ages[x]);
    
}
          
           
         
           System.out.println(y);
      }
}
