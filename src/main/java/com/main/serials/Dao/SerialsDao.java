package com.main.serials.Dao;

import com.main.serials.Models.Serial;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SerialsDao extends MongoRepository<Serial,String> {

    @Query("{ 'name' : ?0 }")
    List<Serial> findByName(String name);
}
