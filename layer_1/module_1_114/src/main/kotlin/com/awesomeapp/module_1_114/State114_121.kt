package com.awesomeapp.module_1_114

sealed class State114_121 {
    data object Loading : State114_121()
    data class Success(val data: String) : State114_121()
    data class Error(val message: String) : State114_121()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}