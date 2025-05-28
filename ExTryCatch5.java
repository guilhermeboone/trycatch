/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package extrycatch5;

/**
 *
 * @author g.boone
 */
import java.util.Scanner;
public class ExTryCatch5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("--Cadastro novo--");
        
        System.out.println("Digite a senha: ");
        String senha1 = sc.nextLine();
        
        System.out.println("Confirme a senha: ");
        String senha2 = sc.nextLine();
        
        try {
            /*Aconselhavel para comparação com String*/
            if (!senha1.equals(senha2)){
                throw new Exception ("AS senhas não coincidem! ");
            }
            System.out.println("Senha confirmada com sucesso! ");
        }
        catch (Exception e){
            System.out.println ("Erro: "+e.getMessage());
        }
    }
    
}
