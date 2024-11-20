import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenidos a la inmersion en Java");
        // System.out.println("Pelicula Matrix");

        int fechaDeLanzamiento = 1999;
        double evaluacion = 4.5;
        boolean incluidoEnElPlanBasico = true;
        String nombre = "Matrix";
        String sinopsis = """
                La Mejor pelicula relacionada que toca de manera creativa lo que podria ser un mundo controlado por maquinas
                """;
        double mediaCalificacionUsuario = 0;

        System.out.println("Pelicula: " + nombre);
        System.out.println("Año de Estreno: " + fechaDeLanzamiento);
        System.out.println("Calificacion de la Pelicula: " + evaluacion);
        System.out.println("Disponibilidad en el plan Basico: " + incluidoEnElPlanBasico);

        double mediaEvaluacion = (4.5 + 4.8 + 3 + 5 + 3.8) / 5;
        System.out.println("Media de la evaluacion de Matrix: " + mediaEvaluacion);

        if (fechaDeLanzamiento < 2024) {
            System.out.println("Pelicula retro de valor audiovisual");
        }
        else {
            System.out.println("Pelicula de moda en el momento"); }

        for (int i = 0; i < 5; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Escribe tu calificacion en escala de 0 - 5 que le darias a Matrix");
            double calificacionMatrixUsuario = teclado.nextDouble();
            mediaCalificacionUsuario = (mediaCalificacionUsuario + calificacionMatrixUsuario);

        }
        System.out.println("La media de la pelicula " +
                "Matrix calculada es: " + mediaCalificacionUsuario / 5);




    }
}