package com.api.webtoon.dto;

import lombok.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;


@Getter
@Document(collection = "myCol")
public class Webtoon {
    @Id
    private Long _id;
    private String author;
    private String[] day;
    private String img;
    private String platform;
    private String searchKeyword;
    private String title;
    private String url;

    @Builder
    public Webtoon(Long _id, String author, String[] day, String img, String platform, String searchKeyword, String title, String url) {
        this._id = _id;
        this.author = author;
        this.day = day;
        this.img = img;
        this.platform = platform;
        this.searchKeyword = searchKeyword;
        this.title = title;
        this.url = url;
    }
}
