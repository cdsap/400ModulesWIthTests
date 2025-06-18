package com.awesomeapp.module_1_142

sealed class State142_25 {
    data object Loading : State142_25()
    data class Success(val data: String) : State142_25()
    data class Error(val message: String) : State142_25()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}