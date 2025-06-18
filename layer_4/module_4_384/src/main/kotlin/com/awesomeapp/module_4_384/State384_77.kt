package com.awesomeapp.module_4_384

sealed class State384_77 {
    data object Loading : State384_77()
    data class Success(val data: String) : State384_77()
    data class Error(val message: String) : State384_77()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}