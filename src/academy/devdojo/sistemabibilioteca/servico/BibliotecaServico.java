package academy.devdojo.sistemabibilioteca.servico;

import academy.devdojo.sistemabibilioteca.dominio.Livro;
import academy.devdojo.sistemabibilioteca.dominio.StatusLivro;
import academy.devdojo.sistemabibilioteca.dominio.Usuario;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaServico {

    // atributos para armazenar livros e usuários

    private ArrayList<Livro> livros = new ArrayList<>();

    private ArrayList<Usuario> usuarios = new ArrayList<>();

    public BibliotecaServico() {
    }


    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public Livro buscarLivroPorTitulo(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equals(titulo)) {
                return livro;
            }
        }
        return null;

    }

    public List<Livro> listarLivrosDisponiveis() {
        ArrayList<Livro> livrosDisponiveis = new ArrayList<>();
        for (Livro livro : livros) {
            if (livro.getStatus().equals(StatusLivro.DISPONIVEL)) {
                livrosDisponiveis.add(livro);
            }
        }
        return livrosDisponiveis;
    }
}
