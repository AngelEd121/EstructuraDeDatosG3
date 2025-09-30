``` JAVA 
package mx.edu.uttt.Arreglos;

import javax.swing.*;

public class VectoresDoubles {
    public static void main(String[] args) {
        int tamanio = 0;
        tamanio = obtenerTamanio();
        double arr [] = new double[tamanio];
        llenarArreglo(arr);;
        imprmir(arr);
    }

    public static int obtenerTamanio (){
        return Integer.parseInt(JOptionPane.showInputDialog("Introduce Tamaño del arreglo"));
    }

    public static void llenarArreglo (double [] vector){
        for (int i=0; i< vector.length; i++){
            vector[i] = Double.parseDouble(JOptionPane.showInputDialog
                    ("introduce el valor de la posicion [ " + i + " ]"));
        }
    }

    public static void imprmir( double vector []){
        String salida = "";
        for(double valor: vector){
            salida += "| " + valor +" |";
        }

        JOptionPane.showMessageDialog(null, salida);
    }
}
