package com.sosow0212.JavaStudy.staticFactoryMethod;

public class User {

    private final String username;
    private final String password;

    private User(final String username, final String password) {
        this.username = username;
        this.password = password;
    }

    public static User createUser(String username, String password) {
        if (username.isBlank() || username.isEmpty()) {
            throw new IllegalArgumentException("Username Error : 공백 혹은 빈 값이 올 수 없습니다.");
        }

        if (password.isBlank() || password.isEmpty()) {
            throw new IllegalArgumentException("Password Error : 공백 혹은 빈 값이 올 수 없습니다.");
        }

        return new User(username, password);
    }
}
