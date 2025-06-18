package com.awesomeapp.module_1_115

sealed class State115_19 {
    data object Loading : State115_19()
    data class Success(val data: String) : State115_19()
    data class Error(val message: String) : State115_19()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}