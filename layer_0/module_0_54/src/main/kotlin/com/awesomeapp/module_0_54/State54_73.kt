package com.awesomeapp.module_0_54

sealed class State54_73 {
    data object Loading : State54_73()
    data class Success(val data: String) : State54_73()
    data class Error(val message: String) : State54_73()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}