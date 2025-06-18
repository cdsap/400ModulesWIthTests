package com.awesomeapp.module_4_323

sealed class State323_172 {
    data object Loading : State323_172()
    data class Success(val data: String) : State323_172()
    data class Error(val message: String) : State323_172()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}