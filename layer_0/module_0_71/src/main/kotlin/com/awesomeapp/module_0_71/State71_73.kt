package com.awesomeapp.module_0_71

sealed class State71_73 {
    data object Loading : State71_73()
    data class Success(val data: String) : State71_73()
    data class Error(val message: String) : State71_73()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}