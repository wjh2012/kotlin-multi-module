package com.ggomg.atm.jpa.user

import com.ggomg.atm.domain.group.Group
import com.ggomg.atm.domain.group.GroupRepository
import com.ggomg.atm.domain.user.User
import com.ggomg.atm.domain.user.UserRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Repository

@Repository
internal class GroupEntityRepository(
    private val groupJpaRepository: GroupJpaRepository,
) : GroupRepository {
    override fun write(name: String): Long {
        return groupJpaRepository.save(
            GroupEntity(name = name)
        ).id!!
    }

    override fun read(id: Long): Group? {
        return groupJpaRepository.findByIdOrNull(id)?.let {
            Group(
                id = it.id!!,
                name = it.name
            )
        }
    }

}
