package com.example.bff.usecase

import br.com.zup.beagle.widget.core.TextAlignment
import br.com.zup.beagle.widget.layout.Screen
import br.com.zup.beagle.widget.layout.ScreenBuilder
import br.com.zup.beagle.widget.ui.Text
import org.springframework.stereotype.Service

@Service
class MyUseCase {
    fun getMyScreen() : ScreenBuilder = MyScreen()
}

class MyScreen : ScreenBuilder {
    override fun build() = Screen(
        child = Text(
            text = "Hello World!",
            alignment = TextAlignment.CENTER,
            textColor = "#505050"
        )
    )
}
