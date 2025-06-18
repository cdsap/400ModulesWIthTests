package com.awesomeapp.module_3_285

sealed class State285_16 {
    data object Loading : State285_16()
    data class Success(val data: String) : State285_16()
    data class Error(val message: String) : State285_16()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}