package com.jtl.Set_;

import java.util.LinkedHashSet;
import java.util.Objects;

/**
 * @author jtl
 * java学习用
 */
public class LinkedHashSetExercise {
    public static void main(String[] args) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new Car("奥迪",10000));
        linkedHashSet.add(new Car("奥迪",10000));
        linkedHashSet.add(new Car("宝马",10000));
        linkedHashSet.add(new Car("法拉利",30000));
        System.out.println("linkedHashSet = " + linkedHashSet);
    }
}

class Car{
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.price, price) == 0 &&
                Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}