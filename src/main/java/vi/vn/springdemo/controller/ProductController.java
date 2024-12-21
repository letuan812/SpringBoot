package vi.vn.springdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import vi.vn.springdemo.entity.Product;
import vi.vn.springdemo.service.ProductService;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductService service;


    @RequestMapping("/product")
    public String viewHomePage(Model model) {
        List<Product> listProducts = service.listAll();
        model.addAttribute("listProduct", listProducts);
        return "index";
    }
}
