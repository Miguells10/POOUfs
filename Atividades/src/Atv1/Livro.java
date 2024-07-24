package Atv1;

public class Livro {
    private String nomeLivro;
    private String autor;
    private String editora;
    private Integer numPag;
    private String estilo;
    private Double valor;
    private int ano;

    public Livro() {
    }

    public Livro(String nomeLivro, String autor, String editora, Integer numPag, String estilo, Double valor, int ano) {
        this.nomeLivro = nomeLivro;
        this.autor = autor;
        this.editora = editora;
        this.numPag = numPag;
        this.estilo = estilo;
        this.valor = valor;
        this.ano = ano;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public Integer getNumPag() {
        return numPag;
    }

    public void setNumPag(Integer numPag) {
        this.numPag = numPag;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void reajusteValor(Double percentual) {
        valor += getValor() * percentual / 100;
    }

    public void mostrarLivro() {
        System.out.println("Nome: " + getNomeLivro());
        System.out.println("Autor: " + getAutor());
        System.out.println("Editora: " + getEditora());
        System.out.println("Número de páginas: " + getNumPag());
        System.out.println("Estilo: " + getEstilo());
        System.out.println("Valor: " + getValor());
        System.out.println("Ano: " + getAno());
        System.out.println();
    }
}
