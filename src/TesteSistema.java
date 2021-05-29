public class TesteSistema {
    public static void main(String[] args) {

    Gerente g1 = new Gerente();
        g1.setSenha(222);

        Administrador a1 = new Administrador();
        a1.setSenha(222);

        Cliente cliente = new Cliente();
        cliente.setSenha(222);

        SistemaInterno s1 = new SistemaInterno();
        s1.autentica(g1);
        s1.autentica(a1);
        s1.autentica(cliente);
    }
}
