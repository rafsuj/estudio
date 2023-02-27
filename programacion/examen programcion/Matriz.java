import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[4][3];
        int nota = 0 ;
        for (int i = 0 ; i < matriz.length; i++){
            for (int j = 0 ; j  < matriz[i].length; j++){
                do {
                    System.out.println("Introduce la nota del alumno " + (i + 1) + " de la " + (j + 1) + "ª evaluación:");
                    try {
                        nota = Integer.parseInt(sc.next());
                    }catch (Throwable e){
                        System.out.println("la nota no es valida o  no puede contener decimales");
                        nota = Integer.parseInt(sc.next());
                    }finally {
                        if (nota >= 0 && nota <= 10) {
                            matriz[i][j] = nota;
                        } else {
                            System.out.println("nota fuera del rango  0 o 10 ");
                        }
                    }
                }while (!(nota >= 0) || !(nota <= 10));
            }
        }
        mostrarMedias(matriz);
    }

    private static void mostrarMedias(int[][] matriz) {
        float mediaclase = 0, num = 0;
        for (int i = 0 ; i < matriz.length; i++) {
            num = 0 ;
            for (int j = 0; j < matriz[i].length; j++) {
                num+= matriz[i][j];
            }
            System.out.println("la nota media del alumno"+(i+1)+" :");
            System.out.printf("%.2f",num/3);
            System.out.println();
            mediaclase += num;
        }
        System.out.println("la nota media de la clase es: ");
        System.out.printf("%.2f", mediaclase/4 );
        System.out.println();
    }


}
