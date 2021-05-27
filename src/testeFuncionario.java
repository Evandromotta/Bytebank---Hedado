public class testeFuncionario {
    public static void main(String[] args) {
        Gerente evan = new Gerente();
        evan.setNome("Evan Motta");
        evan.setCpf("838.766.349-91");
        evan.setSalario(2732.22);

        System.out.println("Nome: " + evan.getNome());
        System.out.println("CPF: " + evan.getCpf());
        System.out.println("Salário atual é de: R$" + evan.getSalario());
        System.out.println("Novo salário é de: R$"
                + (evan.getSalario() + evan.getBonificacao()));
    }
}
