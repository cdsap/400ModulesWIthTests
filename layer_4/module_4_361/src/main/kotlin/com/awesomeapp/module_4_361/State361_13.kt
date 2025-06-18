package com.awesomeapp.module_4_361

sealed class State361_13 {
    data object Loading : State361_13()
    data class Success(val data: String) : State361_13()
    data class Error(val message: String) : State361_13()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}