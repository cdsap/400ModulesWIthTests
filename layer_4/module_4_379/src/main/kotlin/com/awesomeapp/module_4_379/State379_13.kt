package com.awesomeapp.module_4_379

sealed class State379_13 {
    data object Loading : State379_13()
    data class Success(val data: String) : State379_13()
    data class Error(val message: String) : State379_13()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}