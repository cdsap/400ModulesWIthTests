package com.awesomeapp.module_3_291

sealed class State291_31 {
    data object Loading : State291_31()
    data class Success(val data: String) : State291_31()
    data class Error(val message: String) : State291_31()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}