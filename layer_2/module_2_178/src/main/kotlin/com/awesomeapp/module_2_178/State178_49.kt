package com.awesomeapp.module_2_178

sealed class State178_49 {
    data object Loading : State178_49()
    data class Success(val data: String) : State178_49()
    data class Error(val message: String) : State178_49()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}