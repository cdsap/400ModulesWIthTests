package com.awesomeapp.module_1_149

sealed class State149_55 {
    data object Loading : State149_55()
    data class Success(val data: String) : State149_55()
    data class Error(val message: String) : State149_55()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}