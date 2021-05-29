public class SistemaInterno {

    private int senha = 222;

    public void autentica(Autenticavel g1) {
        boolean autenticou = g1.autentica(this.senha);
        if (autenticou) {
            System.out.println("Acesso liberado");
        } else {
            System.out.println("Não liberado");
        }
    }

}
