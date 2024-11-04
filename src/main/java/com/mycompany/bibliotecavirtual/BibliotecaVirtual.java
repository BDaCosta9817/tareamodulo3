//Blanca Da Costa Gomez Carcamo 
//202310010031
//Link del video con la explicacion del codigo:
/*https://youtu.be/VmLsI7HS580*/
//Programa Bibliteca Virtual(Consta de clases libro,Biblioteca)
package com.mycompany.bibliotecavirtual;

import java.util.Scanner;

public class BibliotecaVirtual {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        // Agregar algunos libros
        try (Scanner scanner = new Scanner(System.in)) {
            // Agregar algunos libros
            biblioteca.agregarLibro(new Libro("Las 48 leyes del poder", "Robert Greene", 1998, "Literario"));
            biblioteca.agregarLibro(new Libro("El principe", "Nicolas Maquiavelo", 1532, "Literario"));
            biblioteca.agregarLibro(new Libro("El Arte de la Guerra", "Sun Tzu", 1772, "No-ficcion"));
            biblioteca.agregarLibro(new Libro("Sapiens:De animales a Dioses", "Yuval Noah Harari", 2011, "Literario"));
            biblioteca.agregarLibro(new Libro("21 Cualidades de un lider", "John C. Maxwell", 1999, "Literario"));
            
            
            // Mensaje de bienvenida
            System.out.println("Bienvenido a la Biblioteca Virtual:)");
            System.out.println("Contamos con más de " + biblioteca.libros.size() + " libros disponibles.");
            
            boolean continuar = true;
            while (continuar) {
                biblioteca.mostrarLibrosDisponibles();
                
                System.out.println("\nElige un número para ver los detalles del libro o 0 para salir:");
                int eleccion = scanner.nextInt() - 1; 
                
                if (eleccion == -1) {
                    continuar = false; // Salir del bucle
                } else {
                    biblioteca.mostrarDetallesLibro(eleccion);
                    System.out.println("\n¿Quieres prestar este libro? (s/n)");
                    char opcion = scanner.next().charAt(0);
                    if (opcion == 's') {
                        biblioteca.prestarLibro(eleccion);
                    }
                    
                    System.out.println("\n¿Quieres devolver este libro? (s/n)");
                    char devolver = scanner.next().charAt(0);
                    if (devolver == 's') {
                        biblioteca.devolverLibro(eleccion);
                    }
                    
                    System.out.println("\n¿Quieres donar un nuevo libro? (s/n)");
                    char donar = scanner.next().charAt(0);
                    if (donar == 's') {
                        scanner.nextLine(); // Consumir la nueva línea
                        System.out.println("Introduce el título del libro:");
                        String titulo = scanner.nextLine();
                        System.out.println("Introduce el autor del libro:");
                        String autor = scanner.nextLine();
                        System.out.println("Introduce el año de publicación del libro:");
                        int anio = scanner.nextInt();
                        scanner.nextLine(); // Consumir la nueva línea
                        System.out.println("Introduce el género del libro:");
                        String genero = scanner.nextLine();
                        biblioteca.donarLibro(titulo, autor, anio, genero);
                    }
                }
            }
            
            System.out.println("Gracias por usar la Biblioteca Virtual!");
        }
    }
}