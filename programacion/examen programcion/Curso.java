public class Curso {
    public static void main(String[] args) {
        Persona p1 = new Persona("Manolo",14);
        Persona p2 = new Persona("Paco",14);
        Persona p3 = new Persona("Rafael",14);
        Persona p4 = new Persona("Emilio",14);

        Alumno al1 = new Alumno(  p1, 1);
        Alumno al2 = new Alumno( p2,2);
        Alumno al3 = new Alumno( p3,3);
        Alumno al4 = new Alumno(p4,4);

        Oyente oy = new Oyente(p1, 21);

        al1.setNotas();
        al2.setNotas();
        al3.setNotas();
        al4.setNotas();

        System.out.println("la media del curso es "+al1.mediaCurso());
    }
}
