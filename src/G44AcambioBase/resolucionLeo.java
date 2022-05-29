package G44AcambioBase;

public class resolucionLeo {
    public static void main(String[] args) {
        int numero = 5;
        System.out.println(decimalABinario(numero));
    }

    public static String decimalABinario(int num){
        String cadenaBinario = "";
        int restoNum;
        int cociente;

        if(num<2){
            cadenaBinario = "1";
        }else{
            restoNum = num%2;
            cociente = num/2;
            cadenaBinario += decimalABinario(cociente) + restoNum;
        }
        return cadenaBinario;
    }
}
