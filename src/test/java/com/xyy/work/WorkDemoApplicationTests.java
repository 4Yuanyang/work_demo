package com.xyy.work;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import java.util.Optional;

@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
// 或者完全禁用数据源配置
@TestPropertySource(properties = {
        "spring.autoconfigure.exclude=org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration"
})
class WorkDemoApplicationTests {

    @Test
    void contextLoads() {

    }

    @Test
    void testOptional() {
        Optional<String> optional = Optional.of("hello");
        System.out.println(optional.orElse("xyy"));
        optional.ifPresent(System.out::println);

        System.out.println(optional.map(String::toUpperCase)
                .map(String::toCharArray)
                .orElse(new char[]{1})[0]);

    }

}
