
package operacionesbasicas;

/**
 *
 * @author EmmanuelR
 * 
 * Programa para realizar operaciones básicas :
 * suma, resta, multiplicación y division.
 * 
 */

public class OperacionesBasicas {
    
    int valor1 = 10, valor2 = 8;
    float suma, resta, multiplicación, division;

public void SUMA1(){
        //Realiza el cálculo de la suma
        suma=valor1+valor2;
        System.out.println("La suma de: "+valor1+" y "+valor2+" es: "+suma);
    }
public void RESTA1(){
         //Realiza el cálculo de la resta
         resta=valor1-valor2;
         System.out.println("La resta de: "+valor1+" y "+valor2+" es: "+resta);
     }
public void MULTIPLICACION1(){
        //Reliza el cálculo de la multiplicación
        multiplicación = valor1 * valor2;
        System.out.println("La multiplicacion de: "+valor1+" y "+valor2+" es: "+multiplicación);
     } 
public void DIVISION1(){
          //Realiza el cálculo de la división
          division=valor1/valor2;
          System.out.println("La division de: "+valor1+" y "+valor2+" es: "+division);
         }
    public static void main(String[] args) {        
        OperacionesBasicas SUMA1 = new OperacionesBasicas();
        SUMA1.SUMA1();
        OperacionesBasicas RESTA1 = new OperacionesBasicas();
        RESTA1.RESTA1();
        OperacionesBasicas MULTIPLICACION1 = new OperacionesBasicas();
        MULTIPLICACION1.MULTIPLICACION1();
        OperacionesBasicas DIVISION1 = new OperacionesBasicas();
        DIVISION1.DIVISION1();
    }
    
}
