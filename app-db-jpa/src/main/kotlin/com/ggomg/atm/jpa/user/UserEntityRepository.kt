package com.ggomg.atm.jpa.user

import com.ggomg.atm.domain.user.User
import com.ggomg.atm.domain.user.UserRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Repository

@Repository
internal class UserEntityRepository(
    private val userJpaRepository: UserJpaRepository,
) : UserRepository {
    override fun write(name: String): Long {
        return userJpaRepository.save(
            UserEntity(username = name)
        ).id!!
    }

    override fun read(id: Long): User? {
        return userJpaRepository.findByIdOrNull(id)?.let {
            User(
                username = it.username
            )
        }
    }

}
