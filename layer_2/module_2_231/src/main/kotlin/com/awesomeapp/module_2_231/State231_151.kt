package com.awesomeapp.module_2_231

sealed class State231_151 {
    data object Loading : State231_151()
    data class Success(val data: String) : State231_151()
    data class Error(val message: String) : State231_151()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}