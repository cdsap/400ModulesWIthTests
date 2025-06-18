package com.awesomeapp.module_3_267

sealed class State267_4 {
    data object Loading : State267_4()
    data class Success(val data: String) : State267_4()
    data class Error(val message: String) : State267_4()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}