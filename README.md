# TDD 연습을 위한 REST-API 작성

2019년 여름방학에 TDD 와 Web 연습하기 위해서 작성한 저장소입니다.   

## 준비사항 

* JDK (>=8)
* gradle or Intellij
* Spring Boot (>=2.x)

## 실행방법

* 추후 추가

## TODO 

- [X] 모델 생성
- [] 컨트롤러
- [] 서비스

## TODO-REST-API 스펙

* Model
    * Todo 
        * id
        * name
        * desc
        * status
            * READY
            * START
            * END
            * PAUSE
        * createAt
        * updateAt
        
* POST(/api/todo/)
    * todo 생성 
        * todo model  
* GET
* PUT
* PATCH
* DELETE