package com.awesomeapp.module_4_338

sealed class State338_43 {
    data object Loading : State338_43()
    data class Success(val data: String) : State338_43()
    data class Error(val message: String) : State338_43()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}