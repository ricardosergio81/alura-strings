package br.com.ricardorosa.main;

public class TesteString {

    public static void main(String[] args) {

        String testeString = "Teste String         ";

        System.out.println("testeString: " + testeString);

        System.out.println("upperString: " + testeString.toUpperCase());
        System.out.println("lowerString: " + testeString.toLowerCase());
        System.out.println("replaceString: " + testeString.replace("String", "Replace"));

        char charEN = 'T';
        char charSA = 'S';
        System.out.println("charString: " + testeString.replace(charEN, charSA));

        System.out.println("charAt(2): " + testeString.charAt(2));
        System.out.println("charAt(0): " + testeString.charAt(0));

        System.out.println("indexOf: " + testeString.indexOf("St"));
        System.out.println("substring: " + testeString.substring(3));
        System.out.println("substring: " + testeString.substring(3, 7));
        System.out.println("trim: " + testeString.trim());

        System.out.println("length: " + testeString.length());

        for (int i = 0; i < testeString.length(); i++) {
            if (testeString.charAt(i) != ' ') {
                System.out.println("charAt(" + i + "): " + testeString.charAt(i));
            }
        }

        CharSequence charSequence = "Essa string é uma sequencia de caracteres";

        String texto = "Socorram";
        texto = texto.concat("-");
        texto = texto.concat("me");
        texto = texto.concat(", ");
        texto = texto.concat("subi ");
        texto = texto.concat("no ");
        texto = texto.concat("ônibus ");
        texto = texto.concat("em ");
        texto = texto.concat("Marrocos");
        System.out.println("Texto com concat: " + texto);


        StringBuilder builder = new StringBuilder("Socorram");
        builder.append("-");
        builder.append("me");
        builder.append(", ");
        builder.append("subi ");
        builder.append("no ");
        builder.append("ônibus ");
        builder.append("em ");
        builder.append("Marrocos");
        String textobuilder = builder.toString();
        System.out.println("Texto com StringBuilder" + textobuilder);

        String emptyString = "";
        System.out.println("isEmpty: " + emptyString.isEmpty());

    }
}

