package com.mycompany.bibliotecavirtual;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    final List<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
        System.out.println("Libro agregado: " + libro.getTitulo());
    }

    public void mostrarLibrosDisponibles() {
        System.out.println("\nLista de libros disponibles:");
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).isDisponible()) {
                System.out.println((i + 1) + ". " + libros.get(i).getTitulo() + " por " + libros.get(i).getAutor());
            }
        }
    }

    public void mostrarDetallesLibro(int indice) {
        if (indice >= 0 && indice < libros.size()) {
            System.out.println(libros.get(indice).infoLibro());
        } else {
            System.out.println("Índice de libro no válido.");
        }
    }

    public void prestarLibro(int indice) {
        if (indice >= 0 && indice < libros.size()) {
            Libro libro = libros.get(indice);
            if (libro.isDisponible()) {
                libro.setDisponible(false);
                System.out.println("Has prestado el libro: " + libro.getTitulo());
            } else {
                System.out.println("El libro ya ha sido prestado.");
            }
        } else {
            System.out.println("Índice de libro no válido.");
        }
    }

    public void devolverLibro(int indice) {
        if (indice >= 0 && indice < libros.size()) {
            Libro libro = libros.get(indice);
            if (!libro.isDisponible()) {
                libro.setDisponible(true);
                System.out.println("Has devuelto el libro: " + libro.getTitulo());
            } else {
                System.out.println("El libro ya esta disponible.");
            }
        } else {
            System.out.println("Índice de libro no válido.");
        }
    }

    public void donarLibro(String titulo, String autor, int anioPublicacion, String genero) {
        agregarLibro(new Libro(titulo, autor, anioPublicacion, genero));
        System.out.println("Gracias por donar el libro: " + titulo);
    }
}