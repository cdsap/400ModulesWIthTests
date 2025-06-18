package com.awesomeapp.module_2_161

sealed class State161_46 {
    data object Loading : State161_46()
    data class Success(val data: String) : State161_46()
    data class Error(val message: String) : State161_46()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}