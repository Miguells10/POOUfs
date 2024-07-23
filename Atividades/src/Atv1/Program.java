package Atv1;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Livro> lista = new ArrayList<>();

        Livro l1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", "HarperCollins", 1200, "Fantasia", 100.00);
        Livro l2 = new Livro("Harry Potter", "J.K. Rowling", "Rocco", 500, "Fantasia", 50.00);
        Livro l3 = new Livro("O Peque Príncipe", "Antoine de Saint-Exupéry", "Gallimard", 100, "Infantil", 20.00);
        Livro l4 = new Livro("Dom Quixote", "Miguel de Cervantes", "Penguin", 800, "Aventura", 80.00);
        Livro l5 = new Livro("A Bíblia", "Deus", "Vaticano", 2000, "Religioso", 100.00);

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
