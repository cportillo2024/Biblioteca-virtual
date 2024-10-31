public class Libro {
    private String titulo;
    private String autor;
    private int añoPublicacion;
    private String genero;
    private boolean disponible;

    public Libro(String titulo, String autor, int añoPublicacion, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
        this.genero = genero;
        this.disponible = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return añoPublicacion;
    }

    public String getGenero() {
        return genero;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void prestar() {
        if (disponible) {
            disponible = false;
            System.out.println("El libro '" + titulo + "' ha sido prestado.");
        } else {
            System.out.println("El libro '" + titulo + "' no está disponible.");
        }
    }

    public void devolver() {
        if (!disponible) {
            disponible = true;
            System.out.println("El libro '" + titulo + "' ha sido devuelto.");
        } else {
            System.out.println("El libro '" + titulo + "' ya está disponible.");
        }
    }

    public void mostrarInformacion() {
        String estado = disponible ? "Disponible" : "Prestado";
        System.out.println("Titulo: " + titulo + "\nAutor: " + autor + 
                           "\nAño de publicación: " + añoPublicacion + 
                           "\nGenero: " + genero + "\nEstado: " + estado + "\n");
    }
}
