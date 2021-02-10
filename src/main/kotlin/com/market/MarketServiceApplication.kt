package com.market

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.CrossOrigin

@CrossOrigin
@SpringBootApplication
class MarketServiceApplication

fun main(args: Array<String>) {
	runApplication<MarketServiceApplication>(*args)
}
