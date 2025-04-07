package org.javatips.builder;

public class Main {
    public static void main(String[] args) {
        User user1 = new User.UserBuilder("John", "Doe")
                .age(30)
                .phone("123-456-7890")
                .address("123 Main St")
                .build();

        User user2 = new User.UserBuilder("Jane", "Doe")
                .age(25)
                .build();

        System.out.println(user1);
        System.out.println(user2);
    }
}