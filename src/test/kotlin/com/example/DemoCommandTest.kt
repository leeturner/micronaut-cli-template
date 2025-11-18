package com.example

import io.micronaut.configuration.picocli.PicocliRunner
import io.micronaut.context.ApplicationContext
import io.micronaut.context.env.Environment.CLI
import io.micronaut.context.env.Environment.TEST
import org.junit.jupiter.api.Test
import strikt.api.expectThat
import strikt.assertions.contains
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class DemoCommandTest {
    @Test
    fun testWithCommandLineOption() {
        ApplicationContext.run(CLI, TEST).use { ctx ->
            ByteArrayOutputStream().use { baos ->
                System.setOut(PrintStream(baos))

                val args = arrayOf("-v")
                PicocliRunner.run(DemoCommand::class.java, ctx, *args)

                expectThat(baos.toString()).contains("Hi!")
            }
        }
    }
}
