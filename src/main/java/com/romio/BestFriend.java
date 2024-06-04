package com.romio;

public class BestFriend {
    
    String name;
    int age;
    String college;
    String course;
    String address;

    // Constructor of this class
    BestFriend(String name, int age, String college,
               String course, String address) {
        // This variable refers to current instance itself
        this.name = name;
        this.age = age;
        this.college = college;
        this.course = course;
        this.address = address;
    }

    @Override
    public String toString() {
        return "BestFriend{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", college='" + college + '\'' +
                ", course='" + course + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    // Method of this class
    // Main driver method
    public static void main(String[] args) {
        BestFriend b = new BestFriend(
                "Gulpreet Kaur", 21, "BIT MESRA", "M.TECH",
                "Kiriburu");
        Object obj = b; // upcasting
        System.out.println("object class obj=" + obj);
        System.out.println("object class obj=" + obj.getClass());

        System.out.println(b);

        System.out.println(b.toString());
    }
}


