package com.awesomeapp.module_3_308

sealed class State308_56 {
    data object Loading : State308_56()
    data class Success(val data: String) : State308_56()
    data class Error(val message: String) : State308_56()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}