package org.delivery;

public class Main {

    // Programa deve receber um nivel de fraquancia e então retornar/imprimir a flor que está naquele nível
    public static void main(String[] args) {

        Integer nivelDeFraquancia = 1;

        // margarida
        String margaridaNome = "margarida";
        Integer margaridaNivel = 1;

        // rosa
        String rosaNome = "rosa";
        Integer rosaNivel = 2;

        // flor super cheirosa
        String florSuperCheirosaNome = "flor super cheirosa";
        Integer florSuperCheirosaNivel = 3;

        // resultado
        String resultadoNome = "";
        Integer resultadoNivel = 0;

        // resultado - logic
        if (nivelDeFraquancia == 1) {
            resultadoNome = margaridaNome;
            resultadoNivel = margaridaNivel;
        }

        if (nivelDeFraquancia == 2) {
            resultadoNome = rosaNome;
            resultadoNivel = rosaNivel;
        }

        if (nivelDeFraquancia == 3) {
            resultadoNome = florSuperCheirosaNome;
            resultadoNivel = florSuperCheirosaNivel;
        }

        System.out.println("nome do flor: " + resultadoNome + " nivel de franquancia: " + resultadoNivel);
    }

}