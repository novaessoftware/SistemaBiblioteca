# 📚 Sistema de Gerenciamento de Biblioteca

Um sistema robusto e bem estruturado para gerenciar livros, usuários e empréstimos em uma biblioteca. Desenvolvido com **Java** aplicando conceitos de **Programação Orientada a Objetos** (POO) e **Enumerações**.

---

## 🎯 Funcionalidades

✅ **Gerenciamento de Livros**
- Adicionar novos livros ao acervo
- Buscar livros por título
- Listar livros disponíveis
- Controlar status (Disponível, Emprestado, Danificado)

✅ **Gerenciamento de Usuários**
- Registrar diferentes tipos de usuários (Aluno, Professor, Funcionário)
- Manter informações completas (email, CPF, telefone)
- Ativar/desativar usuários

✅ **Sistema de Empréstimos**
- Registrar empréstimos de livros
- Controlar datas de devolução (14 dias por padrão)
- Registrar devoluções
- Calcular multas automaticamente (R$ 2,00/dia de atraso)

---

## 🏗️ Arquitetura

O projeto segue uma arquitetura em camadas bem estruturada:

- **Domínio**: Entidades e enumerações do sistema
- **Serviço**: Lógica de negócios e regras de negócio
- **Principal**: Ponto de entrada da aplicação

---

## 🛠️ Tecnologias e Conceitos Utilizados

- **Linguagem**: Java
- **Conceitos OOP**: Encapsulamento, Herança, Polimorfismo, Composição
- **Collections**: ArrayList com Generics
- **Data/Hora**: LocalDate, ChronoUnit
- **Padrões**: Service Layer, Domain Model

---

## 🚀 Como Usar

Clone o repositório e abra no IntelliJ IDEA:

```bash
git clone https://github.com/novaessoftware/SistemaBiblioteca.git
```

Execute a classe `Main` em `principal/Main.java` para ver o sistema em ação.

---

## 👨‍💻 Autor

**Matheus dos Santos**  
Estudante de Programação Java - DevDojo

---

## 📄 Licença

Este projeto é de código aberto e pode ser usado livremente para fins educacionais.

---

## 📞 Contato

Para dúvidas ou sugestões, entre em contato!

**GitHub**: [@novaessoftware](https://github.com/novaessoftware)

---

> "O melhor código é aquele que você entende." - Jiraya