/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmosdeordenacion;

/**
 *
 * @author guill
 */
public class AlgoritmosDeOrdenacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AlgoritmosDeOrdenacion ejercicios = new AlgoritmosDeOrdenacion();
        
        int[] lista1 = {57,22,11,13,21,7};
        
        ejercicios.ordenacionBurbuja(lista1);
    }
    
    public void ordenacionBurbuja (int [] listaNumeros){
        
        int almacen = 0;
        
       for(int j=1; j < listaNumeros.length; j++){
            for(int i=0; i< listaNumeros.length - j; i++){
                
                if(listaNumeros[i] > listaNumeros[i+1]){
                    almacen = listaNumeros[i];
                    listaNumeros[i] = listaNumeros[i+1];
                    listaNumeros[i+1] = almacen;
                }
            }
            
       }
        
        for(int x=0;x < listaNumeros.length; x++){
            System.out.print(listaNumeros[x] + " ");
        }
        System.out.println();
    }
    
}
