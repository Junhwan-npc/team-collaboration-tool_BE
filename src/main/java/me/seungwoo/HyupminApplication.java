package me.seungwoo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing; //게시글 생성 및 수정 시간 관련

@EnableJpaAuditing //이노테이션 추가
@SpringBootApplication
public class HyupminApplication {
    public static void main(String[] args) {
        SpringApplication.run(HyupminApplication.class, args);
    }

}