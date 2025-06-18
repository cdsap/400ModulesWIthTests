package com.awesomeapp.module_1_157

sealed class State157_40 {
    data object Loading : State157_40()
    data class Success(val data: String) : State157_40()
    data class Error(val message: String) : State157_40()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}