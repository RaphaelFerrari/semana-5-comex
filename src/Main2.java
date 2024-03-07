public class Main2 {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.nome = "Harry Potter";
        livro.isbn = "12345-12345";

        System.out.println(livro.identificar());
        Clientes clientes = new Clientes();
        clientes.cpf = "123456789";
        clientes.nome = "Nome ";
        System.out.println(clientes.identificar());

    }
}
