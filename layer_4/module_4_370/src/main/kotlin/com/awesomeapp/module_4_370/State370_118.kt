package com.awesomeapp.module_4_370

sealed class State370_118 {
    data object Loading : State370_118()
    data class Success(val data: String) : State370_118()
    data class Error(val message: String) : State370_118()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}