package com.awesomeapp.module_3_316

sealed class State316_125 {
    data object Loading : State316_125()
    data class Success(val data: String) : State316_125()
    data class Error(val message: String) : State316_125()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}