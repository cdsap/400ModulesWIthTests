package com.awesomeapp.module_0_61

sealed class State61_79 {
    data object Loading : State61_79()
    data class Success(val data: String) : State61_79()
    data class Error(val message: String) : State61_79()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}