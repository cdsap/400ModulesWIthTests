package com.awesomeapp.module_1_118

sealed class State118_85 {
    data object Loading : State118_85()
    data class Success(val data: String) : State118_85()
    data class Error(val message: String) : State118_85()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}