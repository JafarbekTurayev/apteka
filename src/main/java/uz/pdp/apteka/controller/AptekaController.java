package uz.pdp.apteka.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import uz.pdp.apteka.dto.AptekaDTO;
import uz.pdp.apteka.dto.Response;
import uz.pdp.apteka.entity.Apteka;
import uz.pdp.apteka.service.AptekaService;

import java.util.List;

@Controller
@RequestMapping("/apteka")
public class AptekaController {
    final AptekaService aptekaServicel;

    public AptekaController(AptekaService aptekaServicel) {
        this.aptekaServicel = aptekaServicel;
    }

    @GetMapping("/add")
    public String aptekaPage(Model model){

        List<Apteka>aptekaList=aptekaServicel.getAll();
        model.addAttribute("aptekaList",aptekaList);
        return "addApteka";
    }


    @PostMapping("/add")
    public String saveApteka(@ModelAttribute AptekaDTO aptekaDTO,Model model){
        Response response=aptekaServicel.save(aptekaDTO);
        model.addAttribute("message",response.getMessage());
        List<Apteka>aptekaList=aptekaServicel.getAll();
        model.addAttribute("aptekaList",aptekaList);
        return "addApteka";
    }

}
