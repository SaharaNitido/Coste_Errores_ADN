/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_adn;

/**
 *
 * @author Mulay
 */
public class Ejercicio_ADN {

        public int costeErroresADN(String uno, String dos){
        //primera versión, usando los dos Strings que me pasan
        int coste = 0; //coste de los errores
        
        for (int i=0; i < uno.length(); i++){
            if(uno.charAt(i)== '-' || dos.charAt(i)== '-'){
                coste = coste + 2;
            } else {
                if(uno.charAt(i)== 'G' && dos.charAt(i) != 'C') {coste++;}
                if(uno.charAt(i)== 'C' && dos.charAt(i) != 'G') {coste++;}
                if(uno.charAt(i)== 'A' && dos.charAt(i) != 'T') {coste++;}
                if(uno.charAt(i)== 'T' && dos.charAt(i) != 'A') {coste++;}
            }
            
        }
        return coste;
        }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }
    
}
