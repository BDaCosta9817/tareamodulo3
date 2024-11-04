package com.mycompany.bibliotecavirtual;

public class Libro {
    private final String titulo;
    private final String autor;
    private final int anioPublicacion;
    private final String genero;
    private boolean disponible;

    // Constructor
    public Libro(String titulo, String autor, int anioPublicacion, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.genero = genero;
        this.disponible = true;  // Los libros nuevos están disponibles por defecto
    }

   //permite acceder a lo atribulos
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public String getGenero() {
        return genero;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    //  Información del libro
    public String infoLibro() {
        return "Título: " + titulo + "\nAutor: " + autor + "\nAño de publicación: " + anioPublicacion +
                "\nGénero: " + genero + "\nDisponible: " + (disponible ? "Sí" : "No");
    }
}