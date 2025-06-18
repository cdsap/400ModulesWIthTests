package com.awesomeapp.module_4_357

sealed class State357_94 {
    data object Loading : State357_94()
    data class Success(val data: String) : State357_94()
    data class Error(val message: String) : State357_94()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}