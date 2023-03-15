package org.delivery;

public class Main {

    // Programa deve receber um nivel de fraquancia e então retornar/imprimir a flor que está naquele nível
    public static void main(String[] args) {

        var nivelDeFraquancia = 1;

        var margaridaNome = "margarida";
        var margaridaNivel = 1;

        var rosaNome = "rosa";
        var rosaNivel = 2;

        var florSuperCheirosaNome = "flor super cheirosa";
        var florSuperCheirosaNivel = 3;

        var resultadoNome = "";
        var resultadoNivel = 0;

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