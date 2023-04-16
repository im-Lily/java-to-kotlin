package lec02;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Person {
    private final String name;

    public Person(String name) {
        this.name = name;
    }

    // null 가능 여부 체크
//    @Nullable
    @NotNull
    public String getName() {
        return name;
    }
}
