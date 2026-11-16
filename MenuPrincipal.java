import java.util.Scanner;

public class MenuPrincipal 
{

    public static void main (String [] args) 

    {

    Scanner sc = new Scanner (System.in);

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

                
                break;

            case 3:

                break;

            case 4:

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