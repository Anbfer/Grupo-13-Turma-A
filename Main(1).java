import java.util.Scanner;

public class Main {

    public static void tempoPadraoAnimacao() {/*
                                               * cria o intervalo do Thread para promover a sensação de animação do
                                               * texto
                                               */
        try {
            Thread.sleep(115);/*
                               * intervalo que pode ser modificado alterando a duração em milisegundos da
                               * "animação"
                               */
        } catch (InterruptedException ignored) {
        }
    }

    public static void imprimeBoasVindas() {/* Cria o texto de boas vindas com a "animação" */

        System.out.println("██████╗░███████╗███╗░░░███╗░░░░░░██╗░░░██╗██╗███╗░░██╗██████╗░░█████╗░");
        tempoPadraoAnimacao();
        System.out.println("██╔══██╗██╔════╝████╗░████║░░░░░░██║░░░██║██║████╗░██║██╔══██╗██╔══██╗");
        tempoPadraoAnimacao();
        System.out.println("██████╦╝█████╗░░██╔████╔██║█████╗╚██╗░██╔╝██║██╔██╗██║██║░░██║██║░░██║");
        tempoPadraoAnimacao();
        System.out.println("██╔══██╗██╔══╝░░██║╚██╔╝██║╚════╝░╚████╔╝░██║██║╚████║██║░░██║██║░░██║");
        tempoPadraoAnimacao();
        System.out.println("██████╦╝███████╗██║░╚═╝░██║░░░░░░░░╚██╔╝░░██║██║░╚███║██████╔╝╚█████╔╝");
        tempoPadraoAnimacao();
        System.out.println("╚═════╝░╚══════╝╚═╝░░░░░╚═╝░░░░░░░░░╚═╝░░░╚═╝╚═╝░░╚══╝╚═════╝░░╚════╝░");
        tempoPadraoAnimacao();
        tempoPadraoAnimacao();
        System.out.println("                             ░█████╗░");
        tempoPadraoAnimacao();
        System.out.println("                             ██╔══██╗");
        tempoPadraoAnimacao();
        System.out.println("                             ███████║");
        tempoPadraoAnimacao();
        System.out.println("                             ██║░░██║");
        tempoPadraoAnimacao();
        System.out.println("                             ╚═╝░░╚═╝");
        tempoPadraoAnimacao();
        System.out
                .println("██╗███████╗███╗████╗██████╗███████╗███╗███████╗████╗███████╗██╗██╗████████╗██████╗███╗████╗");
        tempoPadraoAnimacao();
        System.out
                .println("██║███████║████╗███║██╔══██╗██╔══██╗██║███████║████║██╔════╝██║██║█████████╗█████║████╗███║");
        tempoPadraoAnimacao();
        System.out
                .println("██║███████║██╔██╗██║██║████║███████║██║████████████║█████╗████║██║███████╔████╔██║██╔██╗██║");
        tempoPadraoAnimacao();
        System.out
                .println("██║███████║██║╚████║██║████║██╔══██║██║███████╔══██║██╔══╝████║██║███████║╚██╔╝██║██║╚████║");
        tempoPadraoAnimacao();
        System.out
                .println("███████╗██║██║█╚███║██████╔╝██║████║███████╗██║████║███████╗██║███████╗██║█╚═╝███║██║█╚███║");
    }

    public static int instucao(int opcao) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("\n|| Você está nas instruções ||\n");
            System.out.println("**Pressione 4 para retornar ao menu principal**\n");
            opcao = input.nextInt();
        } catch (Exception e) {
            System.out.println("Entre com um valor válido");
            input.next();
        }
        return opcao;
    }

    public static int jogar(int opcao) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("\n|| Inciando o Jogo... ||\n");
            System.out.println("**Pressione 4 para retornar ao menu principal**\n");
            opcao = input.nextInt();
        } catch (Exception e) {
            System.out.println("Entre com um valor válido");
            input.next();
        }
        return opcao;
    }

    public static int creditos(int opcao) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("\n|| Créditos ||\n");
            System.out.println("Direção, Criação e programação:\n");
            System.out.println("== Ângelo Baracho Ferreira ==\n");
            System.out.println("**Pressione 4 para retornar ao menu principal**\n");
            opcao = input.nextInt();
        } catch (Exception e) {
            System.out.println("Entre com um valor válido");
            input.next();
        }
        return opcao;
    }

    public static void menu() {// imprime o menu

        Scanner input = new Scanner(System.in);

        System.out.println("\n|||Menu Principal|||");
        System.out.println("====================");
        System.out.println("|| 1 - Instruções ||");
        System.out.println("|| 2 - Jogar      ||");
        System.out.println("|| 3 - Céditos    ||");
        System.out.println("|| 4 - Sair       ||");
        System.out.println("====================\n");
        int opcaoMenu = input.nextInt();

        while (opcaoMenu != 4) {

            switch (opcaoMenu) {
                case 1:
                    if (instucao(opcaoMenu) == 4) {
                        menu();
                    }
                    break;
                case 2:
                    if (jogar(opcaoMenu) == 4) {
                        menu();
                    }
                    break;
                case 3:
                    if (creditos(opcaoMenu) == 4) {
                        menu();
                    }
                    break;
                case 4:
                    System.out.println("\n||| Saindo |||\n");
                    break;
                default:
                    System.out.println("Opção invalida");
                    menu();
            }
        }
    }

    public static void telaInicial() {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite Y para continuar ou N para sair");

        String entrada = input.next();
        if (entrada.equalsIgnoreCase("y")) {
            menu();
        } else if (entrada.equalsIgnoreCase("n")) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        imprimeBoasVindas();// animação de boas vindas ao jogo
        telaInicial();// tela inicial que da a opção de continuar ou sair do jogo
    }
}