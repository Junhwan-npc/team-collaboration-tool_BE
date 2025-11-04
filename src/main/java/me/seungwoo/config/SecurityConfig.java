package me.seungwoo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                // ✅ CSRF 완전 비활성화 (POST, PUT, DELETE 전부 허용)
                .csrf(csrf -> csrf.disable())

                // ✅ CORS도 완전히 비활성화
                .cors(cors -> cors.disable())

                // ✅ H2 콘솔 frame 허용
                .headers(headers -> headers.frameOptions(frame -> frame.disable()))

                // ✅ 요청 권한 설정
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/h2-console/**").permitAll()
                        .requestMatchers("/api/users/signup", "/api/users/login").permitAll()
                        .anyRequest().permitAll() // 💥 일단 인증 전부 풀어서 테스트
                )

                // ✅ 기본 로그인 UI 및 Basic Auth 비활성화
                .formLogin(login -> login.disable())
                .httpBasic(basic -> basic.disable());

        return http.build();
    }
}