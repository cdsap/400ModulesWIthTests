package com.awesomeapp.module_3_247

sealed class State247_121 {
    data object Loading : State247_121()
    data class Success(val data: String) : State247_121()
    data class Error(val message: String) : State247_121()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}