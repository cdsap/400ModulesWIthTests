package com.awesomeapp.module_5_401

sealed class State401_61 {
    data object Loading : State401_61()
    data class Success(val data: String) : State401_61()
    data class Error(val message: String) : State401_61()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}