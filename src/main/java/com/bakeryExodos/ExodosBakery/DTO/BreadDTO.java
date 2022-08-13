package com.bakeryExodos.ExodosBakery.DTO;

public abstract class BreadDTO {

    abstract Integer precio();

}

class RyeBread extends BreadDTO {

    @Override
    Integer precio() {
        return 5000;
    }
}

class WholemealBread extends BreadDTO {

    @Override
    Integer precio() {
        return 2500;
    }
}

class NutBread extends BreadDTO {

    @Override
    Integer precio() {
        return 10000;
    }
}
