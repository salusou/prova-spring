package com.ucsbr.com.prova.service;

import com.ucsbr.com.prova.entity.User;
import com.ucsbr.com.prova.repository.UserRepository;
import com.ucsbr.com.prova.service.dto.UserDTO;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
  private final UserRepository userRepository;

  UserService(UserRepository userRepository){
    this.userRepository = userRepository;
  }

  public Optional<User> findByEmail(String email){
    return userRepository.findByEmailEquals(email);
  }

  public UserDTO save(UserDTO userDto){
    User user = toEntity(userDto);
    return toDto(userRepository.save(user));
  }

  public User toEntity(UserDTO userDTO){
    User u = new User();
    u.setLogin(userDTO.getLogin());
    u.setNome(userDTO.getNome());
    u.setPassword(userDTO.getPassword());
    u.setEmail(userDTO.getEmail());
    u.setId(userDTO.getId());

    return u;
  }

  public UserDTO toDto(User user){
    UserDTO u = new UserDTO();
    u.setLogin(user.getLogin());
    u.setNome(user.getNome());
    u.setPassword(user.getPassword());
    u.setEmail(user.getEmail());
    u.setId(user.getId());

    return u;
  }

}
