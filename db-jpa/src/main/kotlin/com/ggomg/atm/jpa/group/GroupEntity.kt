package com.ggomg.atm.jpa.group

import com.ggomg.atm.jpa.BaseEntity
import jakarta.persistence.Entity

@Entity
internal class GroupEntity(
    val name: String,
) : BaseEntity()
