package net.purocodigo.backendcursojava.services;

import org.springframework.security.core.userdetails.UserDetailsService;

import net.purocodigo.backendcursojava.dto.UserDto;

public interface UserServiceInterface extends UserDetailsService {
    
    public UserDto createUser(UserDto user);
    public UserDto getUser(String email);
}
