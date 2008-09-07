import javax.servlet._
import javax.servlet.http._
class HelloWorldServlet extends HttpServlet {
  override def doGet(req: HttpServletRequest, res: HttpServletResponse) {
    val title = "HelloWorldServlet"
    val message = "Hello, world!"
    val content =
      <html>
        <head><title>{title}</title></head>
        <body>
          <h1>{title}</h1>
          <p>{message}</p>
        </body>
      </html>
    res.setContentType("text/html; charset=utf-8")
    res.getWriter.print(content)
  }
}
