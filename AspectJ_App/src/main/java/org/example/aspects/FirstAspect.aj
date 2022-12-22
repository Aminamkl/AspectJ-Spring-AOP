package org.example.aspects;

public aspect FirstAspect {
    pointcut pc1():execution(* test.Application.main(..));

    before():pc1(){
        System.out.println("------------------------------------------");
        System.out.println("Befor main from Aspect with AspectJ syntax");
        System.out.println("------------------------------------------");
    }
    after():pc1(){
        System.out.println("------------------------------------------");
        System.out.println("After main from Aspect with AspectJ syntax");
        System.out.println("------------------------------------------");
    }
}
