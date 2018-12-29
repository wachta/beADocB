package at.fh.ima.swengs.beadoc.service;

import at.fh.ima.swengs.beadoc.model.Appointment;
import at.fh.ima.swengs.beadoc.model.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service()
public class AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;

    public Optional<Appointment> findById(long id) { return appointmentRepository.findById(id); }

    public Appointment save(Appointment entity) {return appointmentRepository.save(entity); }


}
