package com.example;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Animal gato = new Animal("Gato");
        System.out.println("El nombre del animal es: " + gato.getName());

        String name = JOptionPane.showInputDialog(null, "Please enter");
        JOptionPane.showMessageDialog(null, "Your name is " + name);

    }
}