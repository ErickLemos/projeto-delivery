package org.delivery.models;

public interface Flor {

    static Flor build(Integer nivel) {
        if (nivel == 1) {
            return new Margarida();
        }

        if (nivel == 2) {
            return new Rosa();
        }

        if (nivel == 3) {
            return new SuperFlorCheirosa();
        }

        throw new RuntimeException();
    }

    String getNome();

    Integer getNivel();

}
