import java.util.Scanner;

public class DespertarHeroe 
{

    public static void main (String [] args) 

    {

    Scanner sc = new Scanner (System.in);

    System.out.println (" ");
    System.out.println ("El despertar del heroe");
    System.out.println (" ");
    System.out.println ("-------Menú-------");
    System.out.println (" ");

    System.out.println ("1.Nueva partida");
    System.out.println ("2.Consultar ranking");
    System.out.println ("3.Ayuda");
    System.out.println ("4.Salir");
    System.out.println (" ");

    int numeroMenu = sc.nextInt();
    sc.nextLine();
    System.out.println (" ");

    int vida = 100;
    int valorPociones = 25;
    int numeroPociones = 3;

    

    int enemigoUno = 40;
    int enemigoDos = 60;
    int enemigoTres = 80;


    switch (numeroMenu) 

        { 
            case 1: 
                System.out.println ("Introduce tu nombre: ");
                String nombre = sc.nextLine();	
                System.out.println (" ");
                String welcome = "Bienvenid@ al juego ";
                System.out.println (welcome + " " + nombre);
                System.out.println (" ");

                System.out.println ("Elige jugador: ");
                System.out.println (" ");
                System.out.println("1.Mago ");
                System.out.println("2.Caballero ");
                System.out.println("3.Asesino ");
                System.out.println (" ");

                String jugadorUno = "Mago";
                String jugadorDos = "Caballero";
                String jugadorTres = "Asesino";

                int numeroJugador;

                do {

                numeroJugador = sc.nextInt();
                System.out.println (" ");


                if (numeroJugador == 1)

                {
                System.out.println ("Has elegido el: " + jugadorUno);
                }

                else if (numeroJugador == 2) {
                    System.out.println ("Has elegido el: " + jugadorDos);

                }

                else if (numeroJugador == 3) {
                    System.out.println ("Has elegido el: " + jugadorTres);

                }
                else if (numeroJugador > 3 || numeroJugador <= 0) {
                    System.out.println ("Has elegido un número no válido, introduce un número correcto: ");

                } 
                
                
                }while (numeroJugador > 3 || numeroJugador <= 0);
            
                

                

                System.out.println (" ");
                System.out.println (" ");
                System.out.println ("Elige un camino: ");
                System.out.println (" ");
                System.out.println("1.  ");
                System.out.println("2. ");
                System.out.println("3. ");
                System.out.println (" ");

                int numeroCaminoA = sc.nextInt();
                System.out.println (" ");

               
                    if (numeroCaminoA == 1)
                        
                    {

                    }




        break;

        case 2: 

                
        break;

        case 3:

        break;

        case 4:

        break;

        default:

                System.out.println ("El valor introducido no está dentro de los límites.");
                System.out.println (" ");

        break;

        }

    sc.close();

    }

}