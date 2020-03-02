package org.example;

public class Beer {

    private String name;

    public Beer(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Beer{" +
                "name='" + name + '\'' +
                '}';
    }
}
