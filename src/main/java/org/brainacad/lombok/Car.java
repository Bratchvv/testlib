package org.brainacad.lombok;

import lombok.*;

import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@EqualsAndHashCode
public class Car {

    private String model;
    private String label;
    private Long vol;
    private Boolean isRacing;
    private Boolean isLowing;
}
