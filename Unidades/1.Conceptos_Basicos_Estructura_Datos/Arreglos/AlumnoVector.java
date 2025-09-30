package mx.edu.uttt.Arreglos;

import mx.edu.uttt.poo.Alumno;

import javax.swing.*;

public class AlumnoVector  {
    public static void main(String[] args) {
        int tamanio = 0;
        tamanio = obtenerTamanio();
    }

    public static int obtenerTamanio(){
        return Integer.parseInt
                (JOptionPane.showInputDialog("Introduce el numero de Alumnos"));
    }

    public static String menu (){
        return "==== MENU PRINCIPAL ====\n" +
                "1) Llenar Arreglo\n" +
                "2) Imprimir Arreglo \n" +
                "3) salir\n"+
                "Elegir opcion";
    }

    public static void operaciones(Alumno[] alumnos){
        String opcion = "";
        boolean sentinel = true;

        do {
            opcion = JOptionPane.showInputDialog(menu());
            switch (opcion){
                case "1":
                    //llenar arreglo
                    break;
                case "2":
                    // imprimir arreglo
                    break;
                case "3":
                    //salir arreglo
                    JOptionPane.showMessageDialog(null,"bye");
                    sentinel = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opcion invalida");
            }
        }while (sentinel);
    }

    public static void llenarArreglo (Alumno [] alumnos){
        int i = 0;
        boolean activo = false;
        while (i< alumnos.length){
            Alumno a1 = new Alumno();
            a1.setNombre(JOptionPane.showInputDialog
                    ("Introduce el nombre del alumno [ "+ i + " ]"));
            a1.setEdad(Integer.parseInt(JOptionPane.showInputDialog
                    ("Introduce la edad del alumno [ "+ i + " ]")));
            a1.setSexo(JOptionPane.showInputDialog
                    ("Introduce la edad del alumno [ "+ i + " ]").charAt(0));
            activo = JOptionPane.showInputDialog("Introduce estatus del alumno " + "[ "+ i + " ]").equalsIgnoreCase("Activo ")?true:false;
            a1.setActivo(activo);
            a1.setPromedio(Double.parseDouble(JOptionPane.showInputDialog
                    ("Introduce el promedio del alumno [ "+ i + " ]")));

            alumnos[i] = a1;
            i++;
        }
    }
}
