package com.awesomeapp.module_4_323

sealed class State323_178 {
    data object Loading : State323_178()
    data class Success(val data: String) : State323_178()
    data class Error(val message: String) : State323_178()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}