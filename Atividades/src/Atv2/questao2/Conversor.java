package Atv2.questao2;

public class Conversor {
    private int numero;

    public Conversor(int numero) {
        this.numero = numero;
    }

    public String PorExtenso() throws NumeroNaoSuportado {
        if (numero < 0 || numero > 100) {
            throw new NumeroNaoSuportado("Número não suportado");
        }
        String[] unidades = {"zero", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove"};
        String[] dezenas = {"dez", "onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove"};
        String[] dezenas2 = {"", "", "vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta", "noventa"};
        String[] centenas = {"cem"};

        String extenso = "";
        if (numero < 10) {
            extenso = unidades[numero];
        } else if (numero < 20) {
            extenso = dezenas[numero - 10];
        } else if (numero < 100) {
            int dezena = numero / 10;
            int unidade = numero % 10;
            extenso = dezenas2[dezena];
            if (unidade != 0) {
                extenso += " e " + unidades[unidade];
            }
        } else if (numero == 100) {
            extenso = centenas[0];
        }
        return extenso;
    }
}
