package com.awesomeapp.module_2_171

sealed class State171_25 {
    data object Loading : State171_25()
    data class Success(val data: String) : State171_25()
    data class Error(val message: String) : State171_25()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}