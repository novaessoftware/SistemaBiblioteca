package academy.devdojo.sistemabibilioteca.principal;

import academy.devdojo.sistemabibilioteca.dominio.*;
import academy.devdojo.sistemabibilioteca.servico.BibliotecaServico;
import academy.devdojo.sistemabibilioteca.servico.EmprestimoServico;

public class Main {
    public static void main(String[] args) {
        BibliotecaServico biblioteca = new BibliotecaServico();
        EmprestimoServico emprestimos = new EmprestimoServico();
        Livro livro1 = new Livro();
        livro1.setId(1);
        livro1.setTitulo("Amor e Gelato");
        livro1.setAutor("Beatriz Santiago");
        livro1.setQuantidade(5);
        livro1.setAno(2026);
        livro1.setStatus(StatusLivro.DISPONIVEL);
        biblioteca.adicionarLivro(livro1);
        System.out.println("Livro adicionado: " +livro1.getTitulo());

        Usuario usuario1 = new Usuario();
        usuario1.setId(1);
        usuario1.setNome("Matheus");
        usuario1.setEmail("mnovaestheus927@gmail.com");
        usuario1.setCpf("111-938-948-38");
        usuario1.setTipo(TipoUsuario.ALUNO);
        usuario1.setTelefone("123987456");
        usuario1.setAtivo(true);
        biblioteca.adicionarUsuario(usuario1);
        System.out.println("Usuário adicionado: " + usuario1.getNome());

        Emprestimo emp1 = emprestimos.registrarEmprestimo(livro1, usuario1);
        System.out.println("Empréstimo registrado!");

        emprestimos.devolverLivro(emp1);
        System.out.println("Livro devolvido!");

        double multa = emprestimos.calcularMulta(emp1);
        System.out.println("Multa: R$ " + multa);
    }
}
