package com.example.bff.entrypoint

import br.com.zup.beagle.widget.layout.ScreenBuilder
import com.example.bff.usecase.MyUseCase
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MyController(private val myUseCase: MyUseCase) {
    @GetMapping("/screen")
    fun getScreen() : ScreenBuilder = myUseCase.getMyScreen()

}