package hello;

@RestController
public class GroovyHelloController {

    @RequestMapping("/")
    def hello() {
        return "Hello World"
    }

}