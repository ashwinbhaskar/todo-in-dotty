package com.mountedthoughts.model

case class User(id: Long, firstName: String, lastName: String)

case class Todo(id: Int, title: String, completed: Boolean)