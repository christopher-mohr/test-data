package test.data

import io.micronaut.http.HttpResponse
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

import javax.inject.Inject

@Controller("/hello")
class HelloController {

    private final InformationCenter informationCenter

    @Inject TransactionStatusRepository repository

    @Inject
    HelloController(InformationCenter informationCenter) {
        this.informationCenter = informationCenter
    }

    @Get(produces = MediaType.TEXT_PLAIN)
    HttpResponse index() {
        return HttpResponse.ok(informationCenter.getHelloContent())
    }
}