package org.javapattern.builder;

public class HouseBuilderAddress extends HouseBuilder {
    public HouseBuilderAddress(House house) {
        this.house = house;
    }

    public HouseBuilderAddress street(String addr) {
        house.streetAddress = addr;
        return this;
    }

    public HouseBuilderAddress city(String city) {
        house.city = city;
        return this;
    }

    public HouseBuilderAddress state(String state) {
        house.state = state;
        return this;
    }

}
