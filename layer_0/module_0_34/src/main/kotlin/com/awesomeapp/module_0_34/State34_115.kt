package com.awesomeapp.module_0_34

sealed class State34_115 {
    data object Loading : State34_115()
    data class Success(val data: String) : State34_115()
    data class Error(val message: String) : State34_115()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}