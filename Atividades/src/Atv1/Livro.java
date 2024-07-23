package Atv1;

public class Livro {
    private String nomeLivro;
    private String autor;
    private String editora;
    private Integer numPag;
    private String estilo;
    private Double valor;
    private int Ano;

    public Livro() {
    }

    public Livro(String nomeLivro, String autor, String editora, Integer numPag, String estilo, Double valor) {
        this.nomeLivro = nomeLivro;
        this.autor = autor;
        this.editora = editora;
        this.numPag = numPag;
        this.estilo = estilo;
        this.valor = valor;
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
        return Ano;
    }

    public void setAno(int ano) {
        Ano = ano;
    }

    public void reajusteValor(){
        if (getAno() < 2020){
            valor += valor * 0.10;
        }
        else {
            valor += valor * 0.8;
        }

    }

    public int retornarAno(String nomeLivro){
        return getAno();

    }

    public void mostrarLivro(){
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
