package org.ptss.support.infrastructure.repositories

import jakarta.inject.Inject
import org.ptss.support.infrastructure.config.PostgreSQLConfig
import java.sql.Connection
import java.sql.DriverManager

abstract class BaseRepository<T> {
    @Inject
    protected lateinit var config: PostgreSQLConfig

    protected fun getConnection(): Connection {
        return DriverManager.getConnection(
            config.url(),
            config.username(),
            config.password(),
        )
    }

    fun <R> useConnection(block: (Connection) -> R): R {
        return getConnection().use { conn ->
            block(conn)
        }
    }
}
