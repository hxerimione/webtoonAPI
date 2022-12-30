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

    public List<Webtoon> findWebtoonBySearchKeyword(String keyword){
        return repository.findBySearchKeywordLike(keyword);
    }
    public Page<Webtoon> findWebtoonByPlatformAndDayLike(int page, int size, String platform, String day){
        PageRequest pageRequest = PageRequest.of(page, size);
        return repository.findByPlatformAndDayLike(pageRequest,platform,day);
    }
    public Page<Webtoon> findWebtoonByPlatform(int page, int size, String platform){
        PageRequest pageRequest = PageRequest.of(page,size);
        return repository.findByPlatform(pageRequest,platform);
    }
    public Page<Webtoon> findWebtoonByDayLike(int page, int size, String day){
        PageRequest pageRequest = PageRequest.of(page,size);
        return repository.findByDayLike(pageRequest,day);
    }
    public Page<Webtoon> findWebtoons(int page,int size){
        PageRequest pageRequest = PageRequest.of(page, size);
        return repository.findAll(pageRequest);

    }
}
