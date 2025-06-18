package com.awesomeapp.module_2_216

sealed class State216_74 {
    data object Loading : State216_74()
    data class Success(val data: String) : State216_74()
    data class Error(val message: String) : State216_74()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}