package com.awesomeapp.module_3_300

sealed class State300_23 {
    data object Loading : State300_23()
    data class Success(val data: String) : State300_23()
    data class Error(val message: String) : State300_23()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}