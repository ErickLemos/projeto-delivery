package com.projetodelivery.carteira.rest.utils;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class DataContainer<T> {

    @JsonProperty("data")
    private List<T> data;

    public static <T> DataContainer<T> of(List<T> objs) {
        return new DataContainer<>(objs);
    }

    public static <T> DataContainer<T> of(T obj) {
        return new DataContainer<>(List.of(obj));
    }

    public DataContainer(List<T> objs) {
        this.data = objs;
    }

}
