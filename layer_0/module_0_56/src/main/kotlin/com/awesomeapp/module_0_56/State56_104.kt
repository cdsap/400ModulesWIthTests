package com.awesomeapp.module_0_56

sealed class State56_104 {
    data object Loading : State56_104()
    data class Success(val data: String) : State56_104()
    data class Error(val message: String) : State56_104()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}