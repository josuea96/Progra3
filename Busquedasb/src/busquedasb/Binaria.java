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
 * Josue Alexis Ramírez 513622
 * Jose María de la Garza 513097
 * Luis Iván García
 * 3er Semestre ITIC
 */
public class Binaria extends Busqueda{/*Creación de la clase hija Binaria, la cual hereda de la Busqueda el método abstracto buscar,
    en esta clase se implementará dicho método, haciendo énfasis en el tipo de búsqueda binaria, 
    la cual puede ser realizada solamente en un arreglo ordenado
    */
    
    @Override//Se utiliza el comando override para indicar que esta es la implementación del método buscar en la clase padre
    public int buscar(int a) {/*
        Implementación del método abstracto buscar, para la clase Binaria, el cuál hará  una busqueda binaria
        de un determinado dato dentro de un arreglo
        */
        int inicio, fin, centro, valorCentro;//Declaracion de variables 
        
        inicio = 0;//inicializar inicio en 0
        fin = getVector(a).length - 1;// el valor de fin sera igual a la longitud del vector menos 1
        while(inicio < fin){//Mientras el valor de inicio se menor que fin entonces 
          centro = (inicio + fin)/ 2;//Centro valdra (inicio + fin) entre dos
          valorCentro = getVector(a)[centro];// el valor del centro, tomará el valor de la posición centro dentro del arreglo
          if(valorCentro == solicitarElemento()){//Si el valor del centro es igual al valor solicitado por el usuario, entonces
              return centro;//regresamos el valor de centro, pues es el que buscamos
          }else{//Sino 
              if(solicitarElemento() < valorCentro){/*si el valor solicitado es menor a valor centro, entonces
                  el valor de fin tomara el valor de centro de -1, lo cual lo recorrera a un espacio antes de centro, sino
                  inicio tomaría el valor de cantro +1 recorriendole a un espacio delante de centro
                  
                  */
                  fin = centro - 1;
              }else{
                  inicio = centro +1;
              }
                  
          }
              
          
        }
        return -1;//Si el ciclo termina y no se encontro el elemento entonces se regresa -1
       
        
        
    }
    
}
