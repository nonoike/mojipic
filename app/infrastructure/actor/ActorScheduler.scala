package infrastructure.actor

import akka.actor.{ActorRef, ActorSystem}
import javax.inject.{Inject, Named, Singleton}

import scala.concurrent.duration._
import scala.concurrent.ExecutionContext.Implicits.global

@Singleton
class ActorScheduler @Inject()(
                                @Named("convert-picture-actor") convertPictureActor: ActorRef,
                                system: ActorSystem
                              ) {
  system.scheduler.schedule(0.milliseconds, 500.milliseconds) {
    convertPictureActor ! ConvertPictureActorMessage
  }

}
