package org.brainacad.lombok;

import lombok.Builder;
import lombok.Getter;

import java.awt.*;

@Builder
@Getter
public class GameConsole {
    private String label;
    private String model;
    private int ram;
    private String cpu;
    private String rev;
    private Color color;
    private String serial;
}
