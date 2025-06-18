package com.awesomeapp.module_4_390

sealed class State390_22 {
    data object Loading : State390_22()
    data class Success(val data: String) : State390_22()
    data class Error(val message: String) : State390_22()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}