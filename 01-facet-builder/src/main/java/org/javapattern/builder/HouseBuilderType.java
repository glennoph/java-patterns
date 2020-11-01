package org.javapattern.builder;

public class HouseBuilderType extends HouseBuilder {

    public HouseBuilderType(House house) {
        this.house = house;
    }

    public HouseBuilderType type(String type) {
        house.type = type;
        return this;
    }

    public HouseBuilder size(int size) {
        house.size = size;
        return this;
    }
}
