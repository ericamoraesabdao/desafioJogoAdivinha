import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class JogoAdivinha {
    public static void adivinha(int dificuldade) {
        Random random = new Random();
        int sorteiaNumero = random.nextInt(dificuldade);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Tente acertar meu número, digite o seu: ");
        int numero = Integer.parseInt(scanner.nextLine());

        ArrayList <Integer> numerosAcertados = new ArrayList <> ();
        ArrayList <Integer> numerosErrados = new ArrayList <> ();

        int pontuacao = 0;

        while (pontuacao<99){
            if (sorteiaNumero == numero) {
                pontuacao = pontuacao + 10;
                System.out.println("Parabéns você ganhou 10 pontos. Sua pontuação atual é: " + pontuacao);
                numerosAcertados.add(numero);

                if (pontuacao >= 100) {
                    System.out.println("Parabéns você chegou a 100 pontos e ganhou");
                    System.out.println("Números acertados: " + numerosAcertados);
                    System.out.println("Números errados: " + numerosErrados);

                } else {
                    Scanner continua = new Scanner(System.in);

                    System.out.println("Deseja continuar? Digite 1 para sim ou 2 para não: ");
                    int continuar = Integer.parseInt(continua.nextLine());

                    if (continuar == 1) {
                        Random random2 = new Random();
                        sorteiaNumero = random2.nextInt(dificuldade);

                        Scanner scanner2 = new Scanner(System.in);

                        System.out.print("Tente novamente, digite outro número: ");
                        numero = Integer.parseInt(scanner2.nextLine());


                    } else if (continuar == 2) {
                        System.out.println("Você resolveu parar com " + pontuacao + " pontos. Você não ganhou!");
                        System.out.println("Você acertou os números: " + numerosAcertados);
                        System.out.println("Você errou os números: " + numerosErrados);
                        break;
                    } else {
                        System.out.println("Opção inválida, escolha uma opção válida. ");

                        System.out.println("Deseja continuar? Digite 1 para sim ou 2 para não: ");
                        continuar = Integer.parseInt(continua.nextLine());
                        if (continuar == 1) {
                            Scanner scanner6 = new Scanner(System.in);

                            System.out.print("Tente novamente, digite outro número: ");
                            numero = Integer.parseInt(scanner6.nextLine());

                        } else if (continuar == 2){
                            System.out.println("Você resolveu parar com " + pontuacao + " pontos. Você não ganhou!");
                            System.out.println("Você acertou os números: " + numerosAcertados);
                            System.out.println("Você errou os números: " + numerosErrados);
                            break;
                        }

                    }
                }

            } else if (sorteiaNumero == numero - 1 || sorteiaNumero == numero + 1) {
                pontuacao = pontuacao + 5;
                System.out.println("Parabéns você ganhou 5 pontos. Sua pontuação atual é: " + pontuacao);
                numerosErrados.add(numero);

                Scanner continua = new Scanner(System.in);

                System.out.println("Deseja continuar? Digite 1 para sim ou 2 para não: ");
                int continuar = Integer.parseInt(continua.nextLine());

                if (continuar == 1) {
                    if (pontuacao >= 100) {
                        System.out.println("Parabéns você chegou a 100 pontos e ganhou");
                        System.out.println("Números acertados: " + numerosAcertados);
                        System.out.println("Números errados: " + numerosErrados);
                    } else {
                        Scanner scanner3 = new Scanner(System.in);

                        System.out.print("Tente novamente, digite outro número: ");
                        numero = Integer.parseInt(scanner3.nextLine());
                    }
                } else if (continuar == 2) {
                    System.out.println("Você resolveu parar com " + pontuacao + " pontos. Você não ganhou!");
                    System.out.println("Você acertou os números: " + numerosAcertados);
                    System.out.println("Você errou os números: " + numerosErrados);
                    break;
                } else {
                    System.out.println("Opção inválida, escolha uma opção válida. ");

                    System.out.println("Deseja continuar? Digite 1 para sim ou 2 para não: ");
                    continuar = Integer.parseInt(continua.nextLine());
                    if (continuar == 1) {
                        Scanner scanner6 = new Scanner(System.in);

                        System.out.print("Tente novamente, digite outro número: ");
                        numero = Integer.parseInt(scanner6.nextLine());
                    } else if (continuar == 2){
                        System.out.println("Você resolveu parar com " + pontuacao + " pontos. Você não ganhou!");
                        System.out.println("Você acertou os números: " + numerosAcertados);
                        System.out.println("Você errou os números: " + numerosErrados);
                        break;
                    }
                }
            } else {
                System.out.println("Que pena você não pontuou. Sua pontuação atual é: " + pontuacao);
                numerosErrados.add(numero);

                Scanner continua = new Scanner(System.in);

                System.out.println("Deseja continuar? Digite 1 para sim ou 2 para não: ");
                int continuar = Integer.parseInt(continua.nextLine());

                if (continuar == 1) {
                    Scanner scanner4 = new Scanner(System.in);

                    System.out.print("Tente novamente, digite outro número: ");
                    numero = Integer.parseInt(scanner4.nextLine());
                } else if (continuar == 2) {
                    System.out.println("Você resolveu parar com " + pontuacao + " pontos. Você não ganhou!");
                    System.out.println("Você acertou os números: " + numerosAcertados);
                    System.out.println("Você errou os números: " + numerosErrados);
                    break;
                } else {
                    System.out.println("Opção inválida, escolha uma opção válida. ");

                    System.out.println("Deseja continuar? Digite 1 para sim ou 2 para não: ");
                    continuar = Integer.parseInt(continua.nextLine());
                    if (continuar == 1) {
                        Scanner scanner6 = new Scanner(System.in);

                        System.out.print("Tente novamente, digite outro número: ");
                        numero = Integer.parseInt(scanner6.nextLine());
                    } else if (continuar == 2){
                        System.out.println("Você resolveu parar com " + pontuacao + " pontos. Você não ganhou!");
                        System.out.println("Você acertou os números: " + numerosAcertados);
                        System.out.println("Você errou os números: " + numerosErrados);
                        break;
                    }
                }
            }
        }
    }
}
