/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a43cliente;

/**
 *
 * @author entrar
 */
public class A43Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int decimal = 2;
        String bin = decBin(decimal);
        System.out.println("El binario del número "+ decimal+ " es: "+bin);
        
        long factorial = factorial(4);
        System.out.println("El factorial de 4 es: " + factorial);
    }

    private static String decBin(int num) {
        decbin.DecimalBinario_Service service = new decbin.DecimalBinario_Service();
        decbin.DecimalBinario port = service.getDecimalBinarioPort();
        return port.decBin(num);
    }

    private static long factorial(int num) {
        org.factorial.Factorial_Service service = new org.factorial.Factorial_Service();
        org.factorial.Factorial port = service.getFactorialPort();
        return port.factorial(num);
    }
    
}
