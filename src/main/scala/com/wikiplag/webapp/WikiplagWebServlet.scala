package com.wikiplag.webapp

import com.wikiplag.webapp.models.{InitInput, InitInputData}
import org.scalatra._
import scalate.ScalateSupport

import org.json4s.{DefaultFormats, Formats}
import org.scalatra.json._


class WikiplagWebServlet extends WikiplagWebAppStack with ScalateSupport with JacksonJsonSupport{
  protected implicit val jsonFormats: Formats = DefaultFormats


  get("/") {
    <html>
      <body>
        <h1>Hello, world!</h1>
        <form action="/handleInput" method="post">
          <div>
            <label for="msg">Text:</label>
            <textarea id="msg" name="text"></textarea>
          </div>
          <div class="button">
            <button type="submit">Send your message</button>
          </div>
        </form>
      </body>
    </html>
  }
  post("/handleInput") {
    contentType = formats("json")
    InitInput(params("text")).getResult()
  }

}
