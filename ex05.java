package lista05_05;

import java.util.Scanner;

    public class ex05 {
        public static void main(String[] args){
    // Declaração das variáveis
        double metros;
        double centimetros;        

    //Passo 1: fazer a entrada dos dados
        Scanner reader = new Scanner (System.in);
            System.out.print("Coloque o valor em metros: ");
                metros = reader.nextDouble();  
        reader.close();
  
    // Passo 2: Calcular os centimetros
    
    centimetros = metros * 100;
            
    
    // Passo 3: exibir a resposta para o usuário

    System.out.println(metros + " metros são: " + centimetros + " em centímetros!");
    



        }





    }