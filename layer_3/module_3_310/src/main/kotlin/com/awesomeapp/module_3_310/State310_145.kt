package com.awesomeapp.module_3_310

sealed class State310_145 {
    data object Loading : State310_145()
    data class Success(val data: String) : State310_145()
    data class Error(val message: String) : State310_145()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}