package com.ggomg.atm.domain.group

import org.springframework.stereotype.Component

@Component
class GroupWriter(private val groupRepository: GroupRepository) {

    fun write(name: String): Long {
        return groupRepository.write(name)
    }
}
