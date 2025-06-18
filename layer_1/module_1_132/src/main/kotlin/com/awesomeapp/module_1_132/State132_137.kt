package com.awesomeapp.module_1_132

sealed class State132_137 {
    data object Loading : State132_137()
    data class Success(val data: String) : State132_137()
    data class Error(val message: String) : State132_137()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}