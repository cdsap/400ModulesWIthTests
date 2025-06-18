package com.awesomeapp.module_2_181

sealed class State181_151 {
    data object Loading : State181_151()
    data class Success(val data: String) : State181_151()
    data class Error(val message: String) : State181_151()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}