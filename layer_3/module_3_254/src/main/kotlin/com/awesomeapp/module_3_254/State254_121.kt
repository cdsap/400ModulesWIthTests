package com.awesomeapp.module_3_254

sealed class State254_121 {
    data object Loading : State254_121()
    data class Success(val data: String) : State254_121()
    data class Error(val message: String) : State254_121()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}