import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    public void registrarLivro(Livro livro) {
        livros.add(livro);
        System.out.println("Livro " + livro.getTitulo() + " registrado com sucesso!");
    }

    public void emprestarLivro(String titulo) {
        boolean encontrado = false;
        for (Livro livro : livros) {
            if (livro.getTitulo().equals(titulo)) {
                livro.emprestar();
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Livro " + titulo + " não encontrado na biblioteca.");
        }
    }

    public void devolverLivro(String titulo) {
        boolean encontrado = false;
        for (Livro livro : livros) {
            if (livro.getTitulo().equals(titulo)) {
                livro.devolver();
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Livro " + titulo + " não encontrado na biblioteca.");
        }
    }

    public void listarLivrosDisponiveis() {
        System.out.println("Livros disponíveis para empréstimo:");
        for (Livro livro : livros) {
            if (livro.isDisponivel()) {
                System.out.println(livro.getTitulo() + " - " + livro.getAutor());
            }
        }
    }
}
