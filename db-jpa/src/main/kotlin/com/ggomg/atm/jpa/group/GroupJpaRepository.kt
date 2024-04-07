package com.ggomg.atm.jpa.user

import org.springframework.data.jpa.repository.JpaRepository

internal interface GroupJpaRepository : JpaRepository<GroupEntity, Long>
