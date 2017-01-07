package br.edu.ifpb.ads.poo.guerreiros;


import java.util.Scanner;

/**
 * @version 1.0
 * @author Wensttay de Sousa Alencar <yattsnew@gmail.com>
 * @date 07/01/2017 - 12:01:31
 */
public class Play {

    public static void main(String[] args) {
        boolean jogo = true;
        Scanner input = new Scanner(System.in);
        Guerreiro Player1 = new Guerreiro("01", "Dota");
        Guerreiro Player2 = new Guerreiro("007", "LoL");

        while (jogo) {
            System.out.println();
            System.out.printf(" GUERREIROS DA POO \n%s\n%s\n%s\n%s\n%s\n%s\n%s", "1 - Cadastrar Guerreiros", "2 - Jogar",
                    "3 - Jogar (com recursividade)", "4 - Alimentar um Guerreiro", "5 - Exibir as informações de um Guerreiro", "6 - Exit",
                    " --> ");
            int escolha = input.nextInt();
            input.nextLine();
            System.out.println();
            
            switch (escolha) {
                case 1: {
                    System.out.print("Codigo do Guerreiro 1: ");
                    Player1.setCodigo(input.nextLine());
                    System.out.print("Nome do Guerreiro 1: ");
                    Player1.setNome(input.nextLine());
                    System.out.print("Codigo do Guerreiro 2: ");
                    Player2.setCodigo(input.nextLine());
                    System.out.print("Nome do Guerreiro 2: ");
                    Player2.setNome(input.nextLine());

                    break;
                }
                case 2: {
                    int x = Player1.lutar(Player2);
                    System.out.println();
                    System.out.println("Vencedor:");
                    
                    if (x == 1) {
                        System.out.println(Player1);
                    } else {
                        System.out.println(Player2);
                    }
                    
                    break;
                }
                case 3: {
                    int x = Player1.lutarRecursivo(Player2);
                    System.out.println();
                    System.out.println("Vencedor:");
                    
                    if (x == 1) {
                        System.out.println(Player1);
                    } else {
                        System.out.println(Player2);
                    }
                    
                    break;
                }
                case 4: {
                    System.out.println("Escolha o Guerreiro: ");
                    System.out.println(" 1 - Guerreiro " + Player1.getNome());
                    System.out.println(" 2 - Guerreiro " + Player2.getNome());
                    System.out.println(" 3 - Alimentar Ambos Totalmente");
                    System.out.print("   => ");
                    
                    switch (input.nextInt()) {
                        case 1: {
                            Player1.alimentar_se();
                            
                            break;
                        }
                        case 2: {
                            Player2.alimentar_se();
                            
                            break;
                        }
                        case 3: {
                            Player1.alimentar_se_Completamente();
                            Player2.alimentar_se_Completamente();
                        }
                    }
                    
                    break;
                }
                case 5: {
                    System.out.println("Escolha o Guerreiro: ");
                    System.out.println(" 1 - Guerreiro " + Player1.getNome());
                    System.out.println(" 2 - Guerreiro " + Player2.getNome());
                    System.out.print("   => ");
                    
                    if (input.nextInt() == 1) {
                        System.out.println(Player1);;
                    } else {
                        System.out.println(Player2);
                    }
                    
                    break;
                }
                case 6: {
                    jogo = false;
                    input.close();
                    
                    break;
                }
            }
        }
    }
}
