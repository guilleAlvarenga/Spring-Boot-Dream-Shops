package com.guilleSoftware.dreamshops.service.user;
import com.guilleSoftware.dreamshops.dto.UserDto;
import com.guilleSoftware.dreamshops.model.User;
import com.guilleSoftware.dreamshops.request.CreateUserRequest;
import com.guilleSoftware.dreamshops.request.UpdateUserRequest;


public interface IUserService {

    User getUserById(Long userId);
    User createUser(CreateUserRequest request);
    User updateUser(UpdateUserRequest request, Long userId);
    void deleteUser(Long userId);

    UserDto convertUserToDto(User user);

    User getAuthenticatedUser();
}
