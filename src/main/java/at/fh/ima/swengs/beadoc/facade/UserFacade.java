package at.fh.ima.swengs.beadoc.facade;

import at.fh.ima.swengs.beadoc.dto.UserDTO;
import at.fh.ima.swengs.beadoc.model.User;
import at.fh.ima.swengs.beadoc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service()
@Transactional
public class UserFacade {

  @Autowired
  UserService userService;

  void mapDtoToEntity(UserDTO dto, User entity){

    entity.setName(dto.getName());
    entity.setLastName(dto.getLastName());
    entity.setUsername(dto.getUsername());
    entity.setPassword(dto.getPassword());
    entity.setEMail(dto.getEMail());
    entity.setDayOfBirth(dto.getDayOfBirth());
    //entity.setAppointments();

  }

}
