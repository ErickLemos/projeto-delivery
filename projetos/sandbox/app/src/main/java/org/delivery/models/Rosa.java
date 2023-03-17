package org.delivery.models;

public class Rosa implements Flor {

    @Override
    public String getNome() {
        return "rosa";
    }

    @Override
    public Integer getNivel() {
        return 2;
    }

}
