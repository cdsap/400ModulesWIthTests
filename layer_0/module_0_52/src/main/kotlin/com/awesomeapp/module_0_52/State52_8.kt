package com.awesomeapp.module_0_52

sealed class State52_8 {
    data object Loading : State52_8()
    data class Success(val data: String) : State52_8()
    data class Error(val message: String) : State52_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}