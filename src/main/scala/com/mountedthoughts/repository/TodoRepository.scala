
package com.mountedthoughts.repository
import com.mountedthoughts.model.{User, Todo}
import slick.jdbc.H2Profile.api.Database


trait TodoRepository(val db: Database)
  def findAll(user: User): List[Todo]
