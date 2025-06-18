package com.awesomeapp.module_0_38

sealed class State38_151 {
    data object Loading : State38_151()
    data class Success(val data: String) : State38_151()
    data class Error(val message: String) : State38_151()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}