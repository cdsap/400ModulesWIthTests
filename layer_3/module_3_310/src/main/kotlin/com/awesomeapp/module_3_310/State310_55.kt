package com.awesomeapp.module_3_310

sealed class State310_55 {
    data object Loading : State310_55()
    data class Success(val data: String) : State310_55()
    data class Error(val message: String) : State310_55()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}