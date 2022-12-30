package com.api.webtoon.repository;

import com.api.webtoon.dto.Webtoon;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface webtoonRepo extends MongoRepository<Webtoon,Long> {
    Page<Webtoon> findByPlatformAndDayLike(Pageable pageable,String platform,String day);
    Page<Webtoon> findByPlatform(Pageable pageable,String platform);
    Page<Webtoon> findByDayLike(Pageable pageable, String day);
    Page<Webtoon> findAll(Pageable pageable);
    List<Webtoon> findBySearchKeywordLike(String keyword);

}
