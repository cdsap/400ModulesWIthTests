package com.awesomeapp.module_1_127

sealed class State127_151 {
    data object Loading : State127_151()
    data class Success(val data: String) : State127_151()
    data class Error(val message: String) : State127_151()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}