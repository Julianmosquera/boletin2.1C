
package bol21;// Modelo C

import java.util.Scanner;

/**
 *
 * @author julianlinux
 */
public class Bol21 { //entrada por teclado
    // JAVA libreia util.Scanner

    
    public static void main(String[] args) {
        float base,altura;
        Scanner obx= new Scanner(System.in);
        System.out.println("Teclea la base:");
        base=obx.nextFloat();// lo que se meta va a la base como float
        System.out.println("Teclea la altura:");
        altura=obx.nextFloat();
        System.out.println("area="+base*altura/2);
        
    }
    
}
