package sk.energodata.DataBridge.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sk.energodata.DataBridge.Models.Unipi;
import sk.energodata.DataBridge.Services.UnipiDataAccess;
import java.time.LocalDateTime;
import java.util.List;

@RestController
public class HelloWorldController {
    @Autowired
    UnipiDataAccess unipiDataAccess;
    @GetMapping("/hello")
    public List<Unipi> HelloWorld() {
        return unipiDataAccess.getUnipiWithValuesFromTo(LocalDateTime.now().minusMinutes(10), LocalDateTime.now());
    }
}
