package Atv1;

public class Program {
    public static void main(String[] args) {

        Livro[] livros = new Livro[5]; //Criação de um array de livros

        livros[0] = new Livro("Uncle Fish", "Paranoid", "Atibaia", 100, "Ação", 100.0, 2021);
        livros[1] = new Livro("Livro 2", "Autor 2", "Editora 2", 200, "Estilo 2", 20.0, 2020);
        livros[2] = new Livro("Livro 3", "Autor 3", "Editora 3", 300, "Estilo 3", 30.0, 2019);
        livros[3] = new Livro("Livro 4", "Autor 4", "Editora 4", 400, "Estilo 4", 40.0, 2018);
        livros[4] = new Livro("Livro 5", "Autor 5", "Editora 5", 500, "Estilo 5", 50.0, 2017);

        for (Livro livro : livros) {
            livro.mostrarLivro(); //Irá exibir os dados dos livros percorrendo o array
            if (livro.getAno() < 2020) {
                livro.reajusteValor(10.0); //Se o ano do livro for menor que 2020, irá reajustar o valor em 10%
            } else {
                livro.reajusteValor(8.0); //Se o ano do livro for maior ou igual a 2020, irá reajustar o valor em 8%
            }

        }

        System.out.println("\nApós reajuste de valor:\n");

        for (Livro livro : livros) {
            livro.mostrarLivro(); //Irá exibir os dados dos livros percorrendo o array
        }


    }
}
