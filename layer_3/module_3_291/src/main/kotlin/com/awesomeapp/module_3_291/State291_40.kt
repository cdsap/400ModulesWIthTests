package com.awesomeapp.module_3_291

sealed class State291_40 {
    data object Loading : State291_40()
    data class Success(val data: String) : State291_40()
    data class Error(val message: String) : State291_40()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}