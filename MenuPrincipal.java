import java.util.Scanner;

public class MenuPrincipal 
{

    public static void main (String [] args) 

    {

    Scanner sc = new Scanner (System.in);

    Ranking.cargarXML();

    System.out.println ("\nEl último de nosotros");
    System.out.println ("\n-------Menú-------\n");

    System.out.println ("1.Nueva partida\n2.Consultar ranking\n3.Ayuda\n4.Salir\n");
    
    int numeroMenu = sc.nextInt();
    sc.nextLine();
    System.out.println (" ");

    switch (numeroMenu) 

        { 
            case 1: 
                
                Partida.iniciarPartida(sc);
                
                break;

            case 2: 

                Ranking.mostrarRanking();    

                break;

            case 3:

                System.out.println("=========================================");
                System.out.println("                 AYUDA");
                System.out.println("=========================================");
                System.out.println("- Elige tu superviviente y una ruta.");
                System.out.println("- Combate por turnos usando armas y curándote.");
                System.out.println("- Gana puntos derrotando enemigos y completando la ruta.");
                System.out.println("- Los 10 mejores registros se guardan en el ranking.");
                System.out.println("=========================================\n");

                break;

            case 4:
                System.out.println("Saliendo del juego. ¡Hasta la próxima!");
                break;

            default:

                System.out.println ("El valor introducido no está dentro de los límites. Introduzca un número correcto: ");
                do {
                numeroMenu = sc.nextInt();
                } while (numeroMenu > 3 || numeroMenu <= 0);

                break;
        }
        
    sc.close();

    }

}