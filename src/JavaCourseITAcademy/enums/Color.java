package JavaCourseITAcademy.enums;

public enum Color {
    RED("красный"),
    GREEN("зеленый"),
    GREY("серый"),
    WHITE("белый"),
    BLACK("черный");

    private String value;

    private Color(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
