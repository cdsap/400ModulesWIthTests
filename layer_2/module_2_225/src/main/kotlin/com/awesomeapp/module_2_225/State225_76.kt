package com.awesomeapp.module_2_225

sealed class State225_76 {
    data object Loading : State225_76()
    data class Success(val data: String) : State225_76()
    data class Error(val message: String) : State225_76()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}