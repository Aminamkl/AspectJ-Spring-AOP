package org.example.metier;

import org.example.aspects.Log;
import org.example.aspects.SecuredByAspect;
import org.springframework.stereotype.Component;

@Component
public class MetierImpl implements IMetier {
    @Override
    @Log
    public void process() {

        System.out.println("Business Processing ");
    }

    @Override
    @SecuredByAspect(roles = {"ADMIN","USER"})
    public double compute() {
        double data =80;
        System.out.println("Business Computing and Returning Result");
        return data;
    }

}
