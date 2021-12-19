package sergey.ermakov.form;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

@RestController
public class Controller {
    ArrayList<form> arr=new ArrayList<>();

    @PostMapping("form/post")
    public void postform(@RequestBody form Form) {
        arr.add(Form);
        Collections.sort(arr, new Comparator<form>() {
            @Override
            public int compare(form o1, form o2) {
                if (o1.getName().compareTo(o2.getName())>0){
                    return 1;
                } else {
                    return  -1;
                }
            }
        });
    }

    @GetMapping("form/get")
    public ArrayList<form> getforms(){
        return arr;
    }

}
