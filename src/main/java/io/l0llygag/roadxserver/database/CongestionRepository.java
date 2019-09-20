package io.l0llygag.roadxserver.database;

import io.l0llygag.roadxserver.models.reporting.CongestionPost;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CongestionRepository extends MongoRepository<CongestionPost, Long> {

    @Override
    Optional<CongestionPost> findById(Long aLong);

    @Override
    List<CongestionPost> findAll();
}
