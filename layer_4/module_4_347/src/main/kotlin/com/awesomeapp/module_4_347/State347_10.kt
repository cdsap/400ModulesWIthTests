package com.awesomeapp.module_4_347

sealed class State347_10 {
    data object Loading : State347_10()
    data class Success(val data: String) : State347_10()
    data class Error(val message: String) : State347_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}