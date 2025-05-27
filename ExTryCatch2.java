/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package extrycatch2;

/**
 *
 * @author g.boone
 */
import java.util.Scanner;
public class ExTryCatch2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    
    System.out.println ("Digite sua idade: ");
    int idade = sc.nextInt();
    
    try {
        if (idade < 18){
            throw new Exception ("Você ainda não pode dirigir. ");
        }
        System.out.println("Você já pode dirigir. ");
    }
    catch (Exception e) {
        System.out.println("Erro: "+e.getMessage());
    }
    }
    
}
