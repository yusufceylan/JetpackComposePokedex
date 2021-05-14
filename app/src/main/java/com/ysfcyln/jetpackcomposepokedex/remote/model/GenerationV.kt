package com.ysfcyln.jetpackcomposepokedex.remote.model

import com.google.gson.annotations.SerializedName

data class GenerationV(
    @SerializedName("black-white")
    val blackWhite: BlackWhite
)