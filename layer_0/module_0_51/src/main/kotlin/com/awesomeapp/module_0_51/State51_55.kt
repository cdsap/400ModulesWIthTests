package com.awesomeapp.module_0_51

sealed class State51_55 {
    data object Loading : State51_55()
    data class Success(val data: String) : State51_55()
    data class Error(val message: String) : State51_55()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}