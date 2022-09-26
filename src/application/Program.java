package application;

import entities.Reserva;

import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Reserva[] vet = new Reserva[10]; //criar os 10 quartos do hotel com seus atributos
        int n;
        System.out.println("Digite quartos vão ser reservados: ");
        n = sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.printf("Reserva %d:\n", i);
            sc.nextLine();
            System.out.println("Digite o nome do hóspede: ");
            String nome = sc.nextLine();
            System.out.println("Digite o e-mail para contato: ");
            String email = sc.nextLine();
            System.out.println("Digite o número do quarto: ");
            int quarto = sc.nextInt();
            vet[quarto] = new Reserva(nome, email); //colocar os dados no respectivo quarto
        }
        System.out.println("Quartos ocupados: ");
        for(int i=0;i<10;i++){
            if(vet[i]!=null){
                System.out.println("\nQuarto "+i+": \n"+vet[i]);
            }
        }

        sc.close();
    }
}
