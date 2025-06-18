package com.awesomeapp.module_1_118

sealed class State118_46 {
    data object Loading : State118_46()
    data class Success(val data: String) : State118_46()
    data class Error(val message: String) : State118_46()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}