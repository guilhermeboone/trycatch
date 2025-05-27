/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package extrycatch1;

/**
 *
 * @author g.boone
 */
import java.util.Scanner;
public class ExTryCatch1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Digite a senha (minimo de 6 caracteres): ");
        String senha = sc.nextLine();
        
        try {
            /*Verificador. Caso não aconteça de a senha ser menor que 6, o print da mensagem "Senha válida já ocorre."*/
        if (senha.length()< 6){
            throw new Exception ("Senha muito curta! ");
        }
        System.out.println("Senha válida! ");
        }
        /*trata o erro percebido pelo try, neste caso, o erro é a senha ser menor que 6*/
        catch (Exception e) {
        System.out.println ("Erro: "+e.getMessage());
        }
        sc.close();
    }
    
}
