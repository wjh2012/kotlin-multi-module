package com.ggomg.atm.domain.user

interface UserRepository {

    fun write(name: String): Long
    fun read(id: Long): User?

}
