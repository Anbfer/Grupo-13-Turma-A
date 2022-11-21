import java.util.Scanner; //Método para captar a entrada do usuário

public class Main {

    public static void tempoPadraoAnimacao(int milisegundos) {/*
                                                               * Ângelo -cria o intervalo do Thread para promover a
                                                               * sensação de animação
                                                               * do texto
                                                               */
        try {
            Thread.sleep(milisegundos);/*
                                        * Ângelo - intervalo que pausa e execução do código e pode ser modificado
                                        * alterando a duração em milisegundos da "animação"
                                        */
        } catch (InterruptedException ignored) {
        }
    }

    public static void imprimeBoasVindas() {

        /* Ângelo - Cria e imprime o texto de boas vindas com a "animação" */

        System.out.println("               ██████╗░███████╗███╗░░░███╗░░░░░░██╗░░░██╗██╗███╗░░██╗██████╗░░█████╗░");
        tempoPadraoAnimacao(115);
        System.out.println("               ██╔══██╗██╔════╝████╗░████║░░░░░░██║░░░██║██║████╗░██║██╔══██╗██╔══██╗");
        tempoPadraoAnimacao(115);
        System.out.println("               ██████╦╝█████╗░░██╔████╔██║█████╗╚██╗░██╔╝██║██╔██╗██║██║░░██║██║░░██║");
        tempoPadraoAnimacao(115);
        System.out.println("               ██╔══██╗██╔══╝░░██║╚██╔╝██║╚════╝░╚████╔╝░██║██║╚████║██║░░██║██║░░██║");
        tempoPadraoAnimacao(115);
        System.out.println("               ██████╦╝███████╗██║░╚═╝░██║░░░░░░░░╚██╔╝░░██║██║░╚███║██████╔╝╚█████╔╝");
        tempoPadraoAnimacao(115);
        System.out.println("               ╚═════╝░╚══════╝╚═╝░░░░░╚═╝░░░░░░░░░╚═╝░░░╚═╝╚═╝░░╚══╝╚═════╝░░╚════╝░");
        tempoPadraoAnimacao(115);
        tempoPadraoAnimacao(115);
        System.out.println("                                            ░█████╗░");
        tempoPadraoAnimacao(115);
        System.out.println("                                            ██╔══██╗");
        tempoPadraoAnimacao(115);
        System.out.println("                                            ███████║");
        tempoPadraoAnimacao(115);
        System.out.println("                                            ██║░░██║");
        tempoPadraoAnimacao(115);
        System.out.println("                                            ╚═╝░░╚═╝");
        tempoPadraoAnimacao(115);
        System.out.println("                              ░█████╗░███╗░░░███╗░█████╗░███╗░░██╗");
        tempoPadraoAnimacao(115);
        System.out.println("                              ██╔══██╗████╗░████║██╔══██╗████╗░██║");
        tempoPadraoAnimacao(115);
        System.out.println("                              ███████║██╔████╔██║███████║██╔██╗██║");
        tempoPadraoAnimacao(115);
        System.out.println("                              ██╔══██║██║╚██╔╝██║██╔══██║██║╚████║");
        tempoPadraoAnimacao(115);
        System.out.println("                              ██║░░██║██║░╚═╝░██║██║░░██║██║░╚███║");
        tempoPadraoAnimacao(115);
        System.out.println("                              ╚═╝░░╚═╝╚═╝░░░░░╚═╝╚═╝░░╚═╝╚═╝░░╚══╝");
        tempoPadraoAnimacao(115);
    }

    public static int instucao(int opcao) {
        // Matheus && Ângelo - Função que contém as instruções
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("\n|| Você está nas instruções ||\n");
            System.out.printf(
                    " Para jogar tenha em mãos um papel de rescunho,lápis e uma borracha, confie em mim, você vai precisar!\n-Como parte fundamental do jogo, você precisa responder a algumas perguntas para progredir na história. Esse jogo se inspira no estilo\n'Rogue-like', onde uma resposta errada pode custar todo o seu progresso, o que implica em você começar tudo de novo!\n-Para progredir no jogo, basta responder as perguntas corretamente, cada pergunta respondida corretamente garante pontos de experiência\nque poderam ser gastos a cada ponto de checagem, garantindo vantagens únicas\n");
            System.out.println("**Pressione 4 para retornar ao menu principal**\n");
            opcao = input.nextInt();
        } catch (Exception e) { // caso seja inserido um valor inválido exibe a seguinte mensagem de erro e
                                // solicita um novo input
            System.out.println("Entre com um valor válido");
            input.next();
        }
        return opcao; // retorna a opção escolhida
    }

    public static int jogar(int opcao) {
        // Matheus && Ângelo - Função que inicia o jogo após escolha no menu
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("\n|| Inciando o Jogo... ||\n");
            personalizar_personagem();
            System.out.println("**Pressione 4 para retornar ao menu principal**\n");
            opcao = input.nextInt();
        } catch (Exception e) {// caso seja inserido um valor inválido exibe a seguinte mensagem de erro e
                               // solicita um novo input
            System.out.println("Entre com um valor válido");
            input.next();
        }
        return opcao;
    }

    public static int creditos(int opcao) {
        // Matheus && Ângelo - exibe os créditos do jogo
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("\n|| Créditos ||\n");
            System.out.println("Direção, Criação, Roteiro, Programação:\n");
            System.out.println("== Alessandro O. Rocha ==\n");
            System.out.println("== Ângelo Baracho ==\n");
            System.out.println("== Matheus Henrique ==\n");
            System.out.println("== João Victor Nery ==\n");
            System.out.println("** Pressione 4 para retornar ao menu principal **\n");
            opcao = input.nextInt();
        } catch (Exception e) {
            System.out.println("Entre com um valor válido");// caso seja inserido um valor inválido exibe a seguinte
                                                            // mensagem de erro e solicita um novo input
            input.next();
        }
        return opcao;
    }

    public static String entradaTexto() {
        Scanner input = new Scanner(System.in);
        String entradaUsuarioTexto = input.next();
        return entradaUsuarioTexto;
    }

    public static void perguntas() {
        // Nery & Alessandro - Perguntas e história a serem usadas no jogo
        String[][] perguntas = { {} };
    }

    public static void personalizar_personagem() {

        String entradaUser;
        boolean verificaCase = false;
        String viajante_nome = "";
        while (verificaCase == false) {

            System.out.printf("Olá viajante, qual o seu nome?: ");
            entradaUser = entradaTexto();

            if (!entradaUser.equals("") && entradaUser != null && entradaUser.matches("^[a-zA-Z]*$")) {
                viajante_nome = entradaUser;
                System.out.printf("Prazer em conhece-lo %S!\n", viajante_nome);
                verificaCase = true;
            } else {
                System.out.println("Viajante, existe algo de errado com seu nome, tente novamente");
            }
        }
    }

    public static void menu() {// Alessando && Ângelo - imprime o menu e aceita a escolha do usuário

        Scanner input = new Scanner(System.in);// Métpdo para captar a entrada do usuário
        int opcaoMenu;

        do {

            System.out.println("\n|||Menu Principal|||");
            tempoPadraoAnimacao(140);
            System.out.println("====================");
            tempoPadraoAnimacao(115);
            System.out.println("|| 1 - Instruções ||");
            tempoPadraoAnimacao(115);
            System.out.println("|| 2 - Jogar      ||");
            tempoPadraoAnimacao(115);
            System.out.println("|| 3 - Céditos    ||");
            tempoPadraoAnimacao(230);
            System.out.println("|| 4 - Sair       ||");
            System.out.println("====================\n");
            opcaoMenu = input.nextInt();

            switch (opcaoMenu) {
                case 1:
                    if (instucao(opcaoMenu) != 4) {
                        menu(); // exibe as instruções do jogo
                    }
                    break;
                case 2:
                    if (jogar(opcaoMenu) != 4) {
                        menu(); // inicia o jogo
                    }
                    break;
                case 3:
                    if (creditos(opcaoMenu) != 4) {
                        menu(); // acessa os créditos
                    }
                    break;
                case 4:
                    System.out.println("\n||| Saindo |||\n"); // encerra a execução do jogo
                    break;
                default:
                    System.out.println("Opção invalida");// caso seja inserido um valor invalido solicita um novo input
            }
        } while (opcaoMenu != 4);
    }

    public static void telaInicial() {
        /*
         * Matheus && Nery - A tela inicial que permite o usuário iniciar o jogo ou sair
         * ali mesmo
         */
        Scanner input = new Scanner(System.in);

        System.out.println("\n                              Digite S para continuar ou N para sair");

        String entrada = input.next();
        if (entrada.equalsIgnoreCase("s")) {
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