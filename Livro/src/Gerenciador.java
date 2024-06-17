import java.util.Scanner;

public class Gerenciador {
    private static Biblioteca biblioteca = new Biblioteca();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Gerenciador gerenciador = new Gerenciador();
        int opcao;

        do {
            exibirMenu();
            opcao = lerOpcao();

            switch (opcao) {
                case 1:
                    gerenciador.registrarLivro();
                    break;
                case 2:
                    gerenciador.emprestarLivro();
                    break;
                case 3:
                    gerenciador.devolverLivro();
                    break;
                case 4:
                    gerenciador.listarLivrosDisponiveis();
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Escolha novamente.");
                    break;
            }
        } while (opcao != 0);
    }

    private static void exibirMenu() {
        System.out.println("\n### Menu ###");
        System.out.println("1. Registrar Novo Livro");
        System.out.println("2. Emprestar Livro");
        System.out.println("3. Devolver Livro");
        System.out.println("4. Listar Livros Disponíveis");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static int lerOpcao() {
        return scanner.nextInt();
    }

    private void registrarLivro() {
        scanner.nextLine(); // Limpar o buffer do scanner
        System.out.print("Digite o título do livro: ");
        String titulo = scanner.nextLine();
        System.out.print("Digite o autor do livro: ");
        String autor = scanner.nextLine();

        Livro novoLivro = new Livro(titulo, autor);
        biblioteca.registrarLivro(novoLivro);
    }

    private void emprestarLivro() {
        scanner.nextLine(); // Limpar o buffer do scanner
        System.out.print("Digite o título do livro para empréstimo: ");
        String titulo = scanner.nextLine();

        biblioteca.emprestarLivro(titulo);
    }

    private void devolverLivro() {
        scanner.nextLine(); // Limpar o buffer do scanner
        System.out.print("Digite o título do livro para devolução: ");
        String titulo = scanner.nextLine();

        biblioteca.devolverLivro(titulo);
    }

    private void listarLivrosDisponiveis() {
        biblioteca.listarLivrosDisponiveis();
    }
}
