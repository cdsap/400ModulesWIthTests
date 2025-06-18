package com.awesomeapp.module_3_266

sealed class State266_43 {
    data object Loading : State266_43()
    data class Success(val data: String) : State266_43()
    data class Error(val message: String) : State266_43()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}