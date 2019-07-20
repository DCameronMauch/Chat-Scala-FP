package com.github.dcameronmauch.scala_http4s_zio

import cats.effect._
import cats.implicits._
import org.http4s._
import org.http4s.dsl.io._
import org.http4s.implicits._
import org.http4s.server.blaze._


//import cats.effect._
//
//import io.circe._
//import io.circe.generic.auto._
//import io.circe.syntax._
//
//import org.http4s.circe._

object Main extends IOApp {

  case class Request(name: String)

  object Response {
    def apply(request: Request): Response =
      Response(s"Hello ${request.name}!")
  }

  case class Response(greeting: String)

  private val service = HttpRoutes.of[IO] {
    case json @ POST -> Root / "hello" / name => for {
      request <- json.as[Request]
      response <- Ok(Response(request).asJson)
    } yield response
  }.orNotFound

  def run(args: List[String]): IO[ExitCode] =
    BlazeServerBuilder[IO]
      .bindHttp(8080, "localhost")
      .withHttpApp(service)
      .resource
      .use(_ => IO.never)
      .as(ExitCode.Success)
}