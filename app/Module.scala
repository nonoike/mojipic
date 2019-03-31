import java.time.Clock

import com.google.inject.AbstractModule
import com.redis.RedisClient
import domain.repository.PicturePropertyRepository
import infrastructure.repository.PicturePropertyRepositoryImpl
import play.api.{Configuration, Environment}

class Module(
              environment: Environment,
              configuration: Configuration
            ) extends AbstractModule {

  override def configure(): Unit = {
    val redisHost = configuration.get[String]("redis.host")
    val redisPort = configuration.get[Int]("redis.port")

    bind(classOf[Clock]).toInstance(Clock.systemDefaultZone)
    bind(classOf[PicturePropertyRepository]).to(classOf[PicturePropertyRepositoryImpl])
    bind(classOf[RedisClient]).toInstance(new RedisClient(redisHost, redisPort))
  }
}
