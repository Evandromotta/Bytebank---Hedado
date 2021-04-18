//Gerente é um funcionário.
public class Editordevideo extends Funcionario {



    public double getBonificacao() {
        return (super.getBonificacao() + 100);
    }
}
