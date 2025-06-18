package com.awesomeapp.module_4_371

sealed class State371_55 {
    data object Loading : State371_55()
    data class Success(val data: String) : State371_55()
    data class Error(val message: String) : State371_55()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}