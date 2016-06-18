import scalaj.http.Http
val url = "http://localhost:2020/jobs?appName=test&classPath=spark.jobserver.WordCountExample&sync=true"
val data = "input.string = a b c a b a a a see"
val q = Http(url).postData(data).header("content-type", "application/json").asString