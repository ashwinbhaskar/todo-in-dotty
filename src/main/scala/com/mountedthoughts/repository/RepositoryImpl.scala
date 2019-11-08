package com
package mountedthoughts
package repository

import com.mountedthoughts.model.{User, Todo}
import slick.jdbc.H2Profile.api._

class ReposiroryImpl(database: Database) extends TodoRepository(db = database)
  def findAll(user: User): List[Todo] = List()