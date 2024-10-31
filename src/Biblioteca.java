import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
        System.out.println("El libro '" + libro.getTitulo() + "' ha sido agregado a la biblioteca.");
    }

    public void buscarLibro(String query) {
        boolean encontrado = false;
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(query) || libro.getAutor().equalsIgnoreCase(query)) {
                libro.mostrarInformacion();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron libros que coincidan con la búsqueda: '" + query + "'.");
        }
    }

    public void prestarLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                libro.prestar();
                return;
            }
        }
        System.out.println("El libro '" + titulo + "' no se encuentra en la biblioteca.");
    }

    public void devolverLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                libro.devolver();
                return;
            }
        }
        System.out.println("El libro '" + titulo + "' no se encuentra en la biblioteca.");
    }

    public void mostrarLibrosDisponibles() {
        boolean hayLibrosDisponibles = false;
        for (Libro libro : libros) {
            if (libro.isDisponible()) {
                libro.mostrarInformacion();
                hayLibrosDisponibles = true;
            }
        }
        if (!hayLibrosDisponibles) {
            System.out.println("No hay libros disponibles en la biblioteca.");
        }
    }
}
