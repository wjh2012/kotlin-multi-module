package com.ggomg.atm.domain.user

import org.springframework.stereotype.Component

@Component
class UserWriter(private val userRepository: UserRepository) {

    fun write(name: String): Long {
        return userRepository.write(name)
    }
}
