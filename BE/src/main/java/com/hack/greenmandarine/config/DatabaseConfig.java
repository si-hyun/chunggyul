package com.hack.greenmandarine.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(
		basePackages = "com.hack.greenmandarine.mapper"
)
public class DatabaseConfig {}