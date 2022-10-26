package com.portfolio.api.services;

import com.portfolio.api.model.Exp;
import java.util.List;



public interface IExpService {

    public List<Exp> getExp();
    
    public void saveExp(Exp exp);
    
    public void deleteExp(Long id);
    
    public Exp findExp(Long id);

}
