package org.educationproject.service;

import org.educationproject.dto.users.User;

public interface IUserService {
    User register(String login, String password, String postMail);
    boolean login(String login, String password);


}
