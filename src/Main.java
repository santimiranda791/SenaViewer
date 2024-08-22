import edu.misena.senaviewer.model.Books;
import edu.misena.senaviewer.model.Chapters;
import edu.misena.senaviewer.model.Movies;
import edu.misena.senaviewer.model.Series;
import edu.misena.senaviewer.model.Magazines;
import java.util.Scanner;

public class Main {

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        Books libro1 = new Books("Cien años de soledad", 1967-05-10, "Editorial Sudamericana", 1010);
        Books libro2 = new Books("El gran Gatsby", 1925 / 04 / 10, "Charles Scribner's Sons", 1092);
        Books libro3 = new Books("Orgullo y prejuicio", 1813 / 01 / 28, " T.Egerton", 1086);

        int opcion;

        do{
            String menu = "\n\n!Bienvenido a SenaViewed¡\n\n";

            menu += "1. Book\n";
            menu += "2. Chapter\n";
            menu += "3. Movie\n";
            menu += "4. Serie\n";
            menu += "5. Magazine\n";
            menu += "6. Report\n";
            menu += "7. Report Day\n";
            menu += "8. Salir...\n\n";

            System.out.println(menu);

            System.out.println("Elige tu Menu: ");
            opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Los Libros Son:");
                    break;
                case 2:
                    System.out.println("Los Capitulos Son:");
                    break;
                case 3:
                    System.out.println("Las Peliculas Son:");
                    break;
                case 4:
                    System.out.println("Las Series Son:");
                    break;
                case 5:
                    System.out.println("Los Magazines Son:");
                    break;
                case 6:
                    System.out.println("Reporte:");
                    break;
                case 7:
                    System.out.println("El reporte del dia:");
                    break;

                case 8:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Ingrese una opción valida");
                    break;

            }


        }while(opcion !=8);

    }



}