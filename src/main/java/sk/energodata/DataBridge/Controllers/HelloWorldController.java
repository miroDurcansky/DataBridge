package sk.energodata.DataBridge.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sk.energodata.DataBridge.Models.Unipi;
import sk.energodata.DataBridge.Services.UnipiDao;

import java.time.LocalDateTime;
import java.util.List;

@RestController
public class HelloWorldController {

    @Autowired
    UnipiDao unipiDao;

    @GetMapping("/hello")
    public List<Unipi> HelloWorld() {

        return unipiDao.getUnipiWithValuesFromTo(LocalDateTime.now().minusMinutes(10), LocalDateTime.now());
    }
}
