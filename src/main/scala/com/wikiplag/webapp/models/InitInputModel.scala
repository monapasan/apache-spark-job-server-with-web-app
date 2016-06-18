package com.wikiplag.webapp.models

import scalaj.http._


case class InitInput (text: String) {
  val data = "input.string = "
  val url = "http://localhost:2020/jobs?appName=test&classPath=spark.jobserver.WordCountExample&sync=true"
  def getResult(): String = {
    Http(url).postData(data + text).header("content-type", "application/json").asString.body
  }

}

object InitInputData {

}
