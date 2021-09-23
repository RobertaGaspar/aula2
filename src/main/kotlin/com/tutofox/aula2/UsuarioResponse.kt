package com.tutofox.aula2

import lombok.Builder

@Builder
data class UsuarioResponse(
    val id: Long? = null,
    val nome: String,
    val idade: Int
)
