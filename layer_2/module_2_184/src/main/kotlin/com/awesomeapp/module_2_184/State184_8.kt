package com.awesomeapp.module_2_184

sealed class State184_8 {
    data object Loading : State184_8()
    data class Success(val data: String) : State184_8()
    data class Error(val message: String) : State184_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}