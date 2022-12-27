package com.api.webtoon.service;

import com.api.webtoon.dto.Webtoon;
import com.api.webtoon.repository.webtoonRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class webtoonService {
    private final webtoonRepo repository;

    @Transactional
    public List<Webtoon> findWebtoons(String title){
        System.out.println("hello");
        //PageRequest pageRequest = PageRequest.of(page, perPage);
        //Page<Webtoon> re = webtoonRepository.findAll(pageRequest);
        return repository.findByTitle("참교육");

    }
}
