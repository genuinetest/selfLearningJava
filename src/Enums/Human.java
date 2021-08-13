package Enums;

public class Human {

    private String name;
    private String age;
    EyeColor eyeColor;
    HairColor hairColor;


    public Human(String name, String age, EyeColor eyeColor, HairColor hairColor) {
        this.name = name;
        this.age = age;
        this.eyeColor = eyeColor;
        this.hairColor = hairColor;
    }

    public static void main(String[] args) {
        Human human = new Human("Wojtek", "23", EyeColor.VIOLET, HairColor.BALD);
        System.out.println(human.hairColor);
    }
}
