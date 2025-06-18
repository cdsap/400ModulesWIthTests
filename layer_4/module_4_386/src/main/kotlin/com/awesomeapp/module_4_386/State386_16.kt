package com.awesomeapp.module_4_386

sealed class State386_16 {
    data object Loading : State386_16()
    data class Success(val data: String) : State386_16()
    data class Error(val message: String) : State386_16()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}