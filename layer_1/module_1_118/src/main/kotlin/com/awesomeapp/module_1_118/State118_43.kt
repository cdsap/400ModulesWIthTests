package com.awesomeapp.module_1_118

sealed class State118_43 {
    data object Loading : State118_43()
    data class Success(val data: String) : State118_43()
    data class Error(val message: String) : State118_43()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}