package io.l0llygag.roadxserver.database;

import io.l0llygag.roadxserver.models.reporting.AccidentPost;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AccidentRepository extends MongoRepository<AccidentPost, Long> {

    @Override
    Optional<AccidentPost> findById(Long aLong);

    @Override
    List<AccidentPost> findAll();
}
