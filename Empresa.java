import java.time.LocalDate;

public class Empresa {
    public static void main(String[] args) {
        // Criando objetos de Vendedor
        Vendedor vendedor1 = new Vendedor("Carlos Silva", "123.456.789-00", LocalDate.of(1985, 3, 12), LocalDate.of(2020, 5, 10), 2000.00, 5.0);

        // Criando objetos de Gerente
        Gerente gerente1 = new Gerente("Ana Costa", "987.654.321-00", LocalDate.of(1978, 8, 25), LocalDate.of(2015, 6, 1), 5000.00, "Vendas");

        // Criando objetos de Cliente
        Cliente cliente1 = new Cliente("Mariana Oliveira", "111.222.333-44", LocalDate.of(1992, 11, 18), "mariana@email.com", "123456789", "(11) 98765-4321");

        // Exibindo informações completas
        System.out.println("Vendedor: " + vendedor1.getNome());
        System.out.println("CPF: " + vendedor1.getCpf());
        System.out.println("Data de Nascimento: " + vendedor1.getDataNascimento());
        System.out.println("Data de Contratação: " + vendedor1.getDataContratacao());
        System.out.println("Salário Base: R$ " + vendedor1.getSalarioBase());
        System.out.println("Percentual de Comissão: " + vendedor1.getPercentualComissao() + "%");
        System.out.println();

        System.out.println("Gerente: " + gerente1.getNome());
        System.out.println("CPF: " + gerente1.getCpf());
        System.out.println("Data de Nascimento: " + gerente1.getDataNascimento());
        System.out.println("Data de Contratação: " + gerente1.getDataContratacao());
        System.out.println("Salário Base: R$ " + gerente1.getSalarioBase());
        System.out.println("Departamento: " + gerente1.getDepartamento());
        System.out.println();

        System.out.println("Cliente: " + cliente1.getNome());
        System.out.println("CPF: " + cliente1.getCpf());
        System.out.println("Data de Nascimento: " + cliente1.getDataNascimento());
        System.out.println("Email: " + cliente1.getEmail());
        System.out.println("Número do Cartão de Fidelidade: " + cliente1.getNumeroCartaoFidelidade());
        System.out.println("Telefone: " + cliente1.getTelefone());
    }
}
