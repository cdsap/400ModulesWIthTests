package com.awesomeapp.module_3_284

sealed class State284_59 {
    data object Loading : State284_59()
    data class Success(val data: String) : State284_59()
    data class Error(val message: String) : State284_59()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}