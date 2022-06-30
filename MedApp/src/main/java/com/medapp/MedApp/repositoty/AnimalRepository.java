package com.medapp.MedApp.repositoty;

import com.medapp.MedApp.model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Integer> {
 Animal findAnimalByUserId(Integer userId);
 Animal findAnimalByIds(Integer userId);

}
