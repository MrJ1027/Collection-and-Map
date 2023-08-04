package com.jtl.Homework;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author jtl
 * java学习用
 */
public class Homework06 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        Person p1 = new Person(101,"AA");
        Person p2 = new Person(102,"BB");
        hashSet.add(p1);
        hashSet.add(p2);
        p1.str = "CC";
        hashSet.remove(p1);
        System.out.println(hashSet);//2
        hashSet.add(new Person(101,"CC"));
        System.out.println(hashSet);//3
        hashSet.add(new Person(101,"AA"));
        System.out.println(hashSet);//4
        String str = "";
    }
}

class Person{
     int n1;
     String str;

    public Person(int n1, String str) {
        this.n1 = n1;
        this.str = str;
    }

    @Override
    public String toString() {
        return "Person{" +
                "n1=" + n1 +
                ", str='" + str + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return n1 == person.n1 &&
                Objects.equals(str, person.str);
    }

    @Override
    public int hashCode() {
        return Objects.hash(n1, str);
    }
}
