package algoritmosBusqueda;

//busqueda simple o secuencial

import java.util.Scanner;

public class busquedaSimple {
       
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int i=0;
        boolean band=false;
        int x;
        int repet;
        int v[]= new int[10];
        System.out.print("introduce los datos del arreglo\n");
        for(int c=0;c<v.length;c++){
            v[c]=leer.nextInt();
        }
        System.out.println("\t");
        System.out.println("introduzca elemento a buscar");
        x = leer.nextInt();
        do{
            if(v[i]==x){
                band=true;
            }else {
                band=false;
            }
        i++;
        }while(i<v.length && band==false);
            if(band==true){
                System.out.println("el elemento esta en la posicion "+ i);
            }else if(band==false){
                System.out.println("el elemento no esta en la lista");
            }
        }
    }
