package edu.bsu.cs222;

public class SillyMethods {



    public String countTo(int count) {
        int num;
        StringBuilder list = new StringBuilder();

        for (num = 0; num <= count; num++) {
            list.append(num);
            if (num == count) {
                return list.toString();
            }else{
                list.append(" ");
            }
        }
        return list.toString();
    }

    public boolean didGuess42(int i) {
        if (i == 42){
            return true;
        } else {
            return false;
        }
    }
}
