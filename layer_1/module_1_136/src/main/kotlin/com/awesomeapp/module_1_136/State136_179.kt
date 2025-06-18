package com.awesomeapp.module_1_136

sealed class State136_179 {
    data object Loading : State136_179()
    data class Success(val data: String) : State136_179()
    data class Error(val message: String) : State136_179()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}