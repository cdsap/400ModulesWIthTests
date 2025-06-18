package com.awesomeapp.module_1_97

sealed class State97_61 {
    data object Loading : State97_61()
    data class Success(val data: String) : State97_61()
    data class Error(val message: String) : State97_61()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}