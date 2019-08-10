package com.hyeonho.resttodo.model;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor                  // 기본 생성자
@Builder                            // 빌더 패턴으로 객체 생성
@EqualsAndHashCode(of = "id")       //
@AllArgsConstructor                 // 생성자 만드는 데 모든 필드값이 다 들어감

public class Todo {
    private Integer id;
    private String name;
    private String desc;
    private Status status = Status.READY;       // enum 타입 -> '이펙티브 자바' 책 1장 - enum //
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;


}
