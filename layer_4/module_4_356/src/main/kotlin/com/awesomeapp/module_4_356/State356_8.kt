package com.awesomeapp.module_4_356

sealed class State356_8 {
    data object Loading : State356_8()
    data class Success(val data: String) : State356_8()
    data class Error(val message: String) : State356_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}