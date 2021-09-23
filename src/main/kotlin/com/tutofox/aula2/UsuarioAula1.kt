package com.tutofox.aula2

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@FeignClient(name = "usuario", url = "https://localhost:8080/")
interface UsuarioAula1 {

    @RequestMapping(method = [RequestMethod.GET], value = ["/usuario"])

    fun retornaUsuario(): List<UsuarioResponse>
}
