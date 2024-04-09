package com.ggomg.atm.api.controller.user

import com.ggomg.atm.domain.user.User

data class UserResponse(
    val name: String
) {
    constructor(user: User) : this(user.username)
}
