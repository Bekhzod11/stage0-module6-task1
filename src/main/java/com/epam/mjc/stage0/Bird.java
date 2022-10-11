package com.epam.mjc.stage0;

public class Bird extends Animal {

    public Bird(){
        super("Blue",2, false);
    }

    @Override
    public String fetDescription() {
        return super.fetDescription() + " Moreover, it has 2 wings and can fly.";
    }
}
