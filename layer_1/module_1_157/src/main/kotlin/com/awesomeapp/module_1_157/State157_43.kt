package com.awesomeapp.module_1_157

sealed class State157_43 {
    data object Loading : State157_43()
    data class Success(val data: String) : State157_43()
    data class Error(val message: String) : State157_43()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}