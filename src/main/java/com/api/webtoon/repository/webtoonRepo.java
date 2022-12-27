package com.api.webtoon.repository;

import com.api.webtoon.dto.Webtoon;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional(readOnly = true)
public interface webtoonRepo extends MongoRepository<Webtoon,Long> {
    List<Webtoon> findByTitle(String title);
    //Page<Webtoon> findAll(Pageable pageable);

}
