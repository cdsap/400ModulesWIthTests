package com.awesomeapp.module_3_295

sealed class State295_130 {
    data object Loading : State295_130()
    data class Success(val data: String) : State295_130()
    data class Error(val message: String) : State295_130()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}