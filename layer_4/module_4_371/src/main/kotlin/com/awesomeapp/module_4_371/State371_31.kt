package com.awesomeapp.module_4_371

sealed class State371_31 {
    data object Loading : State371_31()
    data class Success(val data: String) : State371_31()
    data class Error(val message: String) : State371_31()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}