package com.awesomeapp.module_4_323

sealed class State323_67 {
    data object Loading : State323_67()
    data class Success(val data: String) : State323_67()
    data class Error(val message: String) : State323_67()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}