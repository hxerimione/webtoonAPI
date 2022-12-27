package com.api.webtoon.controller;

import com.api.webtoon.dto.Webtoon;
import com.api.webtoon.service.webtoonService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;


@RestController
@RequiredArgsConstructor
public class webtoonController {
    private final webtoonService service;
    @GetMapping("/")
    public List<Webtoon> find(){
        return service.findWebtoons("참교육");

    }


}
