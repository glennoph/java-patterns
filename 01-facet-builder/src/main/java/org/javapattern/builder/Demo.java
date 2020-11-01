package org.javapattern.builder;

public class Demo {

    public static void main(String[] args) {

        House house = new HouseBuilder()
                .address()
                    .street("123 Main St")
                    .city("Anytown")
                    .state("ST")
                .type()
                    .type("single story")
                    .size(1500)
                .build();

        System.out.println(house);

    }
}
