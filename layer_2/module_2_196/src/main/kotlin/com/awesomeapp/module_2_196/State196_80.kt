package com.awesomeapp.module_2_196

sealed class State196_80 {
    data object Loading : State196_80()
    data class Success(val data: String) : State196_80()
    data class Error(val message: String) : State196_80()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}