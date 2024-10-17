/* A partir de dos numeros, uno decimal y otro entero te dice el equivalentes en letras*/






import java.util.Scanner;

public class Ejercicio_lectura_Num {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        String numero="";

        String numero2="";

       int numero_d;

       int numero_u;

       numero_d=9;

       numero_u=9;


       /*Preguntar una variable terminada en cero*/

        System.out.println("Dame una decimal terminado en cero del 10-90:");
        numero_d=sc.nextInt();

        /*Preguntar una variable entera*/

        System.out.println("Dame un numero entero del 1-9:");
        numero_u=sc.nextInt();

    /*Discrimina las distintas opciones de las decenas*/

        switch (numero_d){

            case 0:

                /*Nos da un caso especial de 0 0*/

                if (numero_d==0){

                    if (numero_u==0){

                        System.out.println("cero");
                    }
                }

            case 10:

                /*Me dice los casos especiales de los decimales que empiezan por uno con enteros del 1 al 5*/

                if (numero_d==1) {

                    if (numero_u==1){

                        System.out.println("once");
                    }
                    if (numero_u == 2) {

                        System.out.println("doce");
                    }
                    if (numero_u == 3) {

                        System.out.println("trece");
                    }
                    if (numero_u == 4) {

                        System.out.println("catorce");
                    }
                    if (numero_u == 5) {

                        System.out.println("quince");
                    }


                    /*Decir los casos con decimal empezando por 1 perocon enteros mayores de 5*/

                }else{

                    if (numero_d!=0) {

                        numero = ("diez");
                    }
                    else{

                        System.out.println(numero2);
                    }
                }
                break;

            case 20:

               numero = ("veinte");

               break;

            case 30:

                numero = ("treinta");

                break;

            case 4:

                numero = ("cuarenta");

                break;

            case 50:

                numero = ("cincuenta");

                break;

            case 60:

                numero = ("sesenta");

                break;

            case 70:

                numero = ("setenta");

                break;

            case 80:

                numero = ("ochenta");

                break;

            case 90:

                numero = ("noventa");

                break;
        }

       /*Discrimina las opciones de enteros*/

        switch (numero_u){

     /*Dos posibilidades, las del decimal que empieza por cero y las del decimal que empieza por por número distinto de cero*/

            case 1:

                if (numero_d!=0) {

                    numero2 = ("iuno");

                }else{

                    numero2 = ("uno");
                }
                break;

            case 2:

                if (numero_d!=0) {

                    numero2 = ("idos");

                }else{

                    numero2 = ("dos");
                }
                break;

            case 3:

                if (numero_d!=0) {

                    numero2 = ("itres");

                }else{

                    numero2 = ("tres");
                }
                break;

            case 4:

                if (numero_d!=0) {

                    numero2 = ("icuatro");

                }else{

                    numero2 = ("cuatro");
                }
                break;

            case 5:

                if (numero_d!=0) {

                    numero2 = ("icinco");

                }else{

                    numero2 = ("cinco");
                }
                break;

            case 6:

                if (numero_d!=0) {

                    numero2 = ("iseis");

                }else {

                    numero2 = (" seis");
                }
                break;

            case 7:

                if (numero_d!=0) {

                    numero2 = ("isiete");

                }else {

                    numero2 = (" siete");
                }
                break;

            case 8:

                if (numero_d!=0) {

                    numero2 = ("iocho");

                }else {

                    numero2 = (" ocho");
                }
                break;

            case 9:

                if (numero_d!=0) {

                    numero2 = ("inueve");

                }else {

                    numero2 = (" nueve");
                }
                break;
        }
        System.out.println(numero+numero2);
    }
}
