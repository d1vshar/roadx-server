package io.l0llygag.roadxserver.database;

import io.l0llygag.roadxserver.models.reporting.BreakdownPost;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BreakdownRepository extends MongoRepository<BreakdownPost, Long> {

    @Override
    Optional<BreakdownPost> findById(Long aLong);

    @Override
    List<BreakdownPost> findAll();
}
