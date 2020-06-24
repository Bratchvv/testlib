package org.brainacad.lombok;

import java.awt.*;

public class Test {
    public static void main(String[] args) {

        Car c = new Car();

        GameConsole gc = GameConsole.builder()
                .model("PS5")
                .label("Sony")
                .cpu("core I HZ")
                .ram(16)
                .color(Color.BLACK)
                .build();
        gc.getRam();
    }
}
