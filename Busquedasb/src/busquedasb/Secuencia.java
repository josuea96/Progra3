/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busquedasb;

/**
 *
 * Ana Teresa Ramírez Morones
 * 512873
 *  * Josue Alexis Ramírez 513622
 * Jose María de la Garza 513097
 * Luis Iván García
 * 3er Semestre ITIC
 */
public class Secuencia extends Busqueda{/*
    Creación de la clase hija Secuencia, la cual hereda de la Busqueda el método abstracto buscar,
    en esta clase se implementará dicho método, haciendo énfasis en el tipo de búsqueda secuencial, 
    la cual puede ser realizada en un arreglo no ordenado, ya que recorrerá elemento por elemento hasta encontrar el dato deseado
    */

      
    
    @Override//Se utiliza el comando override para indicar que esta es la implementación del método buscar en la clase padre
    public int buscar(int a){/*
        Implementación del método abstracto buscar, para la clase Secuencia, el cuál hará  una busqueda serial
        de un determinado dato dentro de un arreglo
        */
      int i; //se declara una variable entera llamada i que será utilizada como contador
        boolean encontrado = false;//Creación de una bandera booleana para indicar si se encuentra o no un elemento
        for (i = 0; i < getVector(a).length && encontrado == false; i++){/*
            Al iniciar el ciclo se pondrá un cursor en la posición 0 del arreglo, el cual se irá cambiando conforme avanza el ciclo. la condición
            para detener el cilo es que el contador sea mayor o igual a la logitud del arreglo y mientras no se encuentre el elemento
            */
            if(solicitarElemento() == getVector(a)[i]){/*
                se usa otra condicional para decir que si el elemento que buscamos es igual elemento dentro de la posición 
                i del arreglo, entonces la bandera cambia a true y se regresa el valor de i 
                */
                encontrado = true;
                return i;
            }
    }
        return -1;//Si el ciclo termina y no se encontro el elemento entonces se regresa -1
        
  }

    
    
}
