/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p1_gabrielamontes;

import java.util.Scanner;

public class Lab2P1_GabrielaMontes {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Opcion 1: Indice Academico ");
        System.out.println("Opcion 2:OK bommer");
        System.out.println("Opcion 3: ¡Gotta Know Them All ");
        System.out.println("Opcion 4: salida ");
        System.out.println("Ingrese su respuesta: ");
        int op = entrada.nextInt();
        while (op !=4) {

            if (op == 1) {
                //mcd
                System.out.println("Ingrese primer numero (entero y positivo) ");
                int num1 = entrada.nextInt();
                System.out.println("Ingrese segundo numero (entero y positivo) ");
                int num2 = entrada.nextInt();
                if (num1 == num2) {
                    System.out.println("Son iguales");
                } else {
                    while (num1 != num2) {
                        if (num1 >= num2){
                            num1 = num1 - num2;
                        } else {
                            num2 = num2 - num1;
                        }
                    }
                }
                System.out.println("El mcd es:" + num1);
            } else if (op == 2) {
                System.out.println("Ingrese su fecha de nacimiento");
                int fecha = entrada.nextInt();
                if (fecha < 1964) {
                    System.out.println("Usted es Baby boomer");
                } else if (fecha < 1979) {
                    System.out.println("Usted es Generation X");
                } else if (fecha < 1985) {
                    System.out.println("Usted es Xennial");
                } else if (fecha < 1994) {
                    System.out.println("Usted es millenial");
                } else if (fecha < 2012) {
                    System.out.println("Usted es Generation Z");
                } else if (fecha < 2025) {
                    System.out.println("Usted es Generation Alpha ");
                } else {
                    System.out.println("Error");
                }
        }else if (op==3){
        System.out.println("Ingrese el tipo de atacador");
        System.out.println("1.Fairy");
        System.out.println("2. Steel");
        System.out.println("3. Fighting");
        System.out.println("4. Psychic ");
        int atacador = entrada.nextInt();

        System.out.println("Ingrese el tipo de defensor");
        int defensor = entrada.nextInt();
        if (atacador == 3) {
            if (defensor == 3) {
                System.out.println("¡El tipo Fighting es Neutral contra el tipo Fighting !");
            } else if (defensor == 4) {
                System.out.println("¡El tipo Fighting es debil contra el tipo Psychic !");
            } else if (defensor == 2) {
                System.out.println("¡El tipo fighting es Super Eficaz contra el tipo Steel!");
            } else if (defensor == 1) {
                System.out.println("¡El tipo fighting es debil contra el tipo Fairy!");
            } else {
                System.out.println("Error");
            }

        } else if (atacador == 4) {
            if (defensor == 3) {
                System.out.println("El tipo psychic es Super Eficaz contra el tipo Fighting");
            } else if (defensor == 4) {
                System.out.println("El tipo psychic es debil contra el tipo psychic");
            } else if (defensor == 2) {
                System.out.println("El tipo psychic es debil contra el tipo steel");
            } else if (defensor == 1) {
                System.out.println("El tipo psychic es Neutral contra el tipo Fairy");
            } else {
                System.out.println("Error");
            }
        } else if (atacador == 2) {
            if (defensor == 3) {
                System.out.println("¡El tipo steel es neutral contra el tipo Fighting!");
            } else if (defensor == 4) {
                System.out.println("El tipo steel es neutral contra el tipo psychic");
            } else if (defensor == 2) {
                System.out.println("El tipo steel es debil contra el tipo steel");
            } else if (defensor == 1) {
                System.out.println("El tipo steel es Super Eficaz contra el tipo Fairy");
            } else {
                System.out.println("Error");
            }
        } else if (atacador == 1) {
            if (defensor == 3) {
                System.out.println("El tipo Fairy es Super Eficaz el tipo Fighting");
            } else if (defensor == 4) {
                System.out.println("El tipo Fairy es neutral contra el tipo psychic");
            } else if (defensor == 2) {
                System.out.println("El tipo Fairy es debil contra el tipo steel");
            } else if (defensor == 1) {
                System.out.println("El tipo Fairy es neutral contra el tipo Fairy");
            } else {
                System.out.println("Error");
            }

        } else {
            System.out.println("Salida");
        }
        System.out.println("Opcion 1: Indice Academico ");
        System.out.println("Opcion 2:OK bommer");
        System.out.println("Opcion 3: Gotta Know Them All ");
        System.out.println("Opcion 4: salida ");
        System.out.println("Ingrese su respuesta: ");
        op = entrada.nextInt();
    }

}
}
}
