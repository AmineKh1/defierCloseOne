package com.company;

import java.util.*;

public class Main {
    static int distance(Enfants enfant, Box box)
    {
        int xD;
        int yD;
        xD = enfant.x - box.x;
        yD = enfant.y - box.y;
        if (xD < 0){
            xD = xD * -1;
        }
        if (yD < 0){
            yD = yD * -1;
        }
        return xD + yD;
    }
    static Box closeBox(Enfants e, Collection<Box> boxs)
    {
        Box b = null;
        Collection<Integer> distColl = new HashSet<Integer>();
        for (Box box: boxs) {
            distColl.add(distance(e,box));
            if(Collections.min(distColl) == distance(e, box))
            {
                b = box;
            }
        }

        return b;
    }

    public static void main(String[] args) {
	// write your code here
        Collection<Enfants> colEnfants = new HashSet<Enfants>();
        Enfants a = new Enfants(1, 2);
        Enfants b = new Enfants(4, 9);
        Enfants c = new Enfants(-1, 0);
        Enfants d = new Enfants(6, 8);
        colEnfants.add(a);
        colEnfants.add(b);
        colEnfants.add(c);
        colEnfants.add(d);

        Collection<Box> colBoxs = new HashSet<Box>();
        Box e = new Box(1, 3);
        Box f = new Box(6, 9);
        Box j = new Box(-5, 6);
        Box h = new Box(6, 7);
        colBoxs.add(e);
        colBoxs.add(f);
        colBoxs.add(j);
        colBoxs.add(h);
        Box closeB = closeBox(a, colBoxs);
        System.out.println("the close one to (" + a.x +  "," + a.y + ") is (" + closeB.x + ","
                + closeB.y + ").");
    }

}

