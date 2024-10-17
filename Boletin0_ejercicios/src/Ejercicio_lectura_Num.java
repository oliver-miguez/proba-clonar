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

       /*Preguntar una variable*/
        System.out.println("Dame una decena del 1-9:");
        numero_d=sc.nextInt();

        /*Preguntar una variable*/
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
                }else{
                    System.out.println(numero);
                }
            case 1:
                /*Me dice los casos especiales de los decimales entre 1 y 5*/
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
                }else{
                    if (numero_d!=0) {
                        numero = ("diez ");
                    }
                    if (numero_d==0){
                        System.out.println(numero2);
                    }
                }
                break;

            case 2:

               numero = ("veinte  ");
               break;

            case 3:

                numero = ("treinta  ");
                break;

            case 4:

                numero = ("cuarenta ");
                break;

            case 5:

                numero = ("cincuenta ");
                break;

            case 6:

                numero = ("sesenta   ");
                break;

            case 7:

                numero = ("setenta  ");
                break;

            case 8:

                numero = ("ochenta ");
                break;

            case 9:

                numero = ("noventa  ");
                break;
        }
        //*Discrimina las opciones de enteros*//
        switch (numero_u){
            case 1:
                if (numero_d!=0) {
                    numero2 = (" y uno");
                }else{
                    numero2 = ("uno");
                }
                break;
            case 2:
                if (numero_d!=0) {
                    numero2 = (" y dos");
                }else{
                    numero2 = ("dos");
                }
                break;
            case 3:
                if (numero_d!=0) {
                    numero2 = (" y tres");
                }else{
                    numero2 = ("tres");
                }
                break;
            case 4:
                if (numero_d!=0) {
                    numero2 = (" y cuatro");
                }else{
                    numero2 = ("cuatro");
                }
                break;
            case 5:
                if (numero_d!=0) {
                    numero2 = (" y cinco");
                }else{
                    numero2 = ("cinco");
                }
                break;
            case 6:
                if (numero_d!=0) {
                    numero2 = (" y seis");
                }else {
                    numero2 = (" seis");
                }
                break;
            case 7:
                if (numero_d!=0) {
                    numero2 = (" y siete");
                }else {
                    numero2 = (" siete");
                }
                break;
            case 8:
                if (numero_d!=0) {
                    numero2 = (" y ocho");
                }else {
                    numero2 = (" ocho");
                }
                break;
            case 9:
                if (numero_d!=0) {
                    numero2 = (" y nueve");
                }else {
                    numero2 = (" nueve");
                }
                break;
        }
        System.out.println(numero+numero2);
        
        
        
    }
}
