package com.main.serials.Controllers;

import com.main.serials.Dao.SerialsDao;
import com.main.serials.Models.Serial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;


@Controller
@RequestMapping(value = "/")
public class SerialController {

    private final SerialsDao serialsDao;
    public SerialController(SerialsDao serialsDao){
        this.serialsDao = serialsDao;
    }
//    @GetMapping("/")
//    public ResponseEntity<Object> getOneParameterMap() {
//        return ResponseEntity.status(HttpStatus.CREATED).body(
//                Collections.singletonMap("key", "value"));
//    }
    @GetMapping(value = "",produces = "application/json")
    public @ResponseBody List<Serial> getSerials(@RequestParam String name) {
        return serialsDao.findByName(name);
    }
    @PostMapping("/add/")
    @ResponseBody
    public void addSerial(@RequestParam String serialName,@RequestParam List<Object> creator, @RequestParam String mark) {
        Serial newSerial = new Serial(serialName, creator, mark);
        serialsDao.insert(newSerial);
    }
    @PostMapping("/delete/")
    @ResponseBody
    public void deleteSerial(@RequestParam String  id) {

        serialsDao.deleteById(id);
    }
    @GetMapping("/index")
    public String index() {

        return "Index.html";
    }

}
