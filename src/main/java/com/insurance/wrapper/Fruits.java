package com.insurance.wrapper;

import javax.validation.constraints.Size;

public class Fruits {

    @Size
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String sayHello() {

        return "Hello";
    }

}
