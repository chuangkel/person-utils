package com.github.chuangkel.mybatisgenerator;

import org.mybatis.generator.plugins.RowBoundsPlugin;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MybatisGeneratorApplication {

    public static void main(String[] args) {

        RowBoundsPlugin rowBoundsPlugin;
        SpringApplication.run(MybatisGeneratorApplication.class, args);
    }

}
