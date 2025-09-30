package mx.edu.uttt.Arreglos;

import javax.swing.*;

public class OperacionesArreglos {
    private double [] vector;
    private final int TAMANIO = 5;

    public OperacionesArreglos(){
        this.vector = new double[TAMANIO];
    }

    public OperacionesArreglos(int tamanio){
        this.vector = new double[tamanio];
    }

    public OperacionesArreglos (double [] vector){
        this.vector = new double[vector.length];
        this.llenarArreglo(vector);
    }

    public void llenarArreglo (double [] vector){
        int i = 0;
        while (i<this.vector.length){
            this.vector[i] = vector[i];
            i++;
        }
    }

    public void llenarArreglo (){

        /*int i = 0;
        * do{
        * this.vector[i] =
        * Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor decimal"));
        * i++;
        * }while (i<this.vector.length);
        *  */
        for (int i = 0; i < this.vector.length; i++) {
            String llenar = JOptionPane.showInputDialog(
                    "Ingrese el valor para la posición " + i + ":",
                    "Llenar Arreglo");

            this.vector[i] = Double.parseDouble(llenar);
        }
    }

    public double sumarValores(){

        /*double suma 0.0;
        * for (int i = 0; i<this.vector.length; i++){
        * suma += this.vector[i];
        * }
        * return suma;*/
        double suma = 0;
        for (double valor: this.vector){
            suma += valor;
        }
        return suma;
    }

    public double obtenerValoresMaximos(){
        double valorMax = this.vector[0];
        for (double valor:this.vector){
            if (valor > valorMax){
                valorMax = valor;
            }
        }
        return valorMax;
    }

    public double obtenerValorMinimo(){
        double valorMin = this.vector[0];
        for (double valor: this.vector){
            if (valor < valorMin){
                valorMin = valor;
            }
        }
        return valorMin;
    }

    public boolean compararArreglos (double [] vector){
        if (this.vector.length != vector.length){

        }
        for (int i = 0; i < this.vector.length; i++){
            if (this.vector[i] != vector[i]){

            }
        }
        return true;
    }

    public void cambiarTamanio (int tamanio){
        double[] nuevo = new double[tamanio];
        if (tamanio < this.vector.length) {
            for (int i = 0; i < tamanio; i++) {
                nuevo[i] = this.vector[i];
            }
        } else { // Si el nuevo tamaño es mayor o igual
            for (int i = 0; i < this.vector.length; i++) {
                nuevo[i] = this.vector[i];
            }
        }
        this.vector = nuevo;
        nuevo = null;
    }

    public String buscarValor (double valor){
        /*boolean sentinel = false;
        * */
        for (int i = 0; i < this.vector.length; i++){
            if (this.vector[i] == valor){
                //sentinel = true;
                return "Valor " + valor + " encontrado en la posición " + i;
                //break;
            }
        }
        return "Valor " + valor + " no encontrado en el arreglo.";
    }

    public void imprimir(){

        String salida = "";
        for (double i : vector){
            salida += "| " + i + " |";

            JOptionPane.showMessageDialog(null,salida);
        }
    }

}
