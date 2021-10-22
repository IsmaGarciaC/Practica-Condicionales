/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditionals;

import java.util.Scanner;

/**
 *
 * @author Ismael
 */
public class Exercises {
    public String read;
    public String answer;
    int reada;
    int day;
    
    
    Scanner leer = new Scanner (System.in);
    
    public void sentenciaIf (){
        System.out.println("Es mayor de edad?");
        read = leer.nextLine();
            if ("si".equals(read)) {
                System.out.println("Usted tiene mas de 18 años");
            } else {
                System.out.println("Usted tiene menos de 18 años");
            }
    }
    public void sentenciaWhile (){
        System.out.println("Ingrese su numero menor a 5");
        reada = leer.nextInt();
        while (reada<= 10) {            
            System.out.println("Valor de el dato: "+reada);
            reada++;
        }
    }
    public void sentenciaFor (){
        System.out.println("EJERCICIO CON EL FOR");
        for (int i = 1; i <= 15; i++) {
            
            System.out.println("El valor del dato es: "+i);
        }
                
    }
    public void sentenciaSwitch (){
        System.out.println("EJERCICIO CON SWITCH");
        System.out.println("Ingrese el numero de un dia de la semana 1-7");
        day = leer.nextInt();
        switch (day){
            case 1: day = 1;
                System.out.println("Lunes");
                break;
            case 2: day = 2;
                System.out.println("Martes");
                break;
            case 3: day = 3;
                System.out.println("Miercoles");
                break;
            case 4: day = 4;
                System.out.println("Jueves");
                break;
            case 5: day = 5;
                System.out.println("Viernes");
                break;
            case 6: day = 6;
                System.out.println("Sabado");
                break;
            case 7: day = 7;
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Dia Invalido");
                break;
                
        }
    }
}
