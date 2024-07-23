package Atv1;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Livro> lista = new ArrayList<>();

        Livro l1 = new Livro("Livro 1", "Autor 1", "Editora 1", 100, "Estilo 1", 50.0, 2021);
        Livro l2 = new Livro("Livro 2", "Autor 2", "Editora 2", 200, "Estilo 2", 100.0, 2020);
        Livro l3 = new Livro("Livro 3", "Autor 3", "Editora 3", 300, "Estilo 3", 150.0, 2019);
        Livro l4 = new Livro("Livro 4", "Autor 4", "Editora 4", 400, "Estilo 4", 200.0, 2018);
        Livro l5 = new Livro("Livro 5", "Autor 5", "Editora 5", 500, "Estilo 5", 250.0, 2017);

        lista.add(l1);
        lista.add(l2);
        lista.add(l3);
        lista.add(l4);
        lista.add(l5);


        System.out.println("Lista de livros:");
        for(Livro livro : lista){
            livro.mostrarLivro();
            livro.reajusteValor();
        }

        System.out.println("Lista de livros após o reajuste:");
        for(Livro livro : lista){
            livro.mostrarLivro();
        }


    }
}
