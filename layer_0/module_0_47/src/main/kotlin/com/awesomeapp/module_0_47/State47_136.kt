package com.awesomeapp.module_0_47

sealed class State47_136 {
    data object Loading : State47_136()
    data class Success(val data: String) : State47_136()
    data class Error(val message: String) : State47_136()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}