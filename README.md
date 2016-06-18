# apache spark job server with webapp #
  A very simple example of word count job(See example in https://github.com/spark-jobserver/spark-jobserver).
  Input from a form will launch job WordCountExample. A json response will appear, once job is done.

## Build & Run ##

```sh
$ cd apache-spark-job-server-with-web-app
$ ./sbt
> jetty:start
> browse
```

If `browse` doesn't launch your browser, manually open [http://localhost:8080/](http://localhost:8080/) in your browser.
