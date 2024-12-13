import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            int dif = 0;
            int escolha = 0;
            Scanner scanner = new Scanner(System.in);

            System.out.println("Escolha qual dificuldade você vai querer: 1.Fácil, 2.Médio, 3.Difícil");
            escolha = Integer.parseInt(scanner.nextLine());

            if(escolha ==1) {
                dif = 10;
            }
            else if(escolha ==2){
                dif = 50;
            }
            else if(escolha ==3) {
                dif = 100;
            }
            else {
                System.out.println("Opção inválida, digite uma opção válida!");

                System.out.println("Escolha qual dificuldade você vai querer: 1.Fácil, 2.Médio, 3.Difícil");
                escolha = Integer.parseInt(scanner.nextLine());
                if (escolha == 1) {
                    dif = 10;
                } else if (escolha == 2) {
                    dif = 50;
                } else if (escolha == 3) {
                    dif = 100;
                } else {
                    return;
                }

            }
            System.out.println("dif: " + dif + ", escolha: "+ escolha);

            JogoAdivinha.adivinha(dif);



    }
}