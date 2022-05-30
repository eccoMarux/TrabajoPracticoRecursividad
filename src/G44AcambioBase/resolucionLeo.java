package G44AcambioBase;

public class resolucionLeo {
    public static void main(String[] args) {
        int numero = 5;
        System.out.println(decimalABinario(numero));
    }

    public static String decimalABinario(int num){
        //Para convertir un numero decimal a binario:
        //-Tomamos los restos de las divisones sucesivas de un numero X
        //-Una vez hechas estas divisones con sus respectivos restos, se anotan los mismos de atras hacia adelante
        String cadenaBinario = "";
        int restoNum;
        int cociente;

        if(num<2){ //Mientras el numero sea menor a 2 se podria seguir dividiendo 
            cadenaBinario = "1";
        }else{
            restoNum = num%2;
               //El resto de la divison del numero que se iria guardando en una cadena de texto en el apilado 
            cociente = num/2;
                //Guardo el cociente del numero para que entre en la recursividad
            cadenaBinario += decimalABinario(cociente) + restoNum;
        }
        return cadenaBinario;
    }
}
