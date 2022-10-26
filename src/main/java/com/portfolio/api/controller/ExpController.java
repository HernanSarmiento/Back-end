package com.portfolio.api.controller;

import com.portfolio.api.model.Exp;
import com.portfolio.api.services.IExpService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class ExpController {
    
    @Autowired
    private IExpService interExp;
    
    
    @GetMapping("/traer")
      public List<Exp> getExp(){
          return (List<Exp>) interExp.getExp();
      }

    @PostMapping("/guardar")
    public String crearExp(@RequestBody Exp exp){
        interExp.saveExp(exp);
        return "La experiencia se guardo satisfactoriamente";
    }
      
    @DeleteMapping("/borrar/{id}")
    public String borrarExp(@PathVariable Long id){
        interExp.deleteExp(id);
        return "Experiencia borrada satisfactoriamente";
    }
    
    @PutMapping("/actualizar/{id}")
    public Exp actualizarExp(@PathVariable Long id,
       @RequestParam ("empresa") String Nuevaempresa,
       @RequestParam ("rol") String Nuevorol){

        Exp exp = interExp.findExp(id);
        
        exp.setEmpresa(Nuevaempresa);
        exp.setRol(Nuevorol);
        
        interExp.saveExp(exp);
        
        return exp;

    }
    
    
}
