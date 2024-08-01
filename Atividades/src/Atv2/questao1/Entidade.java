package Atv2.questao1;

public class Entidade {
    private String palavra;

    public Entidade(String palavra) {
        this.palavra = palavra;
    }

    public int RetornarVogais(){
        int vogaisContagem = 0;
        String vogais = "aeiou";
        for (int i = 0; i < palavra.length(); i++) {
            char letra = Character.toLowerCase(palavra.charAt(i));
            if (vogais.indexOf(letra) != -1) { // Se a letra for uma vogal
                vogaisContagem++;
            }
        }
        return vogaisContagem;
    }

    public int RetornarConsoantes(){
        int consoantesContagem = 0;
        String consontantes = "bcdfghjklmnpqrstvwxyz";
        for (int i = 0; i < palavra.length(); i++) {
            char letra = Character.toLowerCase(palavra.charAt(i));
            if (Character.isLetter(letra) && consontantes.indexOf(letra) != -1){
                consoantesContagem++;
            }
        }
        return consoantesContagem;
    }

    public int RetornarEspacos(){
        int espacos = 0;
        for (int i = 0; i < palavra.length(); i++) {
            if (Character.isWhitespace(palavra.charAt(i))) {
                espacos++;
            }
        }
        return espacos;
    }


}
