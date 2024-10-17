    import java.util.Scanner;
    public class Ejercicio_switch {
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int nota;
            System.out.println("Dame tu nota de examen entre 0-10: ");
            nota=sc.nextInt();
            switch (nota){
                case (0):
                case (1):
                case (2):
                case (3):
                case (4):
                    System.out.println("Suspenso");
                    break;

                case (5) :
                    System.out.println("Suficiente");
                    break;

                case (6):
                    System.out.println("Bien");
                    break;

                case (7):
                case (8):
                    System.out.println("Notable");
                    break;

                case (9):
                case (10):
                    System.out.println("Sobresaliente");
                    break;





            }




        }
    }


