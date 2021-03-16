package booking.hotel.projet.projet.service;

import booking.hotel.projet.projet.model.User;

public interface UserService {
    public User registreUser(SignUpRequest userSignUpRequest);
    public User findByUserName(String userName);
    
    
}
