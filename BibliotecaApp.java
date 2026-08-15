public class BibliotecaApp {

    public static void main(String[] args) {

        Livro livro1 = new Livro("nome do livro", "nome do autor");
        Livro livro2 = new Livro("outro livro", "outro autor");
        Livro livro3 = new Livro();

        livro1.emprestar();
        livro2.emprestar();
        livro3.devolver();

        livro1.exibirFicha();
        livro2.exibirFicha();
        livro3.exibirFicha();

        System.out.println("o total de livros foi esse: " + Livro.getTotalLivros());
    }

}