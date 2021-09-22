package com.tutofox.aula2

import lombok.Builder
import java.time.LocalDateTime


@Builder
data class UsuarioResponse(
    val name: String,
    val diameter: String,
    val gravity: String,
    val population: String,
    val climate: String,
    val terrain: String,
    val created: String,
    val edited: String,
    val url: String
)
