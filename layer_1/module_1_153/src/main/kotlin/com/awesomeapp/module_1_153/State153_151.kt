package com.awesomeapp.module_1_153

sealed class State153_151 {
    data object Loading : State153_151()
    data class Success(val data: String) : State153_151()
    data class Error(val message: String) : State153_151()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}