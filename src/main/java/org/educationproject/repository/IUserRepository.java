package org.educationproject.repository;

import org.educationproject.dto.users.User;

public interface IUserRepository {
    User save (User user);

    boolean deleteUser(User user);

    User findUserById (int id);


}
