/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busquedasb;

import java.util.Scanner;

/**
 *
 * Ana Teresa Ramírez Morones
 * 512873
 *  * Josue Alexis Ramírez 513622
 * Jose María de la Garza 513097
 * Luis Iván García
 * 3er Semestre ITIC
 */
public class Busquedasb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//Se inicializa una variable tipo Scanner
        //para poder preguntarle al usuario que tipo de vector quiere para el programa
        //ya sea de tipo secuencial o binario
     
       int vector1[] = new int [1000];//Se declara un arreglo vector para determinar
       //el rango que va a tener
       int vector2[] = new int [1000];
       int num;//Se declara la variable num para poder llamar al objeto que se encuentra en la clase Busqueda
       
       System.out.println("¿Qué tipo de vector quieres crear? 1. Secuencial 2. Binario");
       //Se hace un print preguntandole al usuario que tipo de vector quiere utilizar
       //si uno secuencial o binario, pero se guardara con el valor 1 la de tipo secuencial
       //si el usuario da un número diferente de 1, sera de tipo binario
        int a = sc.nextInt();//El número que proporciono el usuario se guardara en la variable de tipo int
        if (a == 1){
            Secuencia buscarS = new Secuencia();//Se crea el objeto buscarS que manda a llamar al metodo
            //que se encuentra en la clase busqueda y usar la busqueda Secuencial
            buscarS.crearVector(1);//Se manda a llamar al metodo crearVector que se usara para pedir el tamaño
            //del arreglo y a su vez pedirle al usuario que números va a usar
            vector1 = buscarS.getVector(1);//Después de cumplir la función anterior, los valores que se pidieron
            //para el arreglo se van a desplegar
            }
        else{
            Binaria buscarB = new Binaria();//Se crea el objeto buscarB que manda a llamar al metodo
            //que se encuentra en la clase busqueda y usar la busqueda Binaria
            vector2 = buscarB.getVector(0);//Se regresaran los números que se encuentran en el arreglo
            num = buscarB.solicitarElemento();//El usuario dara el número que quiere buscar
        }
    }
    
}
