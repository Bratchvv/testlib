package org.brainacad.lombok;

import lombok.*;

@Data
@AllArgsConstructor
// @RequiredArgsConstructor включен по умолчанию
public class Animal {
    private final String name;
    private boolean isWild;
}
