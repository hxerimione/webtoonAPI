package com.api.webtoon.service;

import com.api.webtoon.dto.Webtoon;
import com.api.webtoon.repository.webtoonRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class webtoonService {
    private final webtoonRepo repository;

    @Transactional
    public Page<Webtoon> findWebtoonBySearchKeyword(int page, int size, String keyword){
        PageRequest pageRequest = PageRequest.of(page,size);
        return repository.findBySearchKeywordLike(pageRequest,keyword);
    }
    @Transactional
    public Page<Webtoon> findWebtoonByPlatformAndDayLike(int page, int size, String platform, String day){
        System.out.println("findwebtoonsbyplatformandday");
        PageRequest pageRequest = PageRequest.of(page, size);
        return repository.findByPlatformAndDayLike(pageRequest,platform,day);
    }
    @Transactional
    public Page<Webtoon> findWebtoonByPlatform(int page, int size, String platform){
        System.out.println("platform");
        PageRequest pageRequest = PageRequest.of(page,size);
        return repository.findByPlatform(pageRequest,platform);
    }
    @Transactional
    public Page<Webtoon> findWebtoonByDayLike(int page, int size, String day){
        System.out.println("day");
        PageRequest pageRequest = PageRequest.of(page,size);
        return repository.findByDayLike(pageRequest,day);
    }
    @Transactional
    public Page<Webtoon> findWebtoons(int page,int size){
        System.out.println("hello");
        PageRequest pageRequest = PageRequest.of(page, size);
        return repository.findAll(pageRequest);
        //return repository.findByTitle("참교육");

    }
}
