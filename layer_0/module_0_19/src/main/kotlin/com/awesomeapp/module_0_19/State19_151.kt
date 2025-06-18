package com.awesomeapp.module_0_19

sealed class State19_151 {
    data object Loading : State19_151()
    data class Success(val data: String) : State19_151()
    data class Error(val message: String) : State19_151()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}