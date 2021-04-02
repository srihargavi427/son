package com.org.pets.repository;

import com.org.pets.model.DogList;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DogRepo extends MongoRepository<DogList,Integer> {
}
