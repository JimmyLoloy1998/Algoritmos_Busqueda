package algoritmosBusqueda;

class BusquedaAlgoritmo {
    public static int buscar( int [] arreglo, int dato) {
        int inicio = 0;
        int fin = arreglo.length - 1;
        int pos;
        while (inicio <= fin) {
            pos = (inicio+fin) / 2;
            if ( arreglo[pos] == dato )
                return pos;
            else if ( arreglo[pos] < dato ) {
            inicio = pos+1;
            } else {
                fin = pos-1;
            }
        }
    return -1;
    }
}

public class BusquedaBinaria2 {
    public static void  main (String args[]) {
    // Llenar arreglo
        int [] edades = new int [21];
        for (int i = 0; i < edades.length ; i++)
            edades[i] = i*2 ;
    // Mostrar arreglo.
        for (int i = 0; i < edades.length ; i++)
            System.out.println ("edades["+i+"]: "+  edades[i]);
        int resultado = BusquedaAlgoritmo.buscar(edades, 20);
        if (resultado != -1) {
            System.out.println ("Encontrado en posicion: "+  resultado);
            } else {
                System.out.println ("El dato no se encuentra en el arreglo, o el arreglo no esta ordenado");
            }

    }
}
