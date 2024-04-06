package com.ggomg.atm.domain.user

import org.springframework.stereotype.Service

@Service
class UserService(
    private val userRepository: UserRepository
) {
    fun write(name: String): Long {
        return userRepository.write(name)
    }

    fun read(id: Long): User? {
        return userRepository.read(id)
    }
}
