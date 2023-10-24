package academy.devdojo.maratonajava;

public class Aula04Operadores {
    public static void main(String[] args) {

        int idade = 12;
        String categoria;


        if (idade < 15) {
            categoria = "Categoria Infantil";
        } else if (idade >= 15 && idade < 18) {
            categoria = ("Categoria juvenil");
        } else {
            categoria = ("Categoria Adulto");
        }

        System.out.println(categoria);
    }
}
