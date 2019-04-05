package domain.entity

import play.api.libs.json.{JsString, Writes}

/**
  * 画像ID
  *
  * @param value 画像IDの値
  */
case class PictureId(value: Long)

object PictureId {
  implicit val writes: Writes[PictureId] = Writes(id => JsString(id.value.toString))
}
