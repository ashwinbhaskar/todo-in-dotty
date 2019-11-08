package com
package mountedthoughts
package repository

import slick.jdbc.H2Profile.api._
import com.mountedthoughts.model.User

class UserTable(tag: Tag) extends Table[User](tag, "user") {
  def id = column[Long]("id", O.PrimaryKey, O.AutoInc)
  def firstName = column[String]("first_name")
  def lastName = column[String]("last_name")
  /*
  This scala 2 code cannot be used in dotty.
  def * = (firstName, lastName, id).mapTo[User]

  It gives the following errors and warnins
  [warn] -- Feature Warning: /Users/ashwinbhaskar/source_code/todo-in-dotty/src/main/scala/com/mountedthoughts/repository/Tables.scala:12:10
[warn] 12 |  def * = (firstName, lastName, id).mapTo[User]
[warn]    |          ^^^^^^^^^^^^^^^^^^^^^^^^^
[warn]    |Use of implicit conversion method anyToShapedValue in trait API should be enabled
[warn]    |by making the implicit value scala.language.implicitConversions visible.
[warn]    |This can be achieved by adding the import clause 'import scala.language.implicitConversions'
[warn]    |or by setting the compiler option -language:implicitConversions.
[warn]    |See the Scala docs for value scala.language.implicitConversions for a discussion
[warn]    |why the feature should be explicitly enabled.
[error] -- Error: /Users/ashwinbhaskar/source_code/todo-in-dotty/src/main/scala/com/mountedthoughts/repository/Tables.scala:12:10
[error] 12 |  def * = (firstName, lastName, id).mapTo[User]
[error]    |          ^
[error]    |Scala 2 macro cannot be used in Dotty. See https://dotty.epfl.ch/docs/reference/dropped-features/macros.html\n"
[error]    |To turn this error into a warning, pass -Xignore-scala2-macros to the compiler
  */
}