package academy.devdojo.sistemabibilioteca.servico;

import academy.devdojo.sistemabibilioteca.dominio.Emprestimo;
import academy.devdojo.sistemabibilioteca.dominio.Livro;
import academy.devdojo.sistemabibilioteca.dominio.StatusLivro;
import academy.devdojo.sistemabibilioteca.dominio.Usuario;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class EmprestimoServico {

    private ArrayList<Emprestimo> emprestimos = new ArrayList<>();

    public EmprestimoServico() {
    }

    // metodos abaixo

    public Emprestimo registrarEmprestimo(Livro livro, Usuario usuario) {
        Emprestimo emprestimo = new Emprestimo();
        emprestimo.setLivro(livro);
        emprestimo.setUsuario(usuario);
        emprestimo.setDataEmprestimo(LocalDate.now());
        emprestimo.setDataDevolucao(LocalDate.now().plusDays(14));
        emprestimos.add(emprestimo);
        return emprestimo;

    }

    public void devolverLivro(Emprestimo emprestimo) {
        emprestimo.setDevolvido(true);
        emprestimo.getLivro().setStatus(StatusLivro.DISPONIVEL);

    }

    public double calcularMulta(Emprestimo emprestimo) {
        if (LocalDate.now().isAfter(emprestimo.getDataDevolucao())) {
            long diasAtrasados = ChronoUnit.DAYS.between(emprestimo.getDataDevolucao(), LocalDate.now());
            double multa = diasAtrasados * 2.0;
            return multa;
        }
        return 0;
    }
}
