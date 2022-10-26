package com.portfolio.api.services;

import com.portfolio.api.model.Exp;
import com.portfolio.api.repository.ExpRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExpService implements IExpService{
    @Autowired
    private ExpRepository expRepository;
    
    @Override
    public List<Exp>getExp(){
        List<Exp> listaExp=expRepository.findAll();
        return listaExp;
    }
    
    @Override
    public void saveExp(Exp exp){
        expRepository.save(exp);
    }
    
    @Override
    public void deleteExp(Long id){
        expRepository.deleteById(id);
    }

    @Override
    public Exp findExp(Long id){
        Exp exp=expRepository.findById(id).orElse(null);
        return exp;
    }
    
    
    
}
