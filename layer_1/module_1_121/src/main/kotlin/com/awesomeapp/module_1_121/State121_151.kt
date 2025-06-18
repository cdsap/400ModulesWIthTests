package com.awesomeapp.module_1_121

sealed class State121_151 {
    data object Loading : State121_151()
    data class Success(val data: String) : State121_151()
    data class Error(val message: String) : State121_151()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}