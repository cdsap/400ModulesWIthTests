package com.awesomeapp.module_0_11

sealed class State11_4 {
    data object Loading : State11_4()
    data class Success(val data: String) : State11_4()
    data class Error(val message: String) : State11_4()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}