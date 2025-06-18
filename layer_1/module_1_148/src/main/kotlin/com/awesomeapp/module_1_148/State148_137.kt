package com.awesomeapp.module_1_148

sealed class State148_137 {
    data object Loading : State148_137()
    data class Success(val data: String) : State148_137()
    data class Error(val message: String) : State148_137()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}