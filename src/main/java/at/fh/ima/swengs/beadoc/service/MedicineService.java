package at.fh.ima.swengs.beadoc.service;

import at.fh.ima.swengs.beadoc.model.Medicine;
import at.fh.ima.swengs.beadoc.model.MedicineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service()
public class MedicineService {

    @Autowired
    private MedicineRepository medicineRepository;

    public Optional<Medicine> findById(Long id) { return medicineRepository.findById(id); }

    public Medicine save(Medicine entity) { return medicineRepository.save(entity); }
}
