package com.awesomeapp.module_4_323

sealed class State323_97 {
    data object Loading : State323_97()
    data class Success(val data: String) : State323_97()
    data class Error(val message: String) : State323_97()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}