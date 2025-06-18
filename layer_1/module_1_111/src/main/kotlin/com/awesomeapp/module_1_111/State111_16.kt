package com.awesomeapp.module_1_111

sealed class State111_16 {
    data object Loading : State111_16()
    data class Success(val data: String) : State111_16()
    data class Error(val message: String) : State111_16()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}