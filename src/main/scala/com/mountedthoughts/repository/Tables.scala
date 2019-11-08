package com
package mountedthoughts
package repository

import slick.jdbc.H2Profile.api._
import com.mountedthoughts.model.User

class UserTable(tag: Tag) extends Table[User](tag, "user") {
  def id = column[Long]("id", O.PrimaryKey, O.AutoInc)
  def firstName = column[String]("first_name")
  def lastName = column[String]("last_name")
  def * = (firstName, lastName, id).mapTo[User]
}