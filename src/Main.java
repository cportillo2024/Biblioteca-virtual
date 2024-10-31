import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);

        // Agregar algunos libros por defecto a la biblioteca
        biblioteca.agregarLibro(new Libro("El Quijote", "Miguel de Cervantes", 1605, "Novela"));
        biblioteca.agregarLibro(new Libro("Cien Años de Soledad", "Gabriel Garcia Márquez", 1967, "Realismo Magico"));
        biblioteca.agregarLibro(new Libro("El Principito", "Antoine de Saint-Exupery", 1943, "Fabula"));

        int opcion;
        do {
            System.out.println("\n--- Menu Biblioteca Virtual ---");
            System.out.println("1. Agregar un libro");
            System.out.println("2. Buscar libro por titulo o autor");
            System.out.println("3. Prestar libro");
            System.out.println("4. Devolver libro");
            System.out.println("5. Mostrar libros disponibles");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();  

            switch (opcion) {
                case 1: 
                    System.out.print("Ingrese el titulo del libro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Ingrese el autor del libro: ");
                    String autor = scanner.nextLine();
                    System.out.print("Ingrese el año de publicación: ");
                    int añoPublicacion = scanner.nextInt();
                    scanner.nextLine();  
                    System.out.print("Ingrese el genero del libro: ");
                    String genero = scanner.nextLine();
                    biblioteca.agregarLibro(new Libro(titulo, autor, añoPublicacion, genero));
                    break;
                case 2:
                    System.out.print("Ingrese el titulo o autor del libro que busca: ");
                    String query = scanner.nextLine();
                    biblioteca.buscarLibro(query);
                    break;
                case 3:
                    System.out.print("Ingrese el titulo del libro que desea prestar: ");
                    String tituloPrestar = scanner.nextLine();
                    biblioteca.prestarLibro(tituloPrestar);
                    break;
                case 4:
                    System.out.print("Ingrese el titulo del libro que desea devolver: ");
                    String tituloDevolver = scanner.nextLine();
                    biblioteca.devolverLibro(tituloDevolver);
                    break;
                case 5:
                    System.out.println("Libros disponibles en la biblioteca:");
                    biblioteca.mostrarLibrosDisponibles();
                    break;
                
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion no valida. Intente de nuevo.");
            }

        } while (opcion != 6);

        scanner.close();
    }
}
