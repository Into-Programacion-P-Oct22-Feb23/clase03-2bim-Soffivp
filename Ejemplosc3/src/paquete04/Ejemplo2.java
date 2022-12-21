/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

/**
 *
 * @author reroes
 */
public class Ejemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creación de arreglo bidimensionales
        
        double[][] dato1 = {{1, 2, 3},{6, 8, 9}}; //
        double[][] resultado = new double [2][3];
        double valor;
       
        for (int n1 = 0; n1 < dato1.length; n1++) {
            for (int n2 = 0; n2 < dato1[n1].length; n2++) {
                valor = dato1[n1][n2] ;
                if(dato1[n1][n2]%2 ==0){
                    resultado[n1][n2] = Math.pow(valor, 2) ;                   
                }else
                     resultado[n1][n2] = valor;
            }
        }
        /*
            1   4   3
            36  64  9
        */
          System.out.println("Presentación de valores del arreglo");
        for (int n1 = 0; n1 < resultado.length; n1++) {
            for (int n2 = 0; n2 < resultado[n1].length; n2++) {
                System.out.printf("%.0f\t", resultado[n1][n2]);
            }
            System.out.println(); // salto de línea
        }
        
        
    }
    
}
