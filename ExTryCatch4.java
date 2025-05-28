/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package extrycatch4;

/**
 *
 * @author g.boone
 */
import java.util.Scanner;
public class ExTryCatch4 {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    
    System.out.println("Digite seu e-mail");
    String email = sc.nextLine();
    
    try{
        /*! nega a frase*/
        if (!email.contains("@")){
            throw new Exception ("E-mail inválido: falta '@'.");
        }
        System.out.println("E-mail válido: "+email);
    }
    catch (Exception e){
        System.out.println("Erro: "+e.getMessage());
    }
    }
    
}
