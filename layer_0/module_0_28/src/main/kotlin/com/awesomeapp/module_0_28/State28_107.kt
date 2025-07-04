package com.awesomeapp.module_0_28

sealed class State28_107 {
    data object Loading : State28_107()
    data class Success(val data: String) : State28_107()
    data class Error(val message: String) : State28_107()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}