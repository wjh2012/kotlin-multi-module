package com.ggomg.atm.jpa.config

import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.context.annotation.Configuration
import org.springframework.data.jpa.repository.config.EnableJpaAuditing
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.transaction.annotation.EnableTransactionManagement

@Configuration
@EnableTransactionManagement
@EntityScan(basePackages = ["com.ggomg.atm.jpa"])
@EnableJpaRepositories(basePackages = ["com.ggomg.atm.jpa"])
@EnableJpaAuditing
internal class JpaConfig
