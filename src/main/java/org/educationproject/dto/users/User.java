package org.educationproject.dto.users;

import lombok.Data;

@Data
public abstract class User {
    int id;
    int age;
    String name;
    String lastName;
    String password;
    String login;
}
