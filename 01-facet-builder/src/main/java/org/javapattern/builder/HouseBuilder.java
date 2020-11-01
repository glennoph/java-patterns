package org.javapattern.builder;

import org.javapattern.builder.House;

public class HouseBuilder {
    protected House house = new House();

    public House build() {
        return house;
    }

    public HouseBuilderAddress address() {
        return new HouseBuilderAddress(house);
    }

    public HouseBuilderType type() {
        return new HouseBuilderType(house);
    }

}
