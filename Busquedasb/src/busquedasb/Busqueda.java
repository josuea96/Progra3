/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busquedasb;

import java.util.Scanner;//Se importa el paquete java.util.Scanner para utilizar la clase Scanner y leer los datos introducidos por el usuario

/*
 * Ana Teresa Ramírez Morones
 * 512873
 * Josue Alexis Ramírez 513622
 * Jose María de la Garza 513097
 *Luis Iván García
 * 3er Semestre ITIC
 */

public abstract class Busqueda {/*
    Creación de la clase Padre  BUSQUEDA,la cual es abstracta por lo que un método llamado buscar no estará instanciado
    es decir no tendrá indicaciones, ya que estan se darán en dos clases hijas llamadas Secuencia y Binariam cada una contendrá el tipo de 
    busqueda con los mismos nombres
    */
    int [] vectorS;/*Declaración del atributo vectorS (secuencial), se utiliza el encapsulamiento
    para que éstos atributos permanezcan privados y solo sean accedidos por las clases hijas
    */
    int [] vectorB;/*Declaración del atributo vectorB (binario), se utiliza el encapsulamiento
    para que éstos atributos permanezcan privados y solo sean accedidos por las clases hijas
    */

    public Busqueda(int[] vectorS, int[] vectorB) {/*Constructor de la clase, que inicializa
        los atributos de la clase, es decir el vector Secuencial y el vector Binario*/ 
        this.vectorS = vectorS;//Se asigna el atributo vector a la variable del mismo nombre, por lo que se usa el this
        this.vectorB = vectorB;//Se asigna el atributo vector a la variable del mismo nombre, por lo que se usa el this
    }

    public Busqueda(){/*Segundo constructor de la clase Busqueda, en donde le usuario
        no necesita dar atributos para crear el objeto*/
        this.vectorS = vectorS;//Se asigna el atributo vector a la variable del mismo nombre, por lo que se usa el this
        this.vectorB = vectorB;//Se asigna el atributo vector a la variable del mismo nombre, por lo que se usa el this
    }
    
    public int [] getVector(int a){/*Se crea el método vector en donde se determinará cual de las dos variables, 
        se utilizará, utilizamos la introducción de una variable a, para crear una condicional y regresar un vector u otro.
        */
        if (a == 1){//Si a es igual a 1, entonces se escogerá (el método regresará) el vector tipo secuencial
            return vectorS;//Se da la orden de devolver el vector secuencial
        }
        else{//si la anterior condición no se cumple, entonces el programa devolverá el vector binario
            return vectorB;
        }
    }//Final del método getVector
    
    public void crearVector(int a){/*
        Se crea el método crearVector(igualmente se introduce el entero a, por el uso que se da al método anterior [getVector()] y la necesidad
        de especificar el tipo de vector que regresará), el propósito de este método es llenar el arreglo en el que se buscará
        un número determinado por el usuario.
        */
        Scanner sc;/*Se utiliza la clase Scanner y se le da el nombre sc el cual utilizaremos para introducir datos
        */
        sc = new Scanner(System.in);//Con esta línea se crea el objeto sc del tipo Scanner, y se establece que la información será introducida por el usuario (System.in)
        System.out.println("Escribe el tamaño del arreglo: ");//Se muestra mensaje en pantalla
        int n = sc.nextInt();//A la variable n del tipo entero se le asigna cualquier valor que sea introducido por el usuario       
       
      for (int i = 0; i < n; i++){/*
          Se crea un ciclo for para la introducción de los datos dentro del arreglo, la primera parte inicializa un contador llamado i
          para llevar el control de las "vueltas que dará el ciclo, la segunda parte establece la condición que detendrá el curso del ciclo
          */
          System.out.println("Escribe el dato " + i + " : ");//Se muestra en pantalla un mensaje para dar indicación al usuario de lo que se le esta pidiendo
                
        	getVector(a)[i] = sc.nextInt();/*Aquí es donde se da la orden para que cada uno de los datos introducidos 
                por el usuario se guarden en un espacio del arreglo
                */
    }
    
    
}//Fin de crear vector
    
    public int solicitarElemento(){/*Creación del método solicitarElemento, en el cual se pedira al usuario el número que desea buscar en el arreglo
        en este metodo no se solicita ningun atributo, pues solamente se utilizará para guardar en la memoria un número determiando por el usuario
        */
        Scanner sc;//Nuevamente se utiliza la clase Scanner y se le da el nombre sc el cual utilizaremos para introducir datos
        sc = new Scanner(System.in);//Con esta línea se crea el objeto sc del tipo Scanner, y se establece que la información será introducida por el usuario (System.in)
       System.out.println("¿Escribe el elemento que deseas buscar ");//Muestra un mensaje en pantalla la usuario
       int e = sc.nextInt();//Se declara la variable e de tipo entero y se le asigna el valor introducido por el usuario, con la ayuda de la clase Scanner
       return e;//Para terminar este método "se regresa" o se guarda el valor de la variable e 
    }//Fin de solicitar elemento
    
    public void mostrarArreglo(int a, int [] vector){/* Creamos este método con el propósito de verificar
        la correcta implementación del arreglo, y de manera estética para checar que todos los valores introducidos por el usuario
        efectivamente esten en el vector
        */
        for ( int i = 0; i < getVector(a).length; i++){/*Nuevamente en este método se hace uso del ciclo for
            en el que la primera parte se utiliza para declarar un contador llamado i, que nos ayudará a supervisar el número de veces que se llevará a cabo la actividad
            dentro del for, la segunda parte determina un límite para que termine el proceso y la última es la función propiamente de un contador. 
            */
          System.out.println(" | " + getVector(a)[i] );/*Esta línea es la que servirá para mostrar en pantalla el arreglo con los datos introducidos por el
          usuario. La función getVector(a) es la que propiamente contiene el arreglo y la i simboliza el espacio indicado (y por supuesto el valor guardado en el)
          */
          
        	
    }//Fin de for
    
}//Fin de mostrar arreglo
    
    public void mostrarResultado(int n){/*Creaci+on del método
        encargado de mostrar al usuario si el número que buscaba se encuentra o no dentro del 
        vector que introdujo previamente, la variable n será representada por el valor
        que se obtenga del método buscar
        */
        
        if (n != -1){/*
            Se utiliza una condicional en donde el valor de n será representado por el resultado númerico obtenido
            del método buscar, se establece que sea difente de -1 ya que en el método buscar se estableció que 
            cuando el número no fuera encontrado se regresará un -1, además que en un arreglo
            no es posible la existencia de una posición -1
            */
            System.out.println("El número que busca si se encuentra dentro del arreglo en la posición " + n);//Muestra en pantalla al usuario qeu si se encontro el número y su posición
        }else{//Si la condición anterior no se cuumple se muestra un mensaje que diga que el número no esta dentro del arreglo
            System.out.println("El número solicitado no esta dentro de éste arreglo ¡Lo sentimos, intentalo de nuevo!");
        }
    }
    
    abstract public int buscar(int a);/*Declaración del método abstracto correr que será implementado en cada una 
    de las clases hijas (Secuencia, Binaria) con el uso de @Override*/
    

}
