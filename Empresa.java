// Classe Cliente
class Cliente {
    protected String nome;
    protected String endereco;
    protected String email;

    public Cliente(String nome, String endereco, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Email: " + email);
    }
}

// Classe PessoaFisica que herda de Cliente
class PessoaFisica extends Cliente {
    private String cpf;

    public PessoaFisica(String nome, String endereco, String email, String cpf) {
        super(nome, endereco, email);
        this.cpf = cpf;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("CPF: " + cpf);
    }
}

// Classe PessoaJuridica que herda de Cliente
class PessoaJuridica extends Cliente {
    private String cnpj;

    public PessoaJuridica(String nome, String endereco, String email, String cnpj) {
        super(nome, endereco, email);
        this.cnpj = cnpj;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("CNPJ: " + cnpj);
    }
}

// Classe Funcionario
class Funcionario {
    private String nome;
    private String cpf;
    private String endereco;
    private double salario;

    public Funcionario(String nome, String cpf, String endereco, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.salario = salario;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Endereço: " + endereco);
        System.out.println("Salário: R$ " + salario);
    }
}

// Classe principal para testar as classes
public class Empresa {
    public static void main(String[] args) {
        // Criando objetos de PessoaFisica
        PessoaFisica cliente1 = new PessoaFisica("João Silva", "Rua A, 123", "joao@email.com", "123.456.789-00");
        PessoaFisica cliente2 = new PessoaFisica("Maria Oliveira", "Rua B, 456", "maria@email.com", "987.654.321-00");

        // Exibindo informações dos clientes Pessoa Física
        System.out.println("Informações dos Clientes Pessoa Física:");
        cliente1.exibirInformacoes();
        System.out.println();
        cliente2.exibirInformacoes();
        System.out.println();

        // Criando objetos de PessoaJuridica
        PessoaJuridica cliente3 = new PessoaJuridica("Empresa XYZ", "Av. Principal, 789", "contato@xyz.com", "12.345.678/0001-99");

        // Exibindo informações dos clientes Pessoa Jurídica
        System.out.println("Informações dos Clientes Pessoa Jurídica:");
        cliente3.exibirInformacoes();
        System.out.println();

        // Criando objetos de Funcionario
        Funcionario funcionario1 = new Funcionario("Carlos Almeida", "321.654.987-00", "Rua C, 789", 3500.00);
        Funcionario funcionario2 = new Funcionario("Ana Costa", "654.321.987-00", "Rua D, 101", 4500.00);

        // Exibindo informações dos funcionários
        System.out.println("Informações dos Funcionários:");
        funcionario1.exibirInformacoes();
        System.out.println();
        funcionario2.exibirInformacoes();
    }
}
