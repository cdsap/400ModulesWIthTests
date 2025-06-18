package com.awesomeapp.module_1_148

sealed class State148_47 {
    data object Loading : State148_47()
    data class Success(val data: String) : State148_47()
    data class Error(val message: String) : State148_47()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}