package com.ggomg.atm.domain.group

interface GroupRepository {

    fun write(name: String): Long
    fun read(id: Long): Group?

}
