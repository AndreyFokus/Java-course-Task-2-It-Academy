package JavaCourseITAcademy.enums;

import java.util.ArrayList;
import java.util.List;

public enum Option {
    CONDITIONER("кондиционер"),
    CRUISECONTROL("круиз-контроль"),
    PARKING("паркинг");

    private String value;

    private Option(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
