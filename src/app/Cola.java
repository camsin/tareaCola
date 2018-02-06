
package app;

import java.util.ArrayList;

/**
 *
 * @author camendez
 */

public class Cola extends ArrayList{
    
public Integer maxSize = null;
    
 public Cola(Integer maxSize){
    this.maxSize = maxSize;
 }
 //se añade un elemento a la cola. Se añade al final de esta.
 public void encolar(Object dato){
     if(this.size() >= this.maxSize){
        System.out.println("La cola esta llena.");
     }else{
         if(dato != null){
            this.add(dato);
        }else{
         System.out.println("Introduzca un dato no nulo");
        }  
     }
 }

 //se elimina el elemento frontal de la cola, es decir, el primer elemento que entró.
 public void desencolar(){
  if(this.size() > 0){
   this.remove(0);
  }
 }
 
 //se devuelve el elemento frontal de la cola, es decir, el primer elemento que entró.
 public Object frente(){
  Object datoAuxiliar = null;
  if(this.size() > 0){
   datoAuxiliar = this.get(0);
  }
  return datoAuxiliar;  
 }
 
 //devuelve cierto si la pila está vacía o falso en caso contrario (empty).
 public boolean vacia(){
  return this.isEmpty();
 }
 
 //devuelve cierto si la pila está llena o falso en caso contrario (empty).
 public boolean llena(){
    if(this.size() >= this.maxSize){
        return true;
    }else{
        return false;
    }
 }
}
