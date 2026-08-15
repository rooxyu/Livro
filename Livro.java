public class Livro {

    private String titulo;
    private String autor;
    private boolean disponivel;


    public Livro() {
        titulo = "sem titulo ";
        autor = "desconhecido ";
        disponivel = true;
        totalLivros++;
    }

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
        Livro.totalLivros++;

    }

    private static int totalLivros = 0;

    public static int getTotalLivros() {
        return totalLivros;

    }

    public void emprestar() {
        if (this.disponivel) {
            this.disponivel = false;
            System.out.println("livro emprestado com sucesso! ");
        } else {
            System.out.println("o livro está indisponivel! ");
        }

    }

    public void devolver() {
        if (!this.disponivel) {
            disponivel = true;
            System.out.println("Livro devolvido com sucesso!");
        }
    }

    public void exibirFicha() {
        System.out.println("titulo: " + this.titulo + "autor: " + this.autor + "disponivel: " + (this.disponivel ? "sim" : "não"));


    }
}

