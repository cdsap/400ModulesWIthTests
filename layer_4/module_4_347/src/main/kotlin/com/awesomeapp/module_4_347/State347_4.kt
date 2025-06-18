package com.awesomeapp.module_4_347

sealed class State347_4 {
    data object Loading : State347_4()
    data class Success(val data: String) : State347_4()
    data class Error(val message: String) : State347_4()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}