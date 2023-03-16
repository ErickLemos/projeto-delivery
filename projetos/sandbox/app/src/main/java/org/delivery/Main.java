package org.delivery;

import org.delivery.models.Flor;

public class Main {

    // Programa deve receber um nivel de fraquancia e então retornar/imprimir a flor que está naquele nível
    public static void main(String[] args) {
        var flor = Flor.build(3);
        System.out.println("nome do flor: " + flor.getNome() + " nivel de franquancia: " + flor.getNivel());
    }

}