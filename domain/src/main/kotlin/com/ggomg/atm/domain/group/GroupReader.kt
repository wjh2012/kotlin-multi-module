package com.ggomg.atm.domain.group

import org.springframework.stereotype.Component

@Component
class GroupReader(private val groupRepository: GroupRepository) {

    fun read(id: Long): Group {
        return groupRepository.read(id) ?: throw NoSuchElementException()
    }
}
