package at.fh.ima.swengs.beadoc.service;

import at.fh.ima.swengs.beadoc.model.User;
import at.fh.ima.swengs.beadoc.model.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service()
public class UserService {

  @Autowired
  private UserRepository userRepository;

  public Optional<User> findById(long id) { return userRepository.findById(id); }

  public User getUser(Long dto){
    if(dto!=null) {
      User entity = userRepository.findById(dto).get();
      return entity;
    }
    return null;
  }

  public User save(User entity) { return userRepository.save(entity); }
}
