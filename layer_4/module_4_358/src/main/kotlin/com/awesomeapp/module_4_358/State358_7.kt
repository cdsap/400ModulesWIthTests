package com.awesomeapp.module_4_358

sealed class State358_7 {
    data object Loading : State358_7()
    data class Success(val data: String) : State358_7()
    data class Error(val message: String) : State358_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}