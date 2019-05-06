package cn.wd.microservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@Slf4j
@SpringBootApplication
public class MicroServiceApplication implements ApplicationRunner {
    @Value("${spring.application.name}")
    private String name;

    public static void main(String[] args) {
        SpringApplication.run(MicroServiceApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) {
        log.info("{},启动成功", name);
    }
}
