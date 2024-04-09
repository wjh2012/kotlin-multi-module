package com.ggomg.atm.jpa.user

import com.ggomg.atm.jpa.BaseEntity
import jakarta.persistence.Entity

@Entity
internal class UserEntity(
    val name: String,
) : BaseEntity()
