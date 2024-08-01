package Atv2.questao2;

import javax.swing.*;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {
        {
            try{
                Conversor conversor = new Conversor(Integer.parseInt(JOptionPane.showInputDialog("Digite um número: ")));
                String num = (conversor.PorExtenso());
                JOptionPane.showMessageDialog(null, STR."Número convertido: \{num}");

            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }

    }
}