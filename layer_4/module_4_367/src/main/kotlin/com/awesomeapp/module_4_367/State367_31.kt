package com.awesomeapp.module_4_367

sealed class State367_31 {
    data object Loading : State367_31()
    data class Success(val data: String) : State367_31()
    data class Error(val message: String) : State367_31()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}