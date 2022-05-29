package G45Dmensajes;

public class resolucion {
    public static void main(String[] args) {
        // 9, 28, 14, 7, 22, 11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2 , 1
        int numero = 9;

        System.out.println();
        mensajes(numero);
        System.out.println("\nLa suma de los valores da como resultado " + suma(numero) + " mensajes enviados.\n");
    }

    public static void mensajes(int num) {
        System.out.print(num + " ");
        if (num != 1) {
            if (num % 2 == 0) {
                mensajes(num / 2);
            } else {
                mensajes((num * 3) + 1);
            }
        }
    }

    public static int suma(int num) {
        int valores;
        if (num == 1) {
            valores = 1;
        } else {
            if (num % 2 == 0) {
                valores = num + suma(num / 2);
            } else {
                valores = num + suma((num * 3) + 1);
            }
        }
        return valores;
    }
}
