package examen2p1_danieljuarez;

import java.util.ArrayList;

public class Stack {

    ArrayList<Character> Almacen = new ArrayList();

    public Stack() {
        this.Almacen = new ArrayList<>();
    }

    //Pending de Usar
    public char Peek() {
        return Almacen.get(0);
    }

    public char Pop() {
        char ExtraerPop = Almacen.get(0);
        Almacen.remove(0);
        return ExtraerPop;
    }

    public char Push(char One) {
        Almacen.add(0, One);
        char In = Almacen.get(0);
        return In;
    }

    public int Size() {
        return Almacen.size();
    }
    
//    public void AgregandoPlus(){
//        System.out.println(Almacen.size());
//        for (int i = 0; i < Almacen.size(); i++) {
//            System.out.println(Almacen.get(i));
//        }
//    }

}
