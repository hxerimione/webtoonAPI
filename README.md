# webtoonAPI
📍네이버 카카오 웹툰 정보 제공하는 API📖

https://hxerimione.notion.site/API-038723a0126c4abf87701beb440cc207
![header](https://capsule-render.vercel.app/api?type=rect&color=gradient&height=100&section=header&text=Korea%20Webtoon%20API&fontSize=40&fontAlign=50&fontAlignY=50)

![NODE](https://img.shields.io/badge/Node.js-339933?style=flat-square&logo=Node.js&logoColor=white)&nbsp;&nbsp;&nbsp;![NestJS](https://img.shields.io/badge/NestJS-E0234E?style=flat-square&logo=NestJS&logoColor=white) ![MongoDB](https://img.shields.io/badge/MongoDB-47A248?style=flat-square&logo=MongoDB&logoColor=white) ![TYPESCRIPT](https://img.shields.io/badge/Typescript-3178c6?style=flat-square&logo=typescript&logoColor=white) ![HEROKU](https://img.shields.io/badge/Heroku-430098?style=flat-square&logo=Heroku&logoColor=white)

# **📌 About**
웹툰 정보를 제공합니다.
정보가 제공되는 웹툰 플랫폼은 다음과 같습니다.
- 네이버웹툰

# **🙏 Request**

## **웹툰 정보 요청**

조건을 만족하는 웹툰 정보들을 제공합니다.

| Method |                                     Request URL                                      | Format |
| :----: | :----------------------------------------------------------------------------------: | :----: |
|  GET   | [`https://webtoon-api.herokuapp.com/`](https://webtoon-api.herokuapp.com/) |  JSON  |

### **Request Parameter**

|     Name      | Required |  Type  | Default | Description                                                                                                                                                                                                   |
| :-----------: | :------: | :----: | :-----: | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
|   **page**    |    N     | number |    0    | 페이지 번호                                                                                                                                                                                                   |
|  **size**  |    N     | number |   10    | 한 페이지 결과 수                                                                                                                                                                                             |
|  **platform**  |    N     | string |    -    | 웹툰 공급자<ul><li>`네이버 웹툰` 네이버 웹툰</li></ul>                                                                                                 |
| **day** |    N     | string |    -    | 웹툰 업데이트 구분<ul><li>`월` </li><li>`화` </li><li>`수`</li><li>`목`</li><li>`금`</li><li>`토`</li><li>`일`</li><li>`finish` 완결</li></ul> |

### Response Sample

**https://webtoon-api.herokuapp.com/?size=2&page=3&platform=%EB%84%A4%EC%9D%B4%EB%B2%84%20%EC%9B%B9%ED%88%B0&day=%EC%9B%94**

```json
{
    "content": [
        {
            "_id": 10006,
            "author": "모랑지",
            "day": [
                "월"
            ],
            "img": "https://shared-comic.pstatic.net/thumb/webtoon/654774/thumbnail/thumbnail_IMAG06_8ec78896-0b7f-44c3-9eb6-2ba9ab3b07f0.jpg",
            "platform": "네이버 웹툰",
            "searchKeyword": "소녀의세계모랑지",
            "title": "소녀의 세계",
            "url": "https://comic.naver.com/webtoon/list?titleId=654774&weekday=mon"
        },
        {
            "_id": 10007,
            "author": "김성진",
            "day": [
                "월"
            ],
            "img": "https://shared-comic.pstatic.net/thumb/webtoon/739115/thumbnail/thumbnail_IMAG06_7b590828-5c9b-4b6e-879d-508c4149a636.jpg",
            "platform": "네이버 웹툰",
            "searchKeyword": "앵무살수김성진",
            "title": "앵무살수",
            "url": "https://comic.naver.com/webtoon/list?titleId=739115&weekday=mon"
        }
    ],
    "pageable": {
        "sort": {
            "sorted": false,
            "unsorted": true,
            "empty": true
        },
        "pageNumber": 3,
        "pageSize": 2,
        "offset": 6,
        "paged": true,
        "unpaged": false
    },
    "last": false,
    "totalElements": 83,
    "totalPages": 42,
    "first": false,
    "sort": {
        "sorted": false,
        "unsorted": true,
        "empty": true
    },
    "number": 3,
    "numberOfElements": 2,
    "size": 2,
    "empty": false
}
```

## **웹툰 검색**

대소문자, 특수문자를 구분하지 않는 특정 키워드를 포함한 제목, 작가를 가진 웹툰 정보를 제공합니다.

| Method |                                            Request URL                                             | Format |
| :----: | :------------------------------------------------------------------------------------------------: | :----: |
|  GET   | [`https://webtoon-api.herokuapp.com/search`](https://webtoon-api.herokuapp.com/search) |  JSON  |

### **Request Parameter**

|    Name     | Required |  Type  | Default | Description |
| :---------: | :------: | :----: | :-----: | ----------- |
| **keyword** |    Y     | string |    -    | 검색 키워드 |

### Response Sample

**https://webtoon-api.herokuapp.com/search?keyword=%ED%98%B8%EB%9E%91%EC%9D%B4**

```json
[
    {
        "_id": 10108,
        "author": "배세혁 / 유은",
        "day": [
            "화"
        ],
        "img": "https://shared-comic.pstatic.net/thumb/webtoon/757904/thumbnail/thumbnail_IMAG06_1ac40e6e-83b8-497e-87d4-4ee027275b8f.jpg",
        "platform": "네이버 웹툰",
        "searchKeyword": "호랑이들어와요배세혁유은",
        "title": "호랑이 들어와요",
        "url": "https://comic.naver.com/webtoon/list?titleId=757904&weekday=tue"
    },
    {
        "_id": 10410,
        "author": "이상규",
        "day": [
            "토"
        ],
        "img": "https://shared-comic.pstatic.net/thumb/webtoon/650305/thumbnail/thumbnail_IMAG06_edfcb1ac-e979-4c45-8341-ef1dd37140d1.jpg",
        "platform": "네이버 웹툰",
        "searchKeyword": "호랑이형님이상규",
        "title": "호랑이형님",
        "url": "https://comic.naver.com/webtoon/list?titleId=650305&weekday=sat"
    },
    {
        "_id": 10524,
        "author": "아완 / 청라",
        "day": [
            "일"
        ],
        "img": "https://shared-comic.pstatic.net/thumb/webtoon/802682/thumbnail/thumbnail_IMAG06_05f63a50-c890-4120-ac38-63713a6d92df.jpg",
        "platform": "네이버 웹툰",
        "searchKeyword": "여신님의호랑이공략법아완청라",
        "title": "여신님의 호랑이 공략법",
        "url": "https://comic.naver.com/webtoon/list?titleId=802682&weekday=sun"
    }
]
```

# **🎁 Response Element**

|           Name            | Required |  Type   | Default | Description                                                                                                                                                                                                        |
| :-----------------------: | :------: | :-----: | :-----: | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
|   **totalWebtoonCount**   |    Y     | number  |    0    | 전체 웹툰 수                                                                                                                                                                                                       |
|   **naverWebtoonCount**   |    Y     | number  |    0    | 네이버 웹툰 수                                                                                                                                                                                                     |
|   **kakaoWebtoonCount**   |    Y     | number  |    0    | 카카오 웹툰 수                                                                                                                                                                                                     |
| **kakaoPageWebtoonCount** |    Y     | number  |    0    | 카카오 페이지 웹툰 수                                                                                                                                                                                              |
|      **lastUpdate**       |    N     | string  |  null   | 마지막 갱신 시간                                                                                                                                                                                                   |
|  **updatedWebtoonCount**  |    Y     | number  |    0    | 마지막 갱신에서 정보가 변경된 웹툰 수                                                                                                                                                                              |
|  **createdWebtoonCount**  |    Y     | number  |    0    | 마지막 갱신에서 정보가 새롭게 생성된 웹툰 수                                                                                                                                                                       |
|         **\_id**          |    Y     | string  |    -    | 객체 ID                                                                                                                                                                                                            |
|       **webtoonId**       |    Y     | number  |    -    | 웹툰 고유 ID                                                                                                                                                                                                       |
|         **title**         |    Y     | string  |    -    | 웹툰 제목                                                                                                                                                                                                          |
|        **author**         |    Y     | string  |    -    | 웹툰 작가                                                                                                                                                                                                          |
|          **url**          |    Y     | string  |    -    | 웹툰 URL                                                                                                                                                                                                           |
|          **img**          |    Y     | string  |    -    | 웹툰 썸네일 이미지                                                                                                                                                                                                 |
|        **service**        |    Y     | string  |    -    | 웹툰 공급자<ul><li>`naver` 네이버 웹툰</li><li>`kakao` 카카오 웹툰</li><li>`kakaoPage` 카카오페이지</li></ul>                                                                                                      |
|      **updateDays**       |    Y     |  array  |    -    | 웹툰 업데이트 구분 목록<ul><li>`mon` 월</li><li>`tue` 화</li><li>`wed` 수</li><li>`thu` 목</li><li>`fri` 금</li><li>`sat` 토</li><li>`sun` 일</li><li>`finished` 완결</li><li>`naverDaily` 네이버 Daily+</li></ul> |
|       **fanCount**        |    N     | number  |  null   | 웹툰의 팬 수<br/>10,000 단위 이며 10,000 이하일 경우 null                                                                                                                                                          |
|     **searchKeyword**     |    Y     | string  |    -    | 검색에 사용되는 키워드                                                                                                                                                                                             |
|          **new**          |    Y     | boolean |  false  | 신규 웹툰 여부                                                                                                                                                                                                     |
|         **adult**         |    Y     | boolean |  false  | 성인 웹툰 여부                                                                                                                                                                                                     |
|         **rest**          |    Y     | boolean |  false  | 웹툰 휴재                                                                                                                                                                                                          |
|          **up**           |    Y     | boolean |  false  | 웹툰 신규 회차 업로드                                                                                                                                                                                              |
|    **singularityList**    |    Y     |  array  |   []    | 웹툰 기타 정보 리스트<ul><li>`over15` 15세 이상</li><li>`free` 완전 무료</li><li>`waitFree` 기다리면 무료</li></ul>   
