package com.awesomeapp.module_1_154

sealed class State154_10 {
    data object Loading : State154_10()
    data class Success(val data: String) : State154_10()
    data class Error(val message: String) : State154_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}