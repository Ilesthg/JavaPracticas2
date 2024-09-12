package Inherit.Test;


import Inherit.Models.Animal.Cat;

public class TestHerenciaAnimal {

    public static void main(String[] args) {
        Cat cat = new Cat("LILY", 8, 'm', "PURINA");
        cat.eat();
        System.out.println(cat);

    }
}
