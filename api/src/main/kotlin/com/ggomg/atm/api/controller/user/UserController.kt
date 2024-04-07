package com.ggomg.atm.api.controller.user

import com.ggomg.atm.domain.user.UserService
import org.springframework.web.bind.annotation.*

@RestController
class UserController(
    private val userService: UserService
) {
    @PostMapping("/users")
    fun addUser(
        @RequestBody request: NewUserRequest
    ): NewUserResponse {
        return NewUserResponse(userService.write(request.name))
    }

    @GetMapping("/users/{userId}")
    fun findUser(
        @PathVariable userId: Long
    ): UserResponse {
        return UserResponse(userService.read(userId))
    }
}
