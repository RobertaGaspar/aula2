package com.tutofox.aula2

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@FeignClient(name = "usuario", url = "https://swapi.dev/api/planets/1/")
interface UsuarioAula1 {

    @RequestMapping(method = [RequestMethod.GET], value = ["/"])
    fun <T> retornaUsuario(): UsuarioResponse?
}