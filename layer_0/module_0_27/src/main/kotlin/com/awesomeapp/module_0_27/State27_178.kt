package com.awesomeapp.module_0_27

sealed class State27_178 {
    data object Loading : State27_178()
    data class Success(val data: String) : State27_178()
    data class Error(val message: String) : State27_178()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}