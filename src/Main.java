import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int sorteiaNumero = random.nextInt(10);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Tente acertar meu número, digite o seu: ");
        int numero = Integer.parseInt(scanner.nextLine());

        int pontuacao = 0;

        while (pontuacao<99){
            if (sorteiaNumero == numero) {
                pontuacao = pontuacao + 10;
                System.out.println("Parabéns você ganhou 10 pontos. Sua pontuação atual é: " + pontuacao);

                if (pontuacao >= 100) {
                    System.out.println("Parabéns você ganhou");
                } else {
                    Scanner continua = new Scanner(System.in);

                    System.out.println("Deseja continuar? Digite 1 para sim ou 2 para não: ");
                    int continuar = Integer.parseInt(continua.nextLine());

                        if (continuar == 1) {
                            Random random2 = new Random();
                            sorteiaNumero = random2.nextInt(10);

                            Scanner scanner2 = new Scanner(System.in);

                            System.out.print("Tente novamente, digite outro número: ");
                            numero = Integer.parseInt(scanner2.nextLine());
//                            continuar = 0;

                        } else if (continuar == 2) {
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
                                break;
                            }

                        }
                }

            } else if (sorteiaNumero == numero - 1 || sorteiaNumero == numero + 1) {
                pontuacao = pontuacao + 5;
                System.out.println("Parabéns você ganhou 5 pontos. Sua pontuação atual é: " + pontuacao);

                Scanner continua = new Scanner(System.in);

                System.out.println("Deseja continuar? Digite 1 para sim ou 2 para não: ");
                int continuar = Integer.parseInt(continua.nextLine());

                if (continuar == 1) {
                    if (pontuacao >= 100) {
                        System.out.println("Parabéns você ganhou");
                    } else {
                        Scanner scanner3 = new Scanner(System.in);

                        System.out.print("Tente novamente, digite outro número: ");
                        numero = Integer.parseInt(scanner3.nextLine());
                    }
                    //continuar = 0;
                } else if (continuar == 2) {
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
                        break;
                    }
                }
            } else {
                System.out.println("Que pena você não pontuou. Sua pontuação atual é: " + pontuacao);

                Scanner continua = new Scanner(System.in);

                System.out.println("Deseja continuar? Digite 1 para sim ou 2 para não: ");
                int continuar = Integer.parseInt(continua.nextLine());

                if (continuar == 1) {
                    Scanner scanner4 = new Scanner(System.in);

                    System.out.print("Tente novamente, digite outro número: ");
                    numero = Integer.parseInt(scanner4.nextLine());
                    //continuar = 0;
                } else if (continuar == 2) {
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
                        break;
                    }
                }




            }
        }
        }
    }
