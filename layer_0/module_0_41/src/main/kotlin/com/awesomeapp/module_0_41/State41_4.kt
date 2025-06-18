package com.awesomeapp.module_0_41

sealed class State41_4 {
    data object Loading : State41_4()
    data class Success(val data: String) : State41_4()
    data class Error(val message: String) : State41_4()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}