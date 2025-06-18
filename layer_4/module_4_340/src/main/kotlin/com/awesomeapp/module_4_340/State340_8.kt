package com.awesomeapp.module_4_340

sealed class State340_8 {
    data object Loading : State340_8()
    data class Success(val data: String) : State340_8()
    data class Error(val message: String) : State340_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}