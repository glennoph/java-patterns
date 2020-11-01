package org.javapattern.builder;

public class House {
    // address
    String streetAddress;
    String city;
    String state;

    // type
    String type;
    int size;

    @Override
    public String toString() {
        return "House{" +
                "streetAddress='" + streetAddress + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", type='" + type + '\'' +
                ", size=" + size +
                '}';
    }
}

