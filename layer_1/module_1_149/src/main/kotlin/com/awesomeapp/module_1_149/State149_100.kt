package com.awesomeapp.module_1_149

sealed class State149_100 {
    data object Loading : State149_100()
    data class Success(val data: String) : State149_100()
    data class Error(val message: String) : State149_100()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}