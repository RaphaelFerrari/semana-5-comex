//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Produto produto = new Produto();
    produto.nome = "Radio";

    Livro livro = new Livro();
    livro.isbn = "12345-12345";
    livro.precoUnico = 29.90;
    livro.nome = "Senhor dos Aneis";

    Eletronico eletronico = new Eletronico();
    eletronico.nome = "Celular";

    System.out.println(livro.nome);
    System.out.println(eletronico.nome);
    System.out.println(produto.nome);

    }
}