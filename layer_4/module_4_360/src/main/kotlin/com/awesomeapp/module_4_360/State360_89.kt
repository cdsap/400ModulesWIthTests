package com.awesomeapp.module_4_360

sealed class State360_89 {
    data object Loading : State360_89()
    data class Success(val data: String) : State360_89()
    data class Error(val message: String) : State360_89()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}