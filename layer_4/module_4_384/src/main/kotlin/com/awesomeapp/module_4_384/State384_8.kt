package com.awesomeapp.module_4_384

sealed class State384_8 {
    data object Loading : State384_8()
    data class Success(val data: String) : State384_8()
    data class Error(val message: String) : State384_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}