# **WebtoonAPI**
### 📍네이버 카카오 웹툰 정보 제공하는 API📖

![Python](https://img.shields.io/badge/python-3776AB?style=flat-square&logo=python&logoColor=white)&nbsp;&nbsp;&nbsp;![Java](https://img.shields.io/badge/Java-red?style=flat-square&logo=Java&logoColor=white) ![MongoDB](https://img.shields.io/badge/MongoDB-47A248?style=flat-square&logo=MongoDB&logoColor=white) ![SPRINGBOOT](https://img.shields.io/badge/SpringBoot-47A248?style=flat-square&logo=springboot&logoColor=white) ![HEROKU](https://img.shields.io/badge/Heroku-430098?style=flat-square&logo=Heroku&logoColor=white)

### **📝개발 기록**
https://hxerimione.notion.site/API-038723a0126c4abf87701beb440cc207




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

**https://webtoon-api.herokuapp.com/search?keyword=%EC%8B%9D%EC%8A%A4%EC%84%BC%EC%8A%A4**

```json
[
    {
        "_id": 10459,
        "author": "조코봉 / 갓녀",
        "day": [
            "토"
        ],
        "img": "https://shared-comic.pstatic.net/thumb/webtoon/770964/thumbnail/thumbnail_IMAG06_ca279a51-e627-4037-8bdb-65a82d24a908.jpg",
        "platform": "네이버 웹툰",
        "searchKeyword": "키스식스센스조코봉갓녀",
        "title": "키스 식스 센스",
        "url": "https://comic.naver.com/webtoon/list?titleId=770964&weekday=sat"
    },
    {
        "_id": 21405,
        "author": "릴레이연재",
        "day": [
            "finish"
        ],
        "img": "https://shared-comic.pstatic.net/thumb/webtoon/25517/thumbnail/thumbnail_title_25517_83x90.gif",
        "platform": "네이버 웹툰",
        "searchKeyword": "식스센스릴레이연재",
        "title": "식스센스",
        "url": "https://comic.naver.com/webtoon/list?titleId=25517"
    }
]
```

# **🎁 Response Element**

|           Name            | Required |  Type   | Default | Description                                                                                                                                                                                                        |
| :-----------------------: | :------: | :-----: | :-----: | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
|         **\_id**          |    Y     | string  |    -    | 웹툰 ID                                                                                                                                                                                                     |
|         **title**         |    Y     | string  |    -    | 웹툰 제목                                                                                                                                                                                                          |
|        **author**         |    Y     | string  |    -    | 웹툰 작가                                                                                                                                                                                                          |
|          **url**          |    Y     | string  |    -    | 웹툰 URL                                                                                                                                                                                                           |
|          **img**          |    Y     | string  |    -    | 웹툰 썸네일 이미지                                                                                                                                                                                                 |
|        **platform**        |    Y     | string  |    -    | 웹툰 공급자<ul><li>`네이버 웹툰` 네이버 웹툰</li></ul>                                                                                                      |
|      **day**       |    Y     |  array  |    -    | 웹툰 업데이트 구분 목록<ul><li>`월`</li><li>`화`</li><li>`수`</li><li>`목`</li><li>`금`</li><li>`토`</li><li>`일`</li><li>`finish` 완결</li></ul> |
|     **searchKeyword**     |    Y     | string  |    -    | 검색에 사용되는 키워드                                                                                                                                                                                             | 
