package com.awesomeapp.module_0_19

sealed class State19_52 {
    data object Loading : State19_52()
    data class Success(val data: String) : State19_52()
    data class Error(val message: String) : State19_52()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}