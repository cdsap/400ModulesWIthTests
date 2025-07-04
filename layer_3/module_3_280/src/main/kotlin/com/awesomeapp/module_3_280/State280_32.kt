package com.awesomeapp.module_3_280

sealed class State280_32 {
    data object Loading : State280_32()
    data class Success(val data: String) : State280_32()
    data class Error(val message: String) : State280_32()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}