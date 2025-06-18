package com.awesomeapp.module_1_107

sealed class State107_25 {
    data object Loading : State107_25()
    data class Success(val data: String) : State107_25()
    data class Error(val message: String) : State107_25()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}