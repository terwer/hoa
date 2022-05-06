package com.terwergreen.hoaboot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HoaApplication

fun main(args: Array<String>) {
	runApplication<HoaApplication>(*args)
}
