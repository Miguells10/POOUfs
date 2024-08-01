package Atv2.questao1;

import javax.swing.*;
public class Program {
    public static void main(String[] args) {

        Entidade palavra = new Entidade("Hello World");

        JOptionPane.showMessageDialog(null, "Vogais: " + palavra.RetornarVogais() + "\n"
                + "Consoantes: " + palavra.RetornarConsoantes() + "\n"
                + "Espaços: " + palavra.RetornarEspacos());



    }
}
