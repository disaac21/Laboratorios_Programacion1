package examen2p1_danieljuarez;

public class Word {
    
    String cadenainword;
    String cadenatomain;
    Stack fromStack = new Stack();
    
    public Word() {
        cadenatomain = "";
    }
    
    public void setCadenainword(String cadenafrominput) {
        this.cadenainword = cadenafrominput;
    }
    
    public String AddingPrint(String cadenafrominput){
        for (int i = 0; i < cadenafrominput.length(); i++) {
            fromStack.Almacen.add(0,cadenafrominput.charAt(i));
        }
        String ToBeSent = "";
        for (int i = 0; i < fromStack.Almacen.size(); i++) {
            ToBeSent += fromStack.Almacen.get(i);
//            System.out.println("["+i+"]=["+fromStack.Almacen.get(i)+"]");
        }
        return ToBeSent;
    }
    
    public void Reverse() {
        for (int i = 0; i < cadenainword.length(); i++) {
            char Two = cadenainword.charAt(i);
            fromStack.Push(Two);
        }
        //separar
        //add contador para y primer size
        int AlmacenOGSize = fromStack.Size();
        int AlmacenSize[] = new int[AlmacenOGSize];
        int controller = 1;
        while (AlmacenOGSize >= controller) {
            cadenatomain = cadenatomain + fromStack.Pop();
//            for (int i = 0; i < 10; i++) {
//                cadenatomain += AlmacenSize[i];
//            }
            controller++;
        }

//        for (int i = 1; i <= fromStack.Size(); i++) {
//            cadenatomain = cadenatomain + fromStack.Pop();
//        }
    }
    
    public String SentFromWord() {
        return cadenatomain;
    }
    
}
