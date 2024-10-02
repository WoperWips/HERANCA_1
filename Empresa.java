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
