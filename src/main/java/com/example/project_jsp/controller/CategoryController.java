package com.example.project_jsp.controller;

import com.example.project_jsp.model.Category;
import com.example.project_jsp.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.relational.core.sql.In;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    @RequestMapping("/select_category")
    public ModelAndView getAll(){
        ModelAndView mv = new ModelAndView("/category/get_category");
        mv.addObject("category",categoryService.selectAll());
        return mv;
    }
    @PostMapping("/create_category")
    public String insert(){ return "category/insert_cotegory";}
    @RequestMapping("/insert_category")
    public ModelAndView create(@RequestParam("name")String name){
        categoryService.insert(new Category(name));
        return getAll();
    }
    @RequestMapping("/update_category")
    public ModelAndView update(){
        ModelAndView mv = new ModelAndView("/category/update_cotegory");
        mv.addObject("category",categoryService.selectAll());
        return mv;
    }
    @RequestMapping("/update_category2/{id}")
    public ModelAndView update2(@PathVariable("id")Integer id){
        ModelAndView mv = new ModelAndView("/category/update_category2");
        mv.addObject("category",categoryService.selectById(id));
        return mv;
    }
    @RequestMapping("/update_category3/{id}")
    public ModelAndView update3(@PathVariable("id")Integer id, @RequestParam("name")String name){
        categoryService.update(id,new Category(name));
        return update();
    }
    @RequestMapping("/delete_category")
    public ModelAndView delete(){
        ModelAndView mv = new ModelAndView("/category/delete_category");
        mv.addObject("category",categoryService.selectAll());
        return mv;
    }
    @RequestMapping("/delete_category2/{id}")
    public ModelAndView delete2(@PathVariable("id")Integer id){
        categoryService.delete(id);
        return delete();
    }

}
