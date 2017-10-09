package com.easter.anonymous;

/**
 * Created by easter on 17-10-9.
 */
public abstract class Person {
    private String name;

    public Person(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 抽象方法
    public abstract void read();
}
