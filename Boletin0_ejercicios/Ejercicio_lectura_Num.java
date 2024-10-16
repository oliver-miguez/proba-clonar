package com.danielcastelao.newproyect.Proyectos.Prog;
import java.lang.invoke.SwitchPoint;
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
        System.out.println("Dame una decena:");
        numero_d=sc.nextInt();

        System.out.println("Dame un numero entero");
        numero_u=sc.nextInt();

        switch (numero_d){
            case 0:
                if (numero_d==0){
                    if (numero_u==0){
                        System.out.println("cero");
                    }
                }
            case 1:
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
                }else {
                    if (numero_u != 0) {
                        numero = ("diez ");
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
        switch (numero_u){
            case 1:
                if (numero_d!=numero_u) {
                    numero2 = ("y uno");
                }
                break;
            case 2:
                if (numero_u!=2) {
                    numero2 = ("y dos");
                }else{}
                break;
            case 3:
                if (numero_u!=3) {
                    numero2 = ("y tres");
                }else{}
                break;
            case 4:
                if (numero_u!=4) {
                    numero2 = ("y cuatro");
                }else{}
                break;
            case 5:
                if (numero_u!=5) {
                    numero2 = ("y cinco");
                }else{}
                break;
            case 6:
                numero2=("y seis");
                break;
            case 7:
                numero2=("y siete");
                break;
            case 8:
                numero2=("y ocho");
                break;
            case 9:
                numero2=("y nueve");
                break;
        }
        System.out.println(numero+numero2);
        
        
        
    }
}
