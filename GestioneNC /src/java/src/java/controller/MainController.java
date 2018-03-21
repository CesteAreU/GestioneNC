/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import model.Lotto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.LottoServiceImpl;

/**
 *
 * @author Andrea Frasson
 */
@Controller
@RequestMapping("/")
@ComponentScan("service")
public class MainController {
    
    
    @RequestMapping(value={"/",""},  method = RequestMethod.GET)
    public String start(ModelMap map){
        return "index";
    }
}
