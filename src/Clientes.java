public class Clientes implements Identificavel {
    String nome;
    String cpf;

    // resto das propriedades

    @Override
    public String identificar() {
        return "Nome: " + this.nome + ", cpf:" + this.cpf;

    }



}
