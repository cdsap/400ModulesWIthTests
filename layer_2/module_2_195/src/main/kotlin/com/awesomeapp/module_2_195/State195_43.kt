package com.awesomeapp.module_2_195

sealed class State195_43 {
    data object Loading : State195_43()
    data class Success(val data: String) : State195_43()
    data class Error(val message: String) : State195_43()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}