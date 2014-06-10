package com.numbered.calc;

import java.util.Arrays;
import java.util.ArrayDeque;
import java.util.Deque;

public class calculation {
    Deque<String> calc;
    Deque<String> tempanswer;
    double answer;

    calculation(){
        calc = new ArrayDeque<String>();
    }

    boolean addcalc(Double newNum){
        calc.push(newNum.toString());
        return true;
    }

    boolean addcalc(String newOp)
    {
        if(isOp(newOp))
        {
            calc.push(newOp);
            return true;
        }
        return false;
    }

    boolean isOp(String testOp) {
        String availOps[] = new String[]{"mul", "div", "add", "sub" };
        return Arrays.asList(availOps).contains(testOp);
    }

    double calcAnswer(){
        tempanswer = calc;
        answer = 0.0;
        while(!calc.isEmpty()){
            //calculate using BOMDAS
            //use isOp to check wether its a op or a number
        }
        return answer;
    }


}
