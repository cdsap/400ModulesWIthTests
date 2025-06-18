package com.awesomeapp.module_4_360

sealed class State360_74 {
    data object Loading : State360_74()
    data class Success(val data: String) : State360_74()
    data class Error(val message: String) : State360_74()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}