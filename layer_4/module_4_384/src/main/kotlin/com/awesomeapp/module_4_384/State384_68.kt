package com.awesomeapp.module_4_384

sealed class State384_68 {
    data object Loading : State384_68()
    data class Success(val data: String) : State384_68()
    data class Error(val message: String) : State384_68()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}