package com.tutofox.aula2

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("usuario2")
class UsuarioController {
    @Autowired
    var usuarioAula1: UsuarioAula1? = null

    @GetMapping
    fun retornaUsuario(): UsuarioResponse? {
        return usuarioAula1!!.retornaUsuario<UsuarioResponse>()
    }
}