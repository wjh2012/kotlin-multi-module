package com.ggomg.atm.domain.user

import org.springframework.stereotype.Service

@Service
class UserService(
    private val userWriter: UserWriter,
    private val userReader: UserReader
) {
    fun write(name: String): Long {
        return userWriter.write(name)
    }

    fun read(id: Long): User? {
        return userReader.read(id)
    }
}
