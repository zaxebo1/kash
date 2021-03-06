package com.beust.kash

import com.google.inject.AbstractModule
import com.google.inject.Inject
import com.google.inject.Provider
import com.google.inject.Singleton
import org.jline.terminal.Terminal
import org.jline.terminal.TerminalBuilder
import javax.script.ScriptEngine
import javax.script.ScriptEngineManager

class ScriptEngineProvider @Inject constructor(): Provider<ScriptEngine> {
    override fun get(): ScriptEngine {
        val result = ScriptEngineManager().getEngineByExtension("kash.kts")
        return result ?: throw IllegalArgumentException("Couldn't find a script engine for .kash.kts")
    }
}

class KashModule() : AbstractModule() {
    override fun configure() {
        bind(Terminal::class.java).toInstance(TerminalBuilder.builder().build())
        bind(ScriptEngine::class.java).toProvider(ScriptEngineProvider::class.java).`in`(Singleton::class.java)
    }
}