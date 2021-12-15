package sergey.ermakov.form;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Controller {
    ArrayList<form> arr=new ArrayList<>();

    @PostMapping("form/post")
    public void postform(@RequestBody form Form){
        arr.add(Form);
    }

    @GetMapping("form/get")
    public ArrayList<form> getforms(){
        return arr;
    }

}
