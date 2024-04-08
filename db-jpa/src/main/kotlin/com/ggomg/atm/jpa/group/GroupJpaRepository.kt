package com.ggomg.atm.jpa.group

import org.springframework.data.jpa.repository.JpaRepository

internal interface GroupJpaRepository : JpaRepository<GroupEntity, Long>
