package com.awesomeapp.module_1_118

sealed class State118_61 {
    data object Loading : State118_61()
    data class Success(val data: String) : State118_61()
    data class Error(val message: String) : State118_61()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}