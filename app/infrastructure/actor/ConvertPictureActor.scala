package infrastructure.actor

import akka.actor.Actor
import com.redis.RedisClient
import domain.repository.PicturePropertyRepository
import javax.inject.Inject
import play.api.Configuration

sealed trait ConvertPictureActorMessage

case object ConvertPictureActorMessage extends ConvertPictureActorMessage

class ConvertPictureActor @Inject()(
                                     redisClient: RedisClient,
                                     picturePropertyRepository: PicturePropertyRepository,
                                     configuration: Configuration
                                   ) extends Actor {

  override def receive: Receive = {
    case ConvertPictureActorMessage => {
      // TODO 画像変換処理の実装
      println("画像変換処理を実行")
    }
  }

}
