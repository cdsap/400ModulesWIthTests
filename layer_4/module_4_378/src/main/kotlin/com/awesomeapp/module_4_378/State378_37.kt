package com.awesomeapp.module_4_378

sealed class State378_37 {
    data object Loading : State378_37()
    data class Success(val data: String) : State378_37()
    data class Error(val message: String) : State378_37()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}