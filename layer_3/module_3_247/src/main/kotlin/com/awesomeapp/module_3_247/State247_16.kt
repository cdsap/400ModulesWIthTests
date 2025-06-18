package com.awesomeapp.module_3_247

sealed class State247_16 {
    data object Loading : State247_16()
    data class Success(val data: String) : State247_16()
    data class Error(val message: String) : State247_16()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}