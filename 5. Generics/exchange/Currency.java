/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Generics.exchange;

public class Currency {
    private Float value;
    private String name;

    public Currency(String name, Float value){
        this.name = name;
        this.value = value;
    }

    public Float getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "value=" + value +
                ", name='" + name + '\'' +
                '}';
    }
}