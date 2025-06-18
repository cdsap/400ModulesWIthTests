package com.awesomeapp.module_2_230

sealed class State230_43 {
    data object Loading : State230_43()
    data class Success(val data: String) : State230_43()
    data class Error(val message: String) : State230_43()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}