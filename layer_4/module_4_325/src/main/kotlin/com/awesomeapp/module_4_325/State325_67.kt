package com.awesomeapp.module_4_325

sealed class State325_67 {
    data object Loading : State325_67()
    data class Success(val data: String) : State325_67()
    data class Error(val message: String) : State325_67()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}