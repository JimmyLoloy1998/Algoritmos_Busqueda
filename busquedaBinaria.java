package algoritmosBusqueda;

import java.util.Scanner;

public class busquedaBinaria {
    public static int busquedaBinaria(int  vector[],int target){
        int n = vector.length;
        int centro, min = 0, max = (n-1);
        while(min <= max){
            centro = (max + min)/2;
            if(vector[centro] == target) return centro;
            else if(target < vector[centro] ){
                max = centro-1;
            }else {
                min = centro+1;                
            }
        }
        return -1;
    }
    public static void main(String []args){
        System.out.println("Vector:");
        int v[] = {1, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        for(int i=0;i<v.length;i++){
            System.out.println(v[i]+" ");
        }
        int valorBuscado = 73;
        System.out.println("\nEl valor buscado: "+valorBuscado);
        System.out.print("Numero en la posicion \t");
        System.out.println(busquedaBinaria(v, valorBuscado));
    }
}

