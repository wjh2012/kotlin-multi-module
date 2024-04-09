package com.ggomg.atm.domain.group

import org.springframework.stereotype.Service

@Service
class GroupService(
    private val groupWriter: GroupWriter,
    private val groupReader: GroupReader
) {
    fun write(name: String): Long {
        return groupWriter.write(name)
    }

    fun read(id: Long): Group? {
        return groupReader.read(id)
    }
}
