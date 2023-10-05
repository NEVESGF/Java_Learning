package Aula04.Exercício_aula04;

import java.util.Locale;

public class SystemLanguage {
    public static void main(String[] args) {
        Locale systemlanguage = Locale.getDefault();
        System.out.print("A linguagem do seu sistema é: ");
        System.out.println(systemlanguage.getLanguage() + systemlanguage.getCountry());
    
    }
}
