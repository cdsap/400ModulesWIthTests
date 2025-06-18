package com.awesomeapp.module_1_154

sealed class State154_4 {
    data object Loading : State154_4()
    data class Success(val data: String) : State154_4()
    data class Error(val message: String) : State154_4()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}