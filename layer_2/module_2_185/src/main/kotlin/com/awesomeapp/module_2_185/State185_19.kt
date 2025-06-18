package com.awesomeapp.module_2_185

sealed class State185_19 {
    data object Loading : State185_19()
    data class Success(val data: String) : State185_19()
    data class Error(val message: String) : State185_19()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}