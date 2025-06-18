package com.awesomeapp.module_0_53

sealed class State53_67 {
    data object Loading : State53_67()
    data class Success(val data: String) : State53_67()
    data class Error(val message: String) : State53_67()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}