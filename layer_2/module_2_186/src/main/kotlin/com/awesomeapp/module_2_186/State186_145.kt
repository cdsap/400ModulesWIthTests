package com.awesomeapp.module_2_186

sealed class State186_145 {
    data object Loading : State186_145()
    data class Success(val data: String) : State186_145()
    data class Error(val message: String) : State186_145()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}