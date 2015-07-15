/**
 * Created by Dman on 7/14/15.
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

class Main
{
    public static void main(String[] args){
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("I am a part of a lost generation");
        arrayList.add("and I refuse to believe that");
        arrayList.add("I can change the world");
        for (int i = 0; i < 3; i++)
            System.out.println(arrayList.get(i));
            System.out.println("");

        Stack<String> stacker = new Stack<String>();
        stacker.push("I am a part of a lost generation");
        stacker.push("and I refuse to believe that");
        stacker.push("I can change the world");
        while (stacker.empty()==false)
        {
            String offloadstacker = stacker.pop();
            System.out.println(offloadstacker);
        }


}
}
