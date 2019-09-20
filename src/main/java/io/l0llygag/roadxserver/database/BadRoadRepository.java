package io.l0llygag.roadxserver.database;

import io.l0llygag.roadxserver.models.reporting.BadRoadPost;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BadRoadRepository extends MongoRepository<BadRoadPost, Long> {

    @Override
    Optional<BadRoadPost> findById(Long aLong);

    @Override
    List<BadRoadPost> findAll();
}
