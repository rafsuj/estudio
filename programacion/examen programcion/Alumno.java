import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Alumno {
    private Persona per ;
    private static ArrayList notas = new ArrayList<Float>();
    private  int numalu;

    public Alumno(Persona per , int numalu ){
        this.per = per;
        this.numalu = numalu;
    }

    public int getNumalu() {
        return numalu;
    }

    public void setNumalu(int numalu) {
        this.numalu = numalu;
    }

    public ArrayList getNotas() {
        return notas;
    }

    public void setNotas() {
        Scanner sc = new Scanner(System.in);
        float nota = 0 ;
        for (int i = 0 ; i < 3 ; i ++) {
            do {
                System.out.println("Introduce la nota del alumno "+per.getNombre()+" para la evaluacion "+i);
                    nota = Integer.parseInt(sc.next());
                    if (nota >= 0 && nota <= 10) {
                        System.out.println();
                    } else {
                        System.out.println("nota fuera del rango  0 o 10 ");
                    }
                } while (!(nota >= 0) || !(nota <= 10));
           notas.add(nota);
        }
    }


    public float mediaCurso(){
        float media =  0;
        float nota = 0;
        Iterator it = this.notas.iterator();
        while(it.hasNext()){
            nota = (float) it.next();
            media +=nota;
        }
        return media / this.notas.size();
    }
}
