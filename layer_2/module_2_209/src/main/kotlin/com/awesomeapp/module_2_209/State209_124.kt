package com.awesomeapp.module_2_209

sealed class State209_124 {
    data object Loading : State209_124()
    data class Success(val data: String) : State209_124()
    data class Error(val message: String) : State209_124()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}