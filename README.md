# **WebtoonAPI**
### ๐๋ค์ด๋ฒ ์นด์นด์ค ์นํฐ ์ ๋ณด ์ ๊ณตํ๋ API๐

![Python](https://img.shields.io/badge/python-3776AB?style=flat-square&logo=python&logoColor=white)&nbsp;![Java](https://img.shields.io/badge/Java-red?style=flat-square&logo=Java&logoColor=white) ![MongoDB](https://img.shields.io/badge/MongoDB-47A248?style=flat-square&logo=MongoDB&logoColor=white) ![SPRINGBOOT](https://img.shields.io/badge/SpringBoot-47A248?style=flat-square&logo=springboot&logoColor=white) ![HEROKU](https://img.shields.io/badge/Heroku-430098?style=flat-square&logo=Heroku&logoColor=white)

### **๐๊ฐ๋ฐ ๊ธฐ๋ก**
https://hxerimione.notion.site/API-038723a0126c4abf87701beb440cc207




# **๐ About**
์นํฐ ์ ๋ณด๋ฅผ ์ ๊ณตํฉ๋๋ค.
์ ๋ณด๊ฐ ์ ๊ณต๋๋ ์นํฐ ํ๋ซํผ์ ๋ค์๊ณผ ๊ฐ์ต๋๋ค.
- ๋ค์ด๋ฒ์นํฐ

# **๐ Request**

## **์นํฐ ์ ๋ณด ์์ฒญ**

์กฐ๊ฑด์ ๋ง์กฑํ๋ ์นํฐ ์ ๋ณด๋ค์ ์ ๊ณตํฉ๋๋ค. (ํ์ฌ ๋ฐฐํฌ ์ค์ง)

| Method |                                     Request URL                                      | Format |
| :----: | :----------------------------------------------------------------------------------: | :----: |
|  GET   | [`https://webtoon-api.herokuapp.com/`](https://webtoon-api.herokuapp.com/) |  JSON  |

### **Request Parameter**

|     Name      | Required |  Type  | Default | Description                                                                                                                                                                                                   |
| :-----------: | :------: | :----: | :-----: | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
|   **page**    |    N     | number |    0    | ํ์ด์ง ๋ฒํธ                                                                                                                                                                                                   |
|  **size**  |    N     | number |   10    | ํ ํ์ด์ง ๊ฒฐ๊ณผ ์                                                                                                                                                                                             |
|  **platform**  |    N     | string |    -    | ์นํฐ ๊ณต๊ธ์<ul><li>`๋ค์ด๋ฒ ์นํฐ` ๋ค์ด๋ฒ ์นํฐ</li></ul>                                                                                                 |
| **day** |    N     | string |    -    | ์นํฐ ์๋ฐ์ดํธ ๊ตฌ๋ถ<ul><li>`์` </li><li>`ํ` </li><li>`์`</li><li>`๋ชฉ`</li><li>`๊ธ`</li><li>`ํ `</li><li>`์ผ`</li><li>`finish` ์๊ฒฐ</li></ul> |

### Response Sample

**https://webtoon-api.herokuapp.com/?size=2&page=3&platform=%EB%84%A4%EC%9D%B4%EB%B2%84%20%EC%9B%B9%ED%88%B0&day=%EC%9B%94**

```json
{
    "content": [
        {
            "_id": 10006,
            "author": "๋ชจ๋์ง",
            "day": [
                "์"
            ],
            "img": "https://shared-comic.pstatic.net/thumb/webtoon/654774/thumbnail/thumbnail_IMAG06_8ec78896-0b7f-44c3-9eb6-2ba9ab3b07f0.jpg",
            "platform": "๋ค์ด๋ฒ ์นํฐ",
            "searchKeyword": "์๋์์ธ๊ณ๋ชจ๋์ง",
            "title": "์๋์ ์ธ๊ณ",
            "url": "https://comic.naver.com/webtoon/list?titleId=654774&weekday=mon"
        },
        {
            "_id": 10007,
            "author": "๊น์ฑ์ง",
            "day": [
                "์"
            ],
            "img": "https://shared-comic.pstatic.net/thumb/webtoon/739115/thumbnail/thumbnail_IMAG06_7b590828-5c9b-4b6e-879d-508c4149a636.jpg",
            "platform": "๋ค์ด๋ฒ ์นํฐ",
            "searchKeyword": "์ต๋ฌด์ด์๊น์ฑ์ง",
            "title": "์ต๋ฌด์ด์",
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

## **์นํฐ ๊ฒ์**

๋์๋ฌธ์, ํน์๋ฌธ์๋ฅผ ๊ตฌ๋ถํ์ง ์๋ ํน์  ํค์๋๋ฅผ ํฌํจํ ์ ๋ชฉ, ์๊ฐ๋ฅผ ๊ฐ์ง ์นํฐ ์ ๋ณด๋ฅผ ์ ๊ณตํฉ๋๋ค.

| Method |                                            Request URL                                             | Format |
| :----: | :------------------------------------------------------------------------------------------------: | :----: |
|  GET   | [`https://webtoon-api.herokuapp.com/search`](https://webtoon-api.herokuapp.com/search) |  JSON  |

### **Request Parameter**

|    Name     | Required |  Type  | Default | Description |
| :---------: | :------: | :----: | :-----: | ----------- |
| **keyword** |    Y     | string |    -    | ๊ฒ์ ํค์๋ |

### Response Sample

**https://webtoon-api.herokuapp.com/search?keyword=%EC%8B%9D%EC%8A%A4%EC%84%BC%EC%8A%A4**

```json
[
    {
        "_id": 10459,
        "author": "์กฐ์ฝ๋ด / ๊ฐ๋",
        "day": [
            "ํ "
        ],
        "img": "https://shared-comic.pstatic.net/thumb/webtoon/770964/thumbnail/thumbnail_IMAG06_ca279a51-e627-4037-8bdb-65a82d24a908.jpg",
        "platform": "๋ค์ด๋ฒ ์นํฐ",
        "searchKeyword": "ํค์ค์์ค์ผ์ค์กฐ์ฝ๋ด๊ฐ๋",
        "title": "ํค์ค ์์ค ์ผ์ค",
        "url": "https://comic.naver.com/webtoon/list?titleId=770964&weekday=sat"
    },
    {
        "_id": 21405,
        "author": "๋ฆด๋ ์ด์ฐ์ฌ",
        "day": [
            "finish"
        ],
        "img": "https://shared-comic.pstatic.net/thumb/webtoon/25517/thumbnail/thumbnail_title_25517_83x90.gif",
        "platform": "๋ค์ด๋ฒ ์นํฐ",
        "searchKeyword": "์์ค์ผ์ค๋ฆด๋ ์ด์ฐ์ฌ",
        "title": "์์ค์ผ์ค",
        "url": "https://comic.naver.com/webtoon/list?titleId=25517"
    }
]
```

# **๐ Response Element**

|           Name            | Required |  Type   | Default | Description                                                                                                                                                                                                        |
| :-----------------------: | :------: | :-----: | :-----: | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
|         **\_id**          |    Y     | string  |    -    | ์นํฐ ID                                                                                                                                                                                                     |
|         **title**         |    Y     | string  |    -    | ์นํฐ ์ ๋ชฉ                                                                                                                                                                                                          |
|        **author**         |    Y     | string  |    -    | ์นํฐ ์๊ฐ                                                                                                                                                                                                          |
|          **url**          |    Y     | string  |    -    | ์นํฐ URL                                                                                                                                                                                                           |
|          **img**          |    Y     | string  |    -    | ์นํฐ ์ธ๋ค์ผ ์ด๋ฏธ์ง                                                                                                                                                                                                 |
|        **platform**        |    Y     | string  |    -    | ์นํฐ ๊ณต๊ธ์<ul><li>`๋ค์ด๋ฒ ์นํฐ` ๋ค์ด๋ฒ ์นํฐ</li></ul>                                                                                                      |
|      **day**       |    Y     |  array  |    -    | ์นํฐ ์๋ฐ์ดํธ ๊ตฌ๋ถ ๋ชฉ๋ก<ul><li>`์`</li><li>`ํ`</li><li>`์`</li><li>`๋ชฉ`</li><li>`๊ธ`</li><li>`ํ `</li><li>`์ผ`</li><li>`finish` ์๊ฒฐ</li></ul> |
|     **searchKeyword**     |    Y     | string  |    -    | ๊ฒ์์ ์ฌ์ฉ๋๋ ํค์๋                                                                                                                                                                                             | 
