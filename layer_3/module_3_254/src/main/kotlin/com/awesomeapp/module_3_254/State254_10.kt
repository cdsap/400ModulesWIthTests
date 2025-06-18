package com.awesomeapp.module_3_254

sealed class State254_10 {
    data object Loading : State254_10()
    data class Success(val data: String) : State254_10()
    data class Error(val message: String) : State254_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}