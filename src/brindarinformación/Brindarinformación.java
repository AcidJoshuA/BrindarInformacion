/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package brindarinformación;

/**
 *
 * @author jcplo
 */
public class Brindarinformación {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Por favor, elegir una opción:");
    System.out.println("1. Artista");
    System.out.println("2. Película");
    System.out.println("3. Serie");
    System.out.println("4. Libro");
    System.out.println("5. Comida");
    int opcion = scanner.nextInt();
    scanner.nextLine(); // Limpiar el buffer de entrada
    switch (opcion){          
    System.out.print("Ingresar el nombre del artista: ");
    String artista = scanner.nextLine();
    System.out.println("Pablo Picasso fue un pintor y escultor español del siglo XX.");
    }elseif (artista.equalsIgnoreCase("Adele")) {
                    System.out.println("Adele es una cantante y compositora británica conocida por su poderosa voz y sus baladas emocionales.");
                } else {
                    System.out.println("Información no disponible sobre este artista.");
                }
                break;

            // Opción 2: Información sobre una película
            case 2:
                System.out.print("Ingresa el nombre de la película: ");
                String pelicula = scanner.nextLine();
                if (pelicula.equalsIgnoreCase("Inception")) {
                    System.out.println("Inception es una película de ciencia ficción dirigida por Christopher Nolan, sobre un ladrón que roba secretos mediante el uso de la tecnología.");
                } else if (pelicula.equalsIgnoreCase("The Matrix")) {
                    System.out.println("The Matrix es una película de ciencia ficción dirigida por las hermanas Wachowski, que explora la realidad virtual y la percepción de la realidad.");
                } else {
                    System.out.println("Información no disponible sobre esta película.");
                }
                break;

            // Opción 3: Información sobre una serie
            case 3:
                System.out.print("Ingresa el nombre de la serie: ");
                String serie = scanner.nextLine();
                if (serie.equalsIgnoreCase("Breaking Bad")) {
                    System.out.println("Breaking Bad es una serie de televisión estadounidense que sigue a un profesor de química convertido en fabricante de metanfetaminas.");
                } else if (serie.equalsIgnoreCase("Stranger Things")) {
                    System.out.println("Stranger Things es una serie de ciencia ficción y terror ambientada en los 80 que involucra fenómenos paranormales y criaturas extrañas.");
                } else {
                    System.out.println("Información no disponible sobre esta serie.");
                }
                break;

            // Opción 4: Información sobre un libro
            case 4:
                System.out.print("Ingresa el nombre del libro: ");
                String libro = scanner.nextLine();
                if (libro.equalsIgnoreCase("1984")) {
                    System.out.println("1984 es una novela distópica de George Orwell que describe un régimen totalitario que controla todos los aspectos de la vida de las personas.");
                } else if (libro.equalsIgnoreCase("To Kill a Mockingbird")) {
                    System.out.println("To Kill a Mockingbird es una novela de Harper Lee que aborda temas de racismo y justicia en el sur de los Estados Unidos.");
                } else {
                    System.out.println("Información no disponible sobre este libro.");
                }
                break;

            // Opción 5: Información sobre una comida
            case 5:
                System.out.print("Ingresa el nombre de una comida: ");
                String comida = scanner.nextLine();
                if (comida.equalsIgnoreCase("Pizza")) {
                    System.out.println("La pizza es un platillo italiano que consiste en una masa redonda cubierta con salsa de tomate, queso y diversos ingredientes.");
                } else if (comida.equalsIgnoreCase("Sushi")) {
                    System.out.println("El sushi es un platillo japonés que consiste en arroz acompañado de pescado crudo, mariscos u otros ingredientes.");
                } else {
                    System.out.println("Información no disponible sobre esta comida.");
                }
                break;

            // Si se ingresa una opción inválida
            default:
                System.out.println("Opción no válida. Por favor ingresa un número entre 1 y 5.");
    break;
    }
    scanner.close();
    }
}
