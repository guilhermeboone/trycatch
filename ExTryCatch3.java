/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package extrycatch3;

/**
 *
 * @author g.boone
 */
import java.util.Scanner;
public class ExTryCatch3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println ("Digite seu cpf (apenas números): ");
        String cpf = sc.nextLine ();
        
        try{
            /*Converte letras para números*/
            Long.parseLong(cpf);
        if (cpf.length () != 11){
            throw new Exception ("CPF inválido. Deve conter exatamente 11 números. ");
        }
            System.out.println("CPF válido: "+cpf);
        }
        /*Exceção para número*/
        catch(NumberFormatException e1){
            System.out.println("Erro: O CPF deve conter apenas números. Não use letras ou simbolos");
        }
        catch (Exception e2){
            System.out.println("Erro: "+e2.getMessage());
        }
    }
    
}
