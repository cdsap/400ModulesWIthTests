package com.awesomeapp.module_4_359

sealed class State359_19 {
    data object Loading : State359_19()
    data class Success(val data: String) : State359_19()
    data class Error(val message: String) : State359_19()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}