package com.awesomeapp.module_4_370

sealed class State370_163 {
    data object Loading : State370_163()
    data class Success(val data: String) : State370_163()
    data class Error(val message: String) : State370_163()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}