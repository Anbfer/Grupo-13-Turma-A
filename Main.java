import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner; //Método para captar a entrada do usuário

public class Main {

    // ------------------------------------------- "ANIMAÇÃO"
    // ----------------------------------------------------
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
    // ----------------------------------------------------------------------------------------------------------------

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

    // ------------------------------------- INSTRUÇÕES ---------------------------
    public static int instucao(int opcao) {
        // Matheus && Ângelo - Função que contém as instruções
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("\n|| Você está nas instruções ||\n");
            System.out.printf(
                    " Para jogar tenha em mãos um papel de rescunho,lápis e uma borracha, confie em mim, você vai precisar!\n-Como parte fundamental do jogo, você precisa responder a algumas perguntas para progredir na história.\n-Sua vida é restaurada após cada resposta correta\n-Suas respostas influenciarão o fim do jogo");
            System.out.println("**Pressione 4 para retornar ao menu principal**\n");
            opcao = input.nextInt();
        } catch (Exception e) { // caso seja inserido um valor inválido exibe a seguinte mensagem de erro e
                                // solicita um novo input
            System.out.println("Entre com um valor válido");
            input.next();
        }
        return opcao; // retorna a opção escolhida
    }
    // -------------------------------------------------------------------------------------

    // ---------------------------------------------------------- MÉTODO QUE INICIA
    // O JOGO -----------------------//
    public static int jogar(int opcao) {
        // Matheus && Ângelo - Função que inicia o jogo após escolha no menu
        Scanner input = new Scanner(System.in);
        int vida = 100;
        int experiencia = 0;
        int cristais = 10;

        try {
            System.out.println("\n██ Inciando o Jogo... ██\n");
            tempoPadraoAnimacao(250);
            System.out.printf(".");
            tempoPadraoAnimacao(250);
            System.out.printf(".");
            tempoPadraoAnimacao(250);
            System.out.printf(".\n");
            tempoPadraoAnimacao(250);
            String jogador_nome = personalizar_personagem();
            boolean epilogo = epilogo(jogador_nome);
            if (!epilogo == true) {
                System.out.println("**Pressione 4 para retornar ao menu principal**\n");
                opcao = input.nextInt();
            } else {
                capitulo_um(jogador_nome, vida, experiencia, cristais);
                capitulo_dois(jogador_nome, vida, experiencia, cristais);
                capitulo_tres(jogador_nome, vida, experiencia, cristais);
                capitulo_quatro(jogador_nome, vida, experiencia, cristais);
            }
        } catch (Exception e) {// caso seja inserido um valor inválido exibe a seguinte mensagem de erro e
                               // solicita um novo input
            System.out.println("Entre com um valor válido");
            input.next();
        }
        return opcao;
    }
    // ---------------------------------------------------------------------------------------------//

    // ----------------------- MÉDOTO DOS CRÉDITOS -----------------------
    public static int creditos(int opcao) {
        // Nery - exibe os créditos do jogo
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
    // -----------------------------------------------------------------------------------------------------------

    // ------------------------------------- MÉTODOS DE CAPTURA DE ENTRADA DO
    // JOGADOR
    public static String entradaTexto() {// Ângelo - Método para a entrada tipo String;
        Scanner input = new Scanner(System.in);
        String entradaUsuarioTexto = input.next();
        return entradaUsuarioTexto;
    }

    public static int entrada_Numero() {
        Scanner input = new Scanner(System.in);
        int entradaUsuarioNumero = input.nextInt();
        return entradaUsuarioNumero;
    }

    // ------------------------------------------------------------------------------------------------------------

    // ----------------------------- PARTE DAS PERGUNTAS -------
    public static void alternativa_pergunta_um() {
        // Nery & Alessandro - Perguntas e história a serem usadas no jogo

        ArrayList<String> pergunta_um_alternativas = new ArrayList<String>();
        pergunta_um_alternativas.add("(A) 1310 & 2022");
        pergunta_um_alternativas.add("(B) 1182 & 2022");
        pergunta_um_alternativas.add("(C) 1564 & 2120");
        pergunta_um_alternativas.add("(D) 1296 & 1925");
        pergunta_um_alternativas.add("(E) 1309 & 2000");
        
        for (String string : pergunta_um_alternativas) {
            System.out.println(string);
        }

        
    }

    public static void alternativa_pergunta_dois() {
        ArrayList<String> pergunta_dois_alternativas = new ArrayList<String>();
        pergunta_dois_alternativas.add("1 - Alternativas II & IV estão corretas");
        pergunta_dois_alternativas.add("2 - Alternativas III & I estão corretas");
        pergunta_dois_alternativas.add("3 - Somente III & I estão corretas");
        pergunta_dois_alternativas.add("4 - Somente II, IV & V estão corretas");
        pergunta_dois_alternativas.add("5 - Alternativas I & III estão corretas");

        for (String string : pergunta_dois_alternativas) {
            System.out.println(string);
        }
    }
    public static void alternativa_pergunta_tres() {
        ArrayList<String> pergunta_tres_alternativas = new ArrayList<String>();
        pergunta_tres_alternativas.add("(A) - 0 + 1 + 0 + 1 = 0");
        pergunta_tres_alternativas.add("(B) - 1 + 1 + 1 + 1 = 1");
        pergunta_tres_alternativas.add("(C) - 1 + 1 + 0 + 0 = 1");
        pergunta_tres_alternativas.add("(D) - 0 + 0 + 0 + 1 = 1");


        for (String string : pergunta_tres_alternativas) {
            System.out.println(string);
        }
    }
    public static void alternativa_pergunta_quatro() {
        ArrayList<String> pergunta_quatro_alternativas = new ArrayList<String>();
        pergunta_quatro_alternativas.add("(A) Alan Turin");
        pergunta_quatro_alternativas.add("(B) Elon Musk");
        pergunta_quatro_alternativas.add("(C) Grace Hopper");
        pergunta_quatro_alternativas.add("(D) Ada Lovelace");


        for (String string : pergunta_quatro_alternativas) {
            System.out.println(string);
        }
    }

    public static boolean alternativa_pergunta_cinco(int sim_nao) {
        boolean certo_errado = false;
        if (sim_nao == 0) {
            certo_errado = true;
        } else if (sim_nao == 1) {
            return certo_errado;
        }

        return certo_errado;
    }
    // --------------------PARTE DE
    // PERSONALIZAÇÃO--------------------------------------
    public static String personalizar_personagem() {
        /*
         * Função que modifica o personagem principal ao gosto e as opções dispostas ao
         * jogador
         */
        String entradaUser;
        int entradaUserInt;
        boolean verificaCase = false, verificaRaca = false, verificaIdade = false, confirmaEscolhaNome = false;
        String viajante_nome = "";
        String viajante_raca = "";
        int viajante_idade = 0;
        String confirmaEscolha = "";

        // Escolha de nome
        while (verificaCase == false) {
            //tempoPadraoAnimacao(250);
            System.out.printf("Olá viajante, qual o seu nome?: ");
            entradaUser = entradaTexto();

            if (!entradaUser.equals("") && entradaUser != null && entradaUser.matches("^[a-zA-Z]*$")) {
                /* Utilizo de expressão regular para validar a entrada do campo */
                viajante_nome = entradaUser;
                // Valida nome
                while (!confirmaEscolhaNome == true) {
                    // confirma o nome escolhido
                    System.out.printf("\nSeu nome é %S correto?\n", viajante_nome);
                    System.out.println("Confirme com S ou N");
                    entradaUser = entradaTexto();
                    if (entradaUser.equalsIgnoreCase("S")) {
                        confirmaEscolhaNome = true;
                    } else {
                        System.out.println("\nEntão qual é o seu nome?");
                        entradaUser = entradaTexto();
                        viajante_nome = entradaUser;
                        confirmaEscolhaNome = true;
                    }
                }

                //tempoPadraoAnimacao(250);
                System.out.printf("\nPrazer em conhece-lo %S!\n", viajante_nome);
                //tempoPadraoAnimacao(250);
                verificaCase = true;
            } else {
                //tempoPadraoAnimacao(250);
                System.out.println("\nViajante, existe algo de errado com seu nome, tente novamente\n");
            }
        }

        // Escolha de raça
        while (verificaRaca == false) {
            //tempoPadraoAnimacao(250);
            System.out.printf("\nAgora, me diga %S qual é a sua raça?:\n", viajante_nome);
            //tempoPadraoAnimacao(500);
            System.out.println("\nA) Humano - Ambicioso, Audaz e Diverso");

            System.out.println("B) Elfo - Místico, Belo e Saudosista");

            System.out.println("C) Anão - Robusto, Teimoso e Rabugento");

            System.out.println("D) Halfling - Bravos, Ágeis e Sortudos!\n");

            entradaUser = entradaTexto();

            // Confirma a escolha da raça
            if (!entradaUser.equals("") && entradaUser != null && entradaUser.matches("^[a-zA-Z]*$")) {
                switch (entradaUser.toUpperCase()) {
                    case "A":
                        //tempoPadraoAnimacao(500);
                        System.out.println("Você escolheu Humano, correto?");
                        System.out.println("Responda com S ou N");
                        viajante_raca = "Humano";
                        confirmaEscolha = entradaTexto();
                        //tempoPadraoAnimacao(500);

                        //tempoPadraoAnimacao(500);
                        if (confirmaEscolha.equalsIgnoreCase("S")) {
                            verificaRaca = true;
                        }
                        break;
                    case "B":
                        System.out.println("Você escolheu Elfo, correto?");
                        System.out.println("Responda com S ou N");
                        viajante_raca = "Elfo";
                        //tempoPadraoAnimacao(500);
                        confirmaEscolha = entradaTexto();
                        //tempoPadraoAnimacao(500);

                        if (confirmaEscolha.equalsIgnoreCase("S")) {
                            verificaRaca = true;
                        }
                        break;
                    case "C":
                        System.out.println("Você escolheu Anão, correto?");
                        System.out.println("Responda com S ou N");
                        viajante_raca = "Anão";
                        //tempoPadraoAnimacao(500);
                        confirmaEscolha = entradaTexto();
                        //tempoPadraoAnimacao(500);

                        if (confirmaEscolha.equalsIgnoreCase("S")) {
                            verificaRaca = true;
                        }
                        break;
                    case "D":
                        System.out.println("Você escolheu Halfling, correto?");
                        System.out.println("Responda com S ou N");
                        viajante_raca = "Halfling";
                        //tempoPadraoAnimacao(500);
                        confirmaEscolha = entradaTexto();
                        //tempoPadraoAnimacao(500);

                        if (confirmaEscolha.equalsIgnoreCase("S")) {
                            verificaRaca = true;
                        }
                        break;
                    default:
                        System.out.println("Parece que você não escolheu uma das opções válidas");
                        break;
                }
            } else {
                //tempoPadraoAnimacao(250);
                System.out.println("\nViajante, existe algo de errado com seu nome, tente novamente\n");
                //tempoPadraoAnimacao(250);
            }
        }
        // Pede a idade e confirma a idade;
        while (verificaIdade == false) {
            //tempoPadraoAnimacao(500);
            System.out.printf("Agora me diga %S, o(a) %S, qual é a sua idade?\n", viajante_nome, viajante_raca);
            entradaUserInt = entrada_Numero();
            if (entradaUserInt > 0) {
                viajante_idade = entradaUserInt;
                verificaIdade = true;
            } else {
                System.out.println("Você informou algum valor inválido, tente novamente");
                //tempoPadraoAnimacao(500);
            }
        }

        System.out.printf(
                "\nCerto, então você é um %S e seu nome é %S, você tem %d anos\n-Prepare-se para os desafios que vem adiante %S, o(a) %S e muito cuidado! \n-Todas as suas decisões tem consequências!\n",
                viajante_raca, viajante_nome, viajante_idade, viajante_nome, viajante_raca);
        //tempoPadraoAnimacao((450 * 10));

        return viajante_nome;
    }

    public static int danoAleatorio(int dano_minimo, int dano_maximo) {
        Random aleatorio = new Random();
        int dano_sofrido = 0;
        
        dano_minimo = 1;
        dano_maximo = 2;

        

        dano_sofrido = aleatorio.nextInt(dano_maximo - dano_minimo) + dano_minimo;

        return dano_sofrido;
    }

    // ----------------------------------Menu principal----------------------
    public static void menu() {
        // Alessando && Ângelo - imprime o menu e aceita a escolha do usuário

        Scanner input = new Scanner(System.in);// Método para captar a entrada do usuário
        int opcaoMenu = 0;
        String escolha = "";
        boolean validaEntradaMenu = false;

        do {
            do {
                System.out.println("\n\n                                    ████████████████████████");
                System.out.println("                                    ███  Menu Principal  ███");
                //tempoPadraoAnimacao(140);
                System.out.println("                                    ████████████████████████");
                //tempoPadraoAnimacao(115);
                System.out.println("                                    ██  1 - Instruções    ██");
                //tempoPadraoAnimacao(115);
                System.out.println("                                    ██  2 - Jogar         ██");
                //tempoPadraoAnimacao(115);
                System.out.println("                                    ██  3 - Céditos       ██");
                //tempoPadraoAnimacao(230);
                System.out.println("                                    ██  4 - Sair          ██");
                System.out.println("                                    ████████████████████████\n");
                escolha = entradaTexto();

                if (!escolha.matches("[0-9]")) {
                    System.out.println("Opção inválida, tente outra");
                } else {
                    if (escolha.equalsIgnoreCase("1")) {
                        opcaoMenu = 1;
                        validaEntradaMenu = true;
                    }
                    if (escolha.equalsIgnoreCase("2")) {
                        opcaoMenu = 2;
                        validaEntradaMenu = true;
                    }
                    if (escolha.equalsIgnoreCase("3")) {
                        opcaoMenu = 3;
                        validaEntradaMenu = true;
                    }
                    if (escolha.equalsIgnoreCase("4")) {
                        opcaoMenu = 4;
                        validaEntradaMenu = true;
                    }
                }
            } while (!validaEntradaMenu == true);

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

    // --------------------------------- Tela de abertura do jogo ---------------
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
    // -------------------------------------------------------------------------------------------------------

    // ---------------------------- Primeiro Capitulo ----------------------------
    private static void capitulo_um(String nome_jogador, int vida, int experiencia, int cristais) {
        int dano_capitulo_um = danoAleatorio(1, 5);
        tempoPadraoAnimacao((600 * 10));
        System.out.printf(
                "\n\nHawk: Olá %S lhe garanto que se você desejar de fato, obter a consciência que estou disposto a ensinar,",
                nome_jogador);
        tempoPadraoAnimacao((600 * 10));
        System.out.printf("\nvocê poderá atravessar fronteiras e desbravar o mundo com tal compreensão.");
        tempoPadraoAnimacao((600 * 10));
        System.out.printf(
                "\nPara conquistar esta clareza mental que vos falo, precisaremos nos aventurar por um lugar chamado 'Floresta das almas'.");
        tempoPadraoAnimacao((600 * 10));
        System.out.println(
                "\nOnde haverão desafios e indagações para a minha pessoa, e para ti também, aceita correr esse risco para despertar sua consciência?");
        tempoPadraoAnimacao((600 * 10));
        System.out.printf("\n\nGaranto que será útil em breve. Muito bem, então vamos lá.");
        tempoPadraoAnimacao((600 * 10));
        System.out.println("\nVocês caminham até a floresta e o mago lan Hawk descreve como funcionarão as coisas:\n");
        //tempoPadraoAnimacao((550 * 10));
        System.out.printf(
                "\nHawk: Pois bem, %S, nós caminharemos por esta floresta e surgirão monstros que farão perguntas sobre alguns assuntos.",
                nome_jogador, nome_jogador);
        tempoPadraoAnimacao((600 * 10));
        System.out.printf("\nQuando isto acontecer, eu irei parar o tempo com um cristal mágico e iremos conversar");
        tempoPadraoAnimacao((600 * 10));
        System.out.printf(
                "\nsobre o assunto, eu posso usar até 10 cristais para lhe ajudar, sendo apenas 1 por desafio,");
        tempoPadraoAnimacao((600 * 10));
        System.out.printf("\ne você tem a liberdade de querer parar nossa jornada com o");
        tempoPadraoAnimacao((600 * 10));
        System.out.println(
                "\nuso de no mínimo 5 cristais. lembrando que eu irei lhe ajudar, mas sem lhe dar a resposta correta.");
        tempoPadraoAnimacao((600 * 10));
        System.out.printf("\n\nO nosso futuro está nas suas mãos %S!", nome_jogador);
        tempoPadraoAnimacao((500 * 10));

        System.out.println("\n\nVocês entram na Florestas das Almas e começam a caminhar\n\n");
        tempoPadraoAnimacao((500 * 10));
        System.out.printf(".");
        tempoPadraoAnimacao((500 * 10));
        System.out.printf(".");
        tempoPadraoAnimacao((500 * 10));
        System.out.printf(".\n");
        tempoPadraoAnimacao((600 * 10));
        System.out.printf(
                "\n\nHawk: Há uma coisa que eu não lhe falei, suas escolhas definem o final desta nossa aventura, então tome cuidado no que decidir.");
        tempoPadraoAnimacao((500 * 10));
        System.out.printf("\n\nVocês caminham por mais alguns minutos\n");
        tempoPadraoAnimacao((500 * 10));
        System.out.printf(".");
        tempoPadraoAnimacao((500 * 10));
        System.out.printf(".");
        tempoPadraoAnimacao((500 * 10));
        System.out.printf(".\n");
        tempoPadraoAnimacao((500 * 10));
        System.out.printf("\nVocê se depara com uma imagem de si mesmo a sua frente, semelhante a um espelho");
        tempoPadraoAnimacao((600 * 10));
        System.out.printf(
                "\nPorém, não se parece com você, é um reflexo acinzentado, com uma aura assustadora e algo marcante ");
        System.out.printf(".");
        tempoPadraoAnimacao((500 * 10));
        System.out.printf(".");
        tempoPadraoAnimacao((500 * 10));
        System.out.printf(".\n");
        tempoPadraoAnimacao((500 * 10));
        System.out.printf("\nA criatura sussurrava repetidas vezes:\n");
        tempoPadraoAnimacao((600 * 10));
        System.out.printf(
                "\n-um zero um zero zero zero um um um um zero (10100011110)\n\n-A criatura medonha fez uma pausa e então continuou.\n");
        tempoPadraoAnimacao((500 * 10));
        System.out.printf("\n- um um um um um um zero zero um um zero (1111 1100 110).\n");
        tempoPadraoAnimacao((500 * 10));
        System.out.printf("\nHawk: O que é isso? Ah %S, este é seu primeiro desafio.", nome_jogador);
        tempoPadraoAnimacao((600 * 10));
        System.out.printf(
                "\nHawk: Para convertermos um número 'binário' para decimal, basta multiplicarmos essa ordem: 1010 0011 110 pelas potências do número 2.\n");
                tempoPadraoAnimacao((600 * 10));
        System.out.printf(
                "\nComo por exemplo: 1x210 0x29 1x28 0x27 0x26 0x25 1x24 1x23 1x22 1x21 0x2°. Utilizando a ordem do 1° número binário (10100011110)\n");
                tempoPadraoAnimacao((600 * 10));
        System.out.printf(
                "Conhece os valores de 2? Para relembrarmos, vou lhe dar uma pequena dica de cálculo: 2x11 = 2 x 2 x 2 x 2 x 2 x 2 x 2 x 2 x 2 x 2 x 2.\n");
                tempoPadraoAnimacao((600 * 10));
        System.out.printf(
                "O resultado de uma multiplicação, você multiplica pelo próximo número e assim sucessivamente.");
                tempoPadraoAnimacao((600 * 10));
        boolean acertou = false;

        // primeira questão

        while (!acertou == true && vida > 0 && cristais > 0) {//Valida a questão enquanto as condições forem respeitadas
            System.out.printf("\n\nExperimente realizar o cálculo e selecionar a alternativa correta:\n");
            tempoPadraoAnimacao((600 * 10));
            System.out.printf("\nRESPONDA! - GRITA A BESTA:\n");
            alternativa_pergunta_um();
            String resposta_jogador = entradaTexto();
            if (resposta_jogador.equalsIgnoreCase("A")) {
                System.out.println("\nVocê ACERTOU");
                System.out.printf("\n\n- O que é isso que está acontecendo??\n\n");
                System.out.printf("O monstro começa irradiar uma energia que seus olhos mal conseguem observar\n\n");
                System.out.println("Olá, meu nome é Bill Gates.\nVocê garantiu que no futuro eu pudesse existir e revolucionar não só uma geração de tecnologia, mas sim a vida de várias pessoas, Obrigado\n\n");
                System.out.printf("- O que acabou de acontecer?\n\n");
                System.out.printf("Hawk: Oh %S eu acabei me esquecendo de lhe alertar.\nA cada desafio cumprido com sucesso, o monstro que nós nos depararmos irá ser libertado e enviado de volta para o seu devido lugar no futuro.\nEntão de vez em quando podemos nos deparar com pessoas que para você podem ser estranhas, mas eu lhe garanto, você estará fazendo a diferença.\n",nome_jogador);
                acertou = true;
            } else {
                System.out.println("\nVOCÊ ERROU!");
                tempoPadraoAnimacao((600 * 10));
                System.out.printf("\n\nO monstro anda em direção a você e pega no seu braço, marcando você\ncom o que aparenta ser um símbolo magico e depois se esvai junto com os ventos da natureza...\n\n");
                System.out.println("Isso não é um bom sinal...");
                tempoPadraoAnimacao((600 * 10));
                System.out.printf("Hawk: Isso %S, é a representatividade da marca da Álgebra Booleana, no qual quer dizer “O Inversor”.\nA cada pergunta respondida de forma errada fará você receber uma parte deste símbolo\nE o que acontece se você deixar esse símbolo se completar?\nBem...\nO jogo acaba, e o futuro tecnológico da humanidade estará perdido.", nome_jogador);
                tempoPadraoAnimacao((600 * 10));
                System.out.printf("\nEntão concentre-se nos desafios e garanto que dará tudo certo");
                tempoPadraoAnimacao((600 * 10));
                vida -= dano_capitulo_um;
                System.out.printf("\nVocê sofre %d de dano. Agora você tem %d de vida restante\n", dano_capitulo_um, vida);
                tempoPadraoAnimacao((600 * 10));
                acertou = true;
            }
        }
    }


    //Capitulo 2
    public static void capitulo_dois(String nome_jogador, int vida, int experiencia, int cristais) {
        String  escolha_jogador;
        System.out.println("\nApós o 1° desafio ter sido concluído, vocês e o mestre Ian continuam a explorar a floresta\n");
        do {
            System.out.println("1 - Perguntar sobre seu passado");
            System.out.println("2 - Continuar andando em silêncio");
            System.out.println("3 - Perguntar sobre a marca");
            escolha_jogador = entradaTexto();
            if (escolha_jogador.equalsIgnoreCase("1")) {
                System.out.printf("\n%S: Eu ouvi falar dos rumores sobre sua pessoa, é verdade?\n", nome_jogador);
                tempoPadraoAnimacao((500 * 10));
                System.out.println("Hawk: Qual parte? Que eu não passo de um bêbado e descontrolado e que vivo contando mentiras?");
                tempoPadraoAnimacao((500 * 10));
                System.out.printf("\n%S Não exatamente...", nome_jogador);
                tempoPadraoAnimacao((500 * 10));
                System.out.println("Hawk: Você viu com seus próprios olhos, eu não sou louco.\nEssas criaturas que vamos enfrentar desafiam a todo momento o destino da humanidade,\ne francamente já estou ficando velho demais para combater eles sozinho.");
                System.out.printf("\n%S: O que aconteceu para você se tornar... isso?\n",nome_jogador);
                tempoPadraoAnimacao((500 * 10));
                System.out.println("Hawk: Argh, desde criança fui abençoado com o poder da curiosidade, sabe o que é isso minha cara?");
                System.out.printf("\n%S: Não...\n",nome_jogador);
                tempoPadraoAnimacao((500 * 10));
                System.out.println("Hawk: É uma vontade escondida e poderosa que todos nós temos dentro de si.\nUma vontade de desbravar e descobrir os segredos do nosso mundo.\nuanto mais os anos se passavam, mais eu estudei e procurei entender as coisas que nos rodeiam,\ne consequentemente me tornei essa pessoa que vos fala.\nUm dos mais sábios da atualidade, porém o denominado 'louco' pelas pessoas comuns em nossa sociedade contemporânea.\n\n");
            }
            if (escolha_jogador.equalsIgnoreCase("2")) {
                break;
            }
            if (escolha_jogador.equalsIgnoreCase("3")) {
                System.out.printf("\n%S: Pode me dizer mais sobre essa marca no meu braço?\n", nome_jogador);
                tempoPadraoAnimacao((500 * 10));
                System.out.println("Hawk: Não há muito a dizer além daquilo que já falei.\nApenas peço que se concentre nos desafios e pense muito bem sobre sua próxima alternativa de resposta do desafio,\nse tudo der certo quero que você seja meu sucessor, então se esforce.\n\n");
                break;
            }
        } while (escolha_jogador.equalsIgnoreCase("1")||escolha_jogador.equalsIgnoreCase("2")||escolha_jogador.equalsIgnoreCase("3"));

        System.out.println("\n\nMinutos se passam e vocês encontram uma ponte com lamaçal em suas laterais, correndo um risco de ecorregarem e não conseguir voltar para o topo.\n\n");
        tempoPadraoAnimacao((500 * 10));
        System.out.println("Hawk: Não se assuste, esse caminho não é perigoso, vá com calma e seja cuidadoso.");
        tempoPadraoAnimacao((500 * 10));
        System.out.println("Ao dar os primeiros passos na ponte ela começa a soltar um rangido\nUm monstro de lama surge dentre as entradas das tábuas\nfalando em um tom entendível a seguinte mensagem:\n\n");
        tempoPadraoAnimacao((500 * 10));
        System.out.println("Lamacento: A realidade é que o conceito de álgebra booleana se dá ao fato\nde existirem apenas uma verdade e uma informação falsa, sendo representada pelo número 1 e 0\nDiga me então seu humano asqueroso (disse o monstro cheio de lama e coberto por fezes animais)\n\n");
        tempoPadraoAnimacao((500 * 10));
        System.out.printf("Calma %S , antes de ficar preocupado deixe-me introduzir este assunto complexo:\n\n", nome_jogador);
        tempoPadraoAnimacao((500 * 10));
        System.out.println("A ideia da Álgebra Booleana é a de que existem apenas duas teorias em determinada situação/problemas, se é VERDADEIRO ou FALSO\n");
        tempoPadraoAnimacao((500 * 10));
        System.out.println("Nessa Álgebra podemos encontrar funções e portas lógicas\nseguidas de suas “Tabelas Verdades” (que são os verdadeiros valores para determinadas funções,\ne nunca serão alteradas).\nAs portas lógicas não funcionam apenas com valores numéricos, mas também com circuitos de chaveamento,\nquando algo está ligado ou desligado, por exemplo.");
        tempoPadraoAnimacao((500 * 10));


        int dano_capitulo_dois = danoAleatorio(1, 7);
        boolean acertou = false;

        while (!acertou == true && vida > 0 && cristais > 0) {//Valida a questão enquanto as condições forem respeitadas
            System.out.println("\n\nLamacento: Me diga quais afirmativas são verdadeiras e falsas:\n");
            tempoPadraoAnimacao((500 * 10));
            System.out.println("A álgebra booleana usa funções e variáveis, como na álgebra convencional, que podem assumir apenas um dentre dois valores:\n");
            tempoPadraoAnimacao((500 * 10));
            System.out.println("I - {Não, Sim} – Resposta óbvia");
            tempoPadraoAnimacao((500 * 10));
            System.out.println("II - {Falso, Verdadeiro} - Raciocínio humano");
            tempoPadraoAnimacao((500 * 10));
            System.out.println("III - {True, False} – Raciocínio humano composto ");
            tempoPadraoAnimacao((500 * 10));
            System.out.println("IV - {Desligado, Ligado} - Circuitos de chaveamento");
            tempoPadraoAnimacao((500 * 10));
            System.out.println("V - {0, 1} - Sistema binário\n\n");
            alternativa_pergunta_dois();
            String resposta_jogador = entradaTexto();
            if (resposta_jogador.equalsIgnoreCase("4")) {
                System.out.println("\nVocê ACERTOU");
                tempoPadraoAnimacao((500 * 10));
                System.out.println("A lama do monstro começa a escorrer cada vez mais e ele solta um enorme estrondo\nseguido daquela mesma luz que enalteceu o primeiro monstro.\n\nEle irradia uma energia pura e libertadora.\n\n");
                tempoPadraoAnimacao((500 * 10));
                System.out.println("Olá meus jovens, eu me chamo Steve Jobs,\nmuito obrigado por conseguir me libertar e me permitir estar presente em nosso mundo nos próximos anos, vejo vocês do outro lado.");
                tempoPadraoAnimacao((500 * 10));
                System.out.println("\n\nLogo depois do “lamacento” ser libertado e sua marca da AB ser preservada,\no mestre mago seguiu com a sua companhia pela floresta das almas.\n\n");
                tempoPadraoAnimacao((500 * 10));
                System.out.printf("Hawk: Ora ora ora, parece que você está pegando o jeito %S, meu pequeno gafanhoto,\ndesse jeito nenhum tipo de desafio será páreo para nós dois.\nContinue prestando atenção e sendo cuidadoso na hora de responder", nome_jogador);
                tempoPadraoAnimacao((500 * 10));

                acertou = true;
            } else {
                System.out.println("\nVOCÊ ERROU!");
                tempoPadraoAnimacao((500 * 10));
                System.out.println("O “lamacento”, com seus braços gigantescos, estica-os por baixo da ponte\npega um punhado de lama, criando assim uma espécie de bola e a arremessa em sua direção.");
                tempoPadraoAnimacao((500 * 10));
                System.out.printf("Hawk: %S NÃÃÃÃOOOO....",nome_jogador);
                tempoPadraoAnimacao((500 * 10));
                System.out.println("A lama atinge em cheio o símbolo do “Inversor” no seu antebraço,\ndeixando-o irritado e grudento.\nO lamacento voltar para debaixo da ponte dando altos grunhidos.\n\n");
                tempoPadraoAnimacao((500 * 10));
                System.out.printf("Hawk: Eu nem sei o que dizer %S...\nVocê precisa ter mais calma, leia e reflita atentamente sobre meus ensinamentos e as questões abordadas pelos monstros\nque eu tenho certeza de que essa marca irá sumir no fim dessa aventura.",nome_jogador);
                vida -= dano_capitulo_dois;
                System.out.printf("\nVocê sofre %d de dano. Agora você tem %d de vida restante\n", dano_capitulo_dois, vida);
                acertou = true;
                tempoPadraoAnimacao((500 * 10));
            }
        }
        System.out.println("Hawk: Olha meu jovem, sei que está ficando cansado (a), mas não desanime.\nA partir de agora faremos uma maratona! Nosso tempo está ficando apertado e não podemos permanecer nesta floresta a noite toda.\nTudo bem? Precisamos chegar pelo menos no topo daquela colina para termos um lugar para acampar e ficar um pouco mais seguro.\nEntão se apresse.\n\n");
    }

    //Capitulo 3

    public static void capitulo_tres(String nome_jogador, int vida, int experiencia, int cristais) {
        System.out.println("Vocês começam a correr e se esquivar dos galhos das árvores e obstáculos no caminho.\nMas, em um dos momentos de se esquivar de uma árvore, ela toma forma de uma criatura com braços em forma de galhos, e suas raízes sendo suas pernas.\nO monstro agarra você pelo braço e o aperta, causando dor na sua marca (se você tiver errado alguma questão, é claro),\nlançando você para longe de seu caminho.");
        tempoPadraoAnimacao((500 * 10));
        System.out.println("\n\nArvoroto: Hurh, nem mais um passo.\n\nHawk: Essa não... não imaginei que o nível fosse ficar mais alto logo agora... Tenho pessimas notícias.\n\n");
        tempoPadraoAnimacao((500 * 10));
        System.out.println("Arvoroto: Só irão passar de mim se conseguirem entender e responder ao meu desafio.\n\n");
        tempoPadraoAnimacao((500 * 10));
        System.out.printf("Hawk: O ritmo das perguntas mudou agora %S coisas inesperadas podem aconte-\n", nome_jogador);
        tempoPadraoAnimacao((500 * 10));
        System.out.println("Arvoroto: ENTÃO VAMOS COMEÇAR: \n\nO monstro avança até você enquanto grita a pergunta\n\n");

        int dano_capitulo_tres = danoAleatorio(10, 50);
        boolean acertou = false;
        while (!acertou == true && vida > 0 && cristais > 0) {//Valida a questão enquanto as condições forem respeitadas
            System.out.println("ME DÊ 1 EXEMPLO DO OPERADOR AND:\n");
            alternativa_pergunta_tres();
            String reposta_jogador = entradaTexto();
            if (reposta_jogador.equalsIgnoreCase("B")) {
                System.out.println("\nVocê ACERTOU");
                tempoPadraoAnimacao((500 * 10));
                System.out.println("\n\nO monstro de árvore começa a se contorcer até virar um ser de luz radiante...\n\n");
                tempoPadraoAnimacao((500 * 10));
                System.out.printf("Elon Musk: Olá %S,você me conhece?\nEu estou construindo um foguete la no futuro, e irei levar todos nós até a lua, obrigado por me libertar.\n\n", nome_jogador);
                tempoPadraoAnimacao((500 * 10));
                System.out.println("Hawk: Muito bem meu rapaz! Você está indo realmente muito bem, estou muito orgulhoso.\nAcredito que daqui em diante não haverá mais monstros até a colina, estamos prestes a chegar ao fim de nossa aventura,\nmas deixa eu te perguntar,\n\nVocê conhece o Elon Musk...?\n\n");
                tempoPadraoAnimacao((500 * 10));
                acertou = true;
            } else {
                System.out.println("\nVOCÊ ERROU!");
                tempoPadraoAnimacao((500 * 10));
                System.out.println("O arvoroto retira um de seus braços de madeira e lança-o até você, perfurando a lateral do seu abdômen.\nLogo após ele se torna parte da própria terra e desaparece.");
                tempoPadraoAnimacao((500 * 10));
                System.out.println("Hawk: Essa não, nosso plano está desmoronando...\nHawk: Olhe para o seu abdômen.");
                tempoPadraoAnimacao((500 * 10));
                System.out.println("Seu abdômen começa a sangrar e seu antebraço completa a marca do Inversor.");
                tempoPadraoAnimacao((500 * 10));
                System.out.println("Hawk: Não podemos errar mais nenhum desafio daqui em diante\nHawk: caso contrário tudo estará perdido.");
                tempoPadraoAnimacao((500 * 10));
                vida -= dano_capitulo_tres;
                System.out.printf("\nVocê sofre %d de dano. Agora você tem %d de vida restante\n", dano_capitulo_tres, vida);
                tempoPadraoAnimacao((500 * 10));
                acertou = true;
            }
        }
        System.out.println("Após você fazer um curativo para o dano causado pelo último monstro, vocês e Hawk começam a caminhar para o destino final, a colina.");
        tempoPadraoAnimacao((500 * 10));
    }
    public static void capitulo_quatro(String nome_jogador, int vida, int experiencia, int cristais) {
        System.out.println("\n\nO dia estava se transformando em noite, corujas começaram a chirriar, os ventos ficaram mais fortes, e nossos aventureiros\nforam atingidos também...\npela fome.");
        tempoPadraoAnimacao((500 * 10));
        System.out.println("Eis que derrepente um gólem surge, e os indaga:\n");
        tempoPadraoAnimacao((500 * 10));
        
        System.out.println("Gólem: RESPONDAM-ME RÁPIDO SE QUISEREM SOBREVIVER!");
        tempoPadraoAnimacao((500 * 10));
        int dano_capitulo_quatro = danoAleatorio(30, 70);
        boolean acertou_pergunta4 = false;
        while (!acertou_pergunta4 == true && vida > 0 && cristais > 0) {//Valida a questão enquanto as condições forem respeitadas
            System.out.println("\n\nGólem: QUEM FOI O PAI DA COMPUTAÇÃO?");
            alternativa_pergunta_quatro();
            String reposta_jogador = entradaTexto();
            if (reposta_jogador.equalsIgnoreCase("A")) {
                System.out.println("\nVocê ACERTOU");
                tempoPadraoAnimacao((500 * 10));
                System.out.println("Gólem: AH, MUITO BEM, ACEITEM COMO RECOMPENSA PELA RESPOSTA CORRETA");
                tempoPadraoAnimacao((500 * 10));
                System.out.println("\n\n Ele os entraga uma sacola cheia de comida \n\n");
                tempoPadraoAnimacao((500 * 10));
                System.out.println("Golém: Uma pedra não precisa de comida, agora vocês sacos de carne, sim. Inteligentes porém molengas.");
                tempoPadraoAnimacao((500 * 10));
                System.out.println("\n\nO Golém vai embora em direção a floresta com um caminhar calmo, enquanto derruba tudo a sua frente");
                tempoPadraoAnimacao((500 * 10));
                acertou_pergunta4 = true;
            } else {
                System.out.println("\nVOCÊ ERROU!");
                tempoPadraoAnimacao((500 * 10));
                System.out.println("Golém: VOCÊS ERRARAM.");
                tempoPadraoAnimacao((500 * 10));
                System.out.println("\n\n O golém lança uma sacola cheia de comida em direção a vocês\n\n");
                tempoPadraoAnimacao((500 * 10));
                vida -= dano_capitulo_quatro;
                System.out.printf("\nVocê sofre %d de dano. Agora você tem %d de vida restante\n", dano_capitulo_quatro, vida);
                tempoPadraoAnimacao((500 * 10));
                System.out.println("Golém: Vocês são burros, mas eu não preciso disso mesmo, eu não como, nem sei poruqê peguei isso, deve ser piada de um dos devs\n onde já se viu? UMA PEDRA COMER! HAHAHAH!");
                tempoPadraoAnimacao((500 * 10));
                System.out.println("\n\n O Golém vai embora gargalhando sozinho\n\n");
                tempoPadraoAnimacao((500 * 10));
                acertou_pergunta4 = true;
            }
        }
        //Trecho da história omitido para fins da apresentação
        boolean acertou_pergunta = false;
        int resposta_afirmativa_negativa = 2;

        while (!acertou_pergunta == true && vida > 0 && cristais > 0) {            
            System.out.println("Suponhamos que um jovem comerciante esteja vendendo 5 maçãs e 10 bananas,\nseu cliente compre 6 dessas frutas, a quantidade de frutas que irão\nrestar será correspondente ao valor da tabela verdade do operador lógico 'OR'?");
            tempoPadraoAnimacao((500 * 10));
            System.out.println("RESPONDA COM '0' PARA SIM OU '1' PARA NÃO");
            int resposta_final = entrada_Numero();

            boolean sim_ou_nao = alternativa_pergunta_cinco(resposta_final);
            if (!sim_ou_nao == true) {
                System.out.println(" Ao ter errado a resposta do desafio,\no monstro começa a gargalhar sem fim e sua visão começa a ficar extremamente escura,\nsua barriga continua inchando e ficando subitamente vermelha,\naté que explode e você morre");
                tempoPadraoAnimacao((500 * 10));
                acertou_pergunta = true;
            } else {
                System.out.println("Sua barriga começa a borbulhar e transbordar para fora de si. Em outras palavras...");
                tempoPadraoAnimacao((500 * 10));
                System.out.println("\n\nVocê estava vomitando tudo o que estava dentro de si, inclusive o monstro");
                tempoPadraoAnimacao((500 * 10));
                System.out.println("Ao terminar de jogá-lo para fora, ele começa a crescer e a tomar uma forma de um ser humano peculiar");
                tempoPadraoAnimacao((500 * 10));
                System.out.println("Jeff Bezos: Eu não acredito, eu estou livre... nem sei como agradecer a vocês, prometo que irei recompensá-los no futuro.");
                tempoPadraoAnimacao((500 * 10));
                System.out.println("Logo após ele tomar forma de um humano, seu corpo e alma foram levados para um outro tempo astral no futuro, deixando um rastro brilhante e radiante pelos céus.\n");
                tempoPadraoAnimacao((500 * 10));
                System.out.println("Hawk: Olha só, minha cara, parece que você está indo muito bem,\nHawk: fico feliz que esteja seguindo restritamente tudo aquilo que eu leciono para você,\nHawk: dessa forma conseguiremos cumprir nossa missão facilmente, estamos quase chegando la.\n");
                tempoPadraoAnimacao((500 * 10));
                System.out.printf("\n%S: Hawk, o que é lecionar?\n\n", nome_jogador);
                acertou_pergunta = true;
            }
        }

        System.out.printf("\n\nAo dar início a escalada à colina, Hawk começa a deixar de ter uma forma humana e");
        System.out.printf(".");
        tempoPadraoAnimacao(2500);
        System.out.printf(".");
        tempoPadraoAnimacao(2500);
        System.out.printf(".");
        tempoPadraoAnimacao(2500);
        System.out.println("\n\n\n RAIOS EXPLENDIDOS ENVOLVEM HAWK\n\n\n");
        tempoPadraoAnimacao((300*10));
        System.out.println("Ele revela sua verdadeira forma");
        tempoPadraoAnimacao((300*10));
        System.out.println("\n\n░ ░ Terry Myerson(vice president da windows) ░ ░\n\n");
        tempoPadraoAnimacao((760*10));
            
    }
    // ---------------------------- Epilogo
    // --------------------------------------------------
    public static boolean epilogo(String nome_jogador) {
        boolean verificaResposta = false;

        System.out.printf(
                "\n%S, sua história começa com um jovem mestre, alguns taberneiros achavam que ele era um charlatão,\nas vezes o confundiam com um mago, e outras com um ser místico, enquanto outras pessoas\napenas o achavam um rapaz louco e bêbado.\n\n",
                nome_jogador);
                tempoPadraoAnimacao((500 * 10));
        System.out.printf(
                "Ele possuía 1,71 de altura, barba rala era calvo.\n\nEra sorridente e bastante engraçado.\n\nSeu nome era lan Hawk.\nlan possuía muito conhecimento em assuntos computacionais, e por esse motivo as pessoas o achavam maluco, por ter conhecimento de assuntos que não faziam sentido naquela época e que ninguém nunca entendia.\n\n");
                tempoPadraoAnimacao((500 * 10));
        System.out.printf(
                "\nMas como estava ficando muito velho decidiu passar sua sabedoria para as próximas gerações.\n\nEle queria plantar a semente do conhecimento naqueles que tinham vontade de aprender.");
                tempoPadraoAnimacao((500 * 10));

        // Se a resposta for verdade continua o jogo
        while (!verificaResposta == true) {
            System.out.println(
                    "\n\nVocê está pronto(a) para se tornar o aprendiz do mestre mago?\n");
            System.out.printf("Responda com S ou N: \n\n");
            String entrada_user = entradaTexto();

            if (!entrada_user.equalsIgnoreCase("n") && entrada_user != null && entrada_user.matches("^[a-zA-Z]*$")) {
                verificaResposta = true;
                System.out.printf(".");
                tempoPadraoAnimacao(300 * 10);
                System.out.printf(".");
                tempoPadraoAnimacao(300 * 10);
                System.out.printf(".");
                tempoPadraoAnimacao(300 * 10);
                System.out.printf(".");
                tempoPadraoAnimacao(300 * 10);

            } else if (entrada_user.equalsIgnoreCase("n") && entrada_user != null
                    && entrada_user.matches("^[a-zA-Z]*$")) {
                break;
            } else {
                System.out.println("Opa, parece que você digitou algo errado, lembre-se, responda com S ou N");
            }
        }
        return verificaResposta;
    }

    public static void main(String[] args) {
        imprimeBoasVindas();// animação de boas vindas ao jogo
        telaInicial();// tela inicial que da a opção de continuar ou sair do jogo
    }
}