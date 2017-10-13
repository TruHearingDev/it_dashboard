package dashboard;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @RequestMapping(value = "/status", method = RequestMethod.GET)
    public String status() {
        return "Application is running";
    }
    
    @RequestMapping(value = "/circle", method = RequestMethod.POST)
    public CircleDTO circle(@RequestBody CircleDTO payload) {
    		System.out.println(payload);
    		return payload;
    }
    
}