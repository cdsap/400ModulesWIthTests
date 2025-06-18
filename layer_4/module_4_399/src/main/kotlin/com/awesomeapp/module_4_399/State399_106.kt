package com.awesomeapp.module_4_399

sealed class State399_106 {
    data object Loading : State399_106()
    data class Success(val data: String) : State399_106()
    data class Error(val message: String) : State399_106()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}