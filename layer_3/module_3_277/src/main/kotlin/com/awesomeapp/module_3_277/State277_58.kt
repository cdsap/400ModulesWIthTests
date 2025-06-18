package com.awesomeapp.module_3_277

sealed class State277_58 {
    data object Loading : State277_58()
    data class Success(val data: String) : State277_58()
    data class Error(val message: String) : State277_58()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}