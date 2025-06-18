package com.awesomeapp.module_2_205

sealed class State205_79 {
    data object Loading : State205_79()
    data class Success(val data: String) : State205_79()
    data class Error(val message: String) : State205_79()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}