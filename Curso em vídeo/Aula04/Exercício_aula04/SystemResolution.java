package Aula04.Exercício_aula04;

import java.awt.Toolkit;
import java.awt.Dimension;

public class SystemResolution {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();

        int largura = (int) screenSize.getWidth();
        int altura = (int) screenSize.getHeight();

        System.out.println("A resolução da sua tela é: " + largura + " x " + altura);
    }
}
