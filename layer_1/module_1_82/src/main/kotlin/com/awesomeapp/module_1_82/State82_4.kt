package com.awesomeapp.module_1_82

sealed class State82_4 {
    data object Loading : State82_4()
    data class Success(val data: String) : State82_4()
    data class Error(val message: String) : State82_4()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}