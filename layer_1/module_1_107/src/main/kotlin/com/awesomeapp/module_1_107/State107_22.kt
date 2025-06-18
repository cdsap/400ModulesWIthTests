package com.awesomeapp.module_1_107

sealed class State107_22 {
    data object Loading : State107_22()
    data class Success(val data: String) : State107_22()
    data class Error(val message: String) : State107_22()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}