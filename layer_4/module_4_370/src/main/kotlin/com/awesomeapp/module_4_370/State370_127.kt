package com.awesomeapp.module_4_370

sealed class State370_127 {
    data object Loading : State370_127()
    data class Success(val data: String) : State370_127()
    data class Error(val message: String) : State370_127()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}