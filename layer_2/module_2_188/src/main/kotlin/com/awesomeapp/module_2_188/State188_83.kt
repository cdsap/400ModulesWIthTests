package com.awesomeapp.module_2_188

sealed class State188_83 {
    data object Loading : State188_83()
    data class Success(val data: String) : State188_83()
    data class Error(val message: String) : State188_83()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}