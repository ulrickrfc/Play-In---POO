import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Olá, bem vindo a Play-In!");

    Plataforma plataforma = new Plataforma();

    // plataforma.addUsuario("Ulrick", 1234, 23, 33043652, "Salvador", "Bah2ia",
    // "Acao");

    // plataforma.addUsuario("Zorro", 321456, 24, 33043652, "Salvador1", "Bah3ia",
    // "Corrida");
    // plataforma.addUsuario("Perseu", 323232, 24, 33043652, "Salvado2r", "Bahi4a",
    // "Corr2ida");

    // JogoVirtual w = new JogoVirtual("TheLasteeeeeeeeee", "PS4", "naughty Dog",
    // "Acao", 1998, "PSN");
    // JogoVirtual q = new JogoVirtual("The Last of Us2", "PS4", "naughty Dog",
    // "Acao", 1994, "PSN");
    // JogoVirtual f = new JogoVirtual("The Last of Us2", "PS4", "naughty Dog",
    // "Acao", 1994, "PSN");

    // JogoMidia v = new JogoMidia("Uncharted", "PS4", "NaughtyDog", "ação", 2004,
    // "novo");
    // JogoMidia a = new JogoMidia("Uncharted 2", "PS4", "NaughtyDog", "ação", 2004,
    // "novo");

    // JogoMidia m = new JogoMidia("Uncharted 3", "PS4", "NaughtyDog", "ação", 2004,
    // "novo");

    // plataforma.addPedido(1234, w, true, "Esse é um comentario");
    // plataforma.addPedido(1234, q, true, "Esse é um comentario");
    // plataforma.addPedido(321456, f, true, "Esse é um comentario");
    // plataforma.addPedido(321456, f, true, "Esse é um comentario");

    // plataforma.addSolicitacao(323232, q, false, "");
    // plataforma.addSolicitacao(323232, f, false, "");
    // plataforma.addSolicitacao(323232, w, false, "");
    // plataforma.addSolicitacao(323232, v, false, "");

    // plataforma.addSolicitacao(323232, a, false, "");

    // plataforma.addSolicitacao(323232, m, false, "");

    int i = 0;

    while (i == 0) {

      System.out.println("O que gostaria de fazer?");

      System.out.println(" 1 - Cadastrar um usuário"); // ok

      System.out.println(" 2 - Adicionar um jogo para compartilhar"); // ok

      System.out.println(" 3 - Adicinar uma solicitação"); // ok

      System.out.println(" 4 - Listar jogos disponíveis"); // ok

      System.out.println(" 5 - Listar solicitações de jogos");

      System.out.println(" 6 - Buscar jogo"); // ok

      System.out.println(" 7 - Saber mais sobre algum pedido"); // ok

      System.out.println(" 8 - Saber mais sobre alguma solicitacao");

      System.out.println(" 9 - Remover Pedido ou Solicitação");

      System.out.println(" 0 - Sair da Aplicação");

      String resS = sc.nextLine();
      int res = Integer.parseInt(resS);

      if (res == 1) {
        System.out.println("Informe seu nome");
        String nome = sc.nextLine();

        System.out.println("Informe seu CPF");
        String cpf = sc.nextLine();

        System.out.println("Informe sua idade");
        String idadeS = sc.nextLine();
        int idade = Integer.parseInt(idadeS);

        System.out.println("Informe seu telefone");
        String telefone = sc.nextLine();

        System.out.println("Informe sua cidade");
        String cidade = sc.nextLine();

        System.out.println("Informe seu estado");
        String estado = sc.nextLine();

        System.out.println("Informe sua categoria favorita de jogos");
        String preferencia = sc.nextLine();

        plataforma.addUsuario(nome, cpf, idade, telefone, cidade, estado, preferencia);
      }

      if (res == 2) {

        // int cpf, Jogo jogo, boolean com_comentario, String comentario
        // String titulo, String plataforma, String produtora, String categoria, int
        // anoLancamento

        System.out.println("Digite seu CPF");

        String cpfJogo = sc.nextLine();

        System.out.println("O jogo é Virtual ou Mídia Física?");

        System.out.println("1 - Virtual");
        System.out.println("2 - Mídia Física");

        String res1S = sc.nextLine();
        int res1 = Integer.parseInt(res1S);

        System.out.println("Digite o titulo do jogo");
        String titulo = sc.nextLine();

        System.out.println("Digite  a plataforma do jogo");
        String plataformaJogo = sc.nextLine();

        System.out.println("Digite o nome da produtora do jogo");
        String produtora = sc.nextLine();

        System.out.println("Digite a categoria do jogo");
        String categoria = sc.nextLine();

        System.out.println("Digite o ano de lancamento do jogo");
        String anoLancamentoS = sc.nextLine();
        int anoLancamento = Integer.parseInt(anoLancamentoS);

        if (res1 == 1) {
          System.out.println("Digite o nome da loja que que comprou o jogo");
          String loja = sc.nextLine();

          JogoVirtual p = new JogoVirtual(titulo, plataformaJogo, produtora, categoria, anoLancamento, loja);

          System.out.println("Gostaria de deixar algum comentario?");

          System.out.println("1 - Sim");
          System.out.println("2 - Não");

          String resComS = sc.nextLine();
          int resCom = Integer.parseInt(resComS);

          if (resCom == 1) {
            System.out.println("Digite seu comentario");
            String comentario = sc.nextLine();

            plataforma.addPedido(cpfJogo, p, true, comentario);

          } else {
            plataforma.addPedido(cpfJogo, p, false, "");
          }

        } else {

          System.out.println("Digite o estado da mídia do jogo");
          String resMidia = sc.nextLine();

          JogoMidia p = new JogoMidia(titulo, plataformaJogo, produtora, categoria, anoLancamento, resMidia);

          System.out.println("Gostaria de deixar algum comentario?");

          System.out.println("1 - Sim");
          System.out.println("2 - Não");

          String resComS = sc.nextLine();
          int resCom = Integer.parseInt(resComS);

          if (resCom == 1) {
            System.out.println("Digite seu comentario");
            String comentario = sc.nextLine();

            plataforma.addPedido(cpfJogo, p, true, comentario);

          } else {
            plataforma.addPedido(cpfJogo, p, false, "");
          }

        }

      }

      if (res == 3) {

        // int cpf, Jogo jogo, boolean com_comentario, String comentario
        // String titulo, String plataforma, String produtora, String categoria, int
        // anoLancamento

        System.out.println("Digite seu CPF");

        String cpfJogo = sc.nextLine();

        System.out.println("O jogo é Virtual ou Mídia Física?");

        System.out.println("1 - Virtual");
        System.out.println("2 - Mídia Física");

        String res1S = sc.nextLine();
        int res1 = Integer.parseInt(res1S);

        System.out.println("Digite o titulo do jogo");
        String titulo = sc.nextLine();

        System.out.println("Digite  a plataforma do jogo");
        String plataformaJogo = sc.nextLine();

        System.out.println("Digite o nome da produtora do jogo");
        String produtora = sc.nextLine();

        System.out.println("Digite a categoria do jogo");
        String categoria = sc.nextLine();

        System.out.println("Digite o ano de lancamento do jogo");
        String anoLancamentoS = sc.nextLine();
        int anoLancamento = Integer.parseInt(anoLancamentoS);

        if (res1 == 1) {
          System.out.println("Digite o nome da loja que o jogo foi comprado");
          String loja = sc.nextLine();
          JogoVirtual p = new JogoVirtual(titulo, plataformaJogo, produtora, categoria, anoLancamento, loja);

          System.out.println("Gostaria de deixar algum comentario?");

          System.out.println("1 - Sim");
          System.out.println("2 - Não");

          String resComS = sc.nextLine();
          int resCom = Integer.parseInt(resComS);

          if (resCom == 1) {
            System.out.println("Digite seu comentario");
            String comentario = sc.nextLine();

            plataforma.addSolicitacao(cpfJogo, p, true, comentario);

          } else {
            plataforma.addSolicitacao(cpfJogo, p, false, "");
          }

        } else {
          System.out.println("Digite o estado da mídia do jogo");
          String estadoMidia = sc.nextLine();
          JogoMidia p = new JogoMidia(titulo, plataformaJogo, produtora, categoria, anoLancamento, estadoMidia);

          System.out.println("Gostaria de deixar algum comentario?");

          System.out.println("1 - Sim");
          System.out.println("2 - Não");

          String resComS = sc.nextLine();
          int resCom = Integer.parseInt(resComS);

          if (resCom == 1) {
            System.out.println("Digite seu comentario");
            String comentario = sc.nextLine();

            plataforma.addSolicitacao(cpfJogo, p, true, comentario);

          } else {
            plataforma.addSolicitacao(cpfJogo, p, false, "");
          }
        }

      }

      if (res == 4) {
        plataforma.listarPedidos();
      }

      if (res == 5) {
        plataforma.listarSolicitacoes();
      }

      if (res == 6) {
        System.out.println("Digite o nome do jogo que gostaria de buscar");

        String nomeJogo = sc.nextLine();

        int resposta = plataforma.buscarJogo(nomeJogo);
        if (resposta != 0) {
          System.out.println("O código do pedido que você busca é: " + resposta);
        } else {
          System.out.println("Não temos esse jogo disponível na nossa plataforma");
        }
      }

      if (res == 7) {

        System.out.println("Digite o código do pedido que gostaria de obter mais informações");

        String codigoPedidoS = sc.nextLine();
        int codigoPedido = Integer.parseInt(codigoPedidoS);
        plataforma.achaPedido(codigoPedido);
      }

      if (res == 8) {
        System.out.println("Digite o código da solicitação que gostaria obter mais informações");
        System.out.println("");

        String codeS = sc.nextLine();
        int codigo_solicitacao = Integer.parseInt(codeS);

        System.out.println("");

        plataforma.achaSolicitacao(codigo_solicitacao);

      }

      if (res == 9) {
        System.out.println("Digite o numero do codigo do pedido ou solicitacao");

        String idS = sc.nextLine();
        int id = Integer.parseInt(idS);

        System.out.println("");

        System.out.println("Digite o cpf da conta associada ao pedido ou solicitação");

        String cpf = sc.nextLine();

        if (id % 2 == 0) {
          if (plataforma.deletaPedido(id, cpf)) {
            System.out.println("Pedido Deletado com sucesso!");
          } else {
            System.out.println("O pedido não foi encontrado ou o cpf não está associado ao pedido");
          }

        } else {

          if (plataforma.deletaSolicitacao(id, cpf)) {
            System.out.println("Solicitacao deletada com sucesso!");
          } else {
            System.out.println("O pedido não foi encontrado ou o cpf não está associado ao pedido");
          }
        }
      }

      if (res == 0) {
        break;
      }

    }

    // Cadastrar Pedidos - ok
    // Cadastrar Solicitacoes - ok

    // Listar Jogos disponíveis para ser compartilhado - ok

    // Listar Solicitacoes - ok

  }
}