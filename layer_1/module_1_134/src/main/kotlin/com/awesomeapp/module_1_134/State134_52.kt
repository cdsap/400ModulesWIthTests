package com.awesomeapp.module_1_134

sealed class State134_52 {
    data object Loading : State134_52()
    data class Success(val data: String) : State134_52()
    data class Error(val message: String) : State134_52()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}