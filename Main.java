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
            System.out.println("\n██ Inciando o Jogo... ██\n");
            tempoPadraoAnimacao(250);
            System.out.println(".");
            tempoPadraoAnimacao(250);
            System.out.println(".");
            tempoPadraoAnimacao(250);
            System.out.println(".\n");
            tempoPadraoAnimacao(250);
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

    public static String entradaTexto() {// Ângelo - Método para a entrada tipo String;
        Scanner input = new Scanner(System.in);
        String entradaUsuarioTexto = input.next();
        return entradaUsuarioTexto;
    }

    public static void perguntas() {
        // Nery & Alessandro - Perguntas e história a serem usadas no jogo
        String[][] perguntas = { {
                "1 - um zero um zero zero zero um um um um zero (10100011110) - a criatura medonha fez uma pausa e então continuou. - um um um una um zero zero um um zero (1111 1100 110). \n Hawk: Para convertermos um número 'binário' para decimal, basta multiplicarmos essa ordem: 1010 0011 110 pelas potências do número 2. Como por exemplo: 1x210 0x29 1x28 0x27 0x26 0x25 1x24 1x23 1x22 1x21 0x2°. Utilizando a ordem do 1° número binário (10100011110) \nConhece os valores de 2? Para relembrarmos, vou lhe dar uma pequena dica de cálculo: 2x11 = 2 x 2 x 2 x 2 x 2 x 2 x 2 x 2 x 2 x 2 x 2. \n O resultado de uma multiplicação, você multiplica pelo próximo número e assim sucessivamente. Experimente realizar o cálculo e selecionar a alternativa correta:" },
                { "Hawk: Calma meu (minha) jovem, antes de ficar preocupado deixe-me introduzir este assunto complexo: A ideia da Álgebra Booleana é a de que existem apenas duas teorias em determinada situação/problema, se é VERDADEIRO ou FALSO. Nessa Álgebra podemos encontrar funções e portas lógicas seguidas de suas Tabelas Verdades (que são os verdadeiros valores para determinadas funções, e nunca serão alteradas). As portas lógicas não funcionam apenas com valores numéricos, mas também com circuitos de chaveamento, quando algo está ligado ou desligado, por exemplo.Lamacento: [...] me diga quais afirmativas são verdadeiras e falsas:",
                        " I. Não, Sim – Resposta óbvia. ", " II. Falso, Verdadeiro - Raciocínio humano.",
                        " III. True, False – Raciocínio humano composto. ",
                        " IV. Desligado, Ligado - Circuitos de chaveamento. ", " V. 0, 1 - Sistema binário." }, };
        String[][] respostas = {
                { "(A) 1310 & 2022", "(B) 1182 & 2022", "(C) 1564 & 2120", "(D) 1296 & 1925", "(E) 1309 & 2000" },
                { "(A) Alternativas II & IV estão corretas.", "(B) Alternativas III & I estão corretas.",
                        "(C) Somente III & I estão corretas.", "(D) Somente II, IV & V estão corretas.",
                        "(E) Alternativas I & III estão corretas." } };
    }

    public static void personalizar_personagem() {
        /*
         * Função que modifica o personagem principal ao gosto e as opções dispostas ao
         * jogador
         */
        String entradaUser;
        boolean verificaCase = false, verificaRaca = false, confirmaEscolhaNome = false;
        String viajante_nome = "";
        String viajante_raca = "";
        String confirmaEscolha = "";

        while (verificaCase == false) {
            tempoPadraoAnimacao(250);
            System.out.printf("Olá viajante, qual o seu nome?: ");
            entradaUser = entradaTexto();

            if (!entradaUser.equals("") && entradaUser != null && entradaUser.matches("^[a-zA-Z]*$"))/*
                                                                                                      * Utilizo de
                                                                                                      * expressão
                                                                                                      * regular para
                                                                                                      * validar a
                                                                                                      * entrada do campo
                                                                                                      */ {
                viajante_nome = entradaUser;

                while (!confirmaEscolhaNome == true) {
                    System.out.printf("\nSeu nome é %S correto?\n", viajante_nome);
                    System.out.println("Confirme com S ou N");
                    entradaUser = entradaTexto();
                    if (entradaUser.equals("S")) {
                        confirmaEscolhaNome = true;
                    } else {
                        System.out.println("\nEntão qual é o seu nome?");
                        entradaUser = entradaTexto();
                        viajante_nome = entradaUser;
                        confirmaEscolhaNome = true;
                    }
                }
                
                tempoPadraoAnimacao(250);
                System.out.printf("\nPrazer em conhece-lo %S!\n", viajante_nome);
                tempoPadraoAnimacao(250);
                verificaCase = true;
            } else {
                tempoPadraoAnimacao(250);
                System.out.println("\nViajante, existe algo de errado com seu nome, tente novamente\n");
            }
        }

        while (verificaRaca == false) {
            tempoPadraoAnimacao(250);
            System.out.printf("\nAgora, me diga %S qual a sua raça?:\n", viajante_nome);
            tempoPadraoAnimacao(500);
            System.out.println("\nA) Humano - Ambicioso, Audaz e Diverso");

            System.out.println("B) Elfo - Místico, Belo e Saudosista");

            System.out.println("C) Anão - Robusto, Teimoso e Rabugento");

            System.out.println("D) Halfling - Bravos, Ágeis e Sortudos!\n");

            entradaUser = entradaTexto();
            switch (entradaUser.toUpperCase()) {
                case "A":
                    tempoPadraoAnimacao(500);
                    System.out.println("Você escolheu Humano, correto?");
                    System.out.println("Responda com S ou N");
                    viajante_raca = "Humano";
                    confirmaEscolha = entradaTexto();
                    tempoPadraoAnimacao(500);

                    tempoPadraoAnimacao(500);
                    if (confirmaEscolha.equalsIgnoreCase("S")) {
                        verificaRaca = true;
                    }
                    break;
                case "B":
                    System.out.println("Você escolheu Elfo, correto?");
                    System.out.println("Responda com S ou N");
                    viajante_raca = "Elfo";
                    tempoPadraoAnimacao(500);
                    confirmaEscolha = entradaTexto();
                    tempoPadraoAnimacao(500);

                    if (confirmaEscolha.equalsIgnoreCase("S")) {
                        verificaRaca = true;
                    }
                    break;
                case "C":
                    System.out.println("Você escolheu Anão, correto?");
                    System.out.println("Responda com S ou N");
                    viajante_raca = "Anão";
                    tempoPadraoAnimacao(500);
                    confirmaEscolha = entradaTexto();
                    tempoPadraoAnimacao(500);

                    if (confirmaEscolha.equalsIgnoreCase("S")) {
                        verificaRaca = true;
                    }
                    break;
                case "D":
                    System.out.println("Você escolheu Halfling, correto?");
                    System.out.println("Responda com S ou N");
                    viajante_raca = "Halfling";
                    tempoPadraoAnimacao(500);
                    confirmaEscolha = entradaTexto();
                    tempoPadraoAnimacao(500);

                    if (confirmaEscolha.equalsIgnoreCase("S")) {
                        verificaRaca = true;
                    }
                    break;
                default:
                    System.out.println("Parece que você não escolheu uma das opções válidas");
                    break;
            }

        }
        System.out.printf(
                "\nCerto, então você é um %S e seu nome é %S. \n-Prepare-se para os desafios que vem adiante %S, e muito cuidado! \n-Todas as suas decisões tem consequências!\n",
                viajante_raca, viajante_nome, viajante_nome);
    }

    public static void menu() {
        // Alessando && Ângelo - imprime o menu e aceita a escolha do usuário

        Scanner input = new Scanner(System.in);// Método para captar a entrada do usuário
        int opcaoMenu;

        do {
            System.out.println("\n\n                                    ████████████████████████");
            System.out.println("                                    ███  Menu Principal  ███");
            tempoPadraoAnimacao(140);
            System.out.println("                                    ████████████████████████");
            tempoPadraoAnimacao(115);
            System.out.println("                                    ██  1 - Instruções    ██");
            tempoPadraoAnimacao(115);
            System.out.println("                                    ██  2 - Jogar         ██");
            tempoPadraoAnimacao(115);
            System.out.println("                                    ██  3 - Céditos       ██");
            tempoPadraoAnimacao(230);
            System.out.println("                                    ██  4 - Sair          ██");
            System.out.println("                                    ████████████████████████\n");
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