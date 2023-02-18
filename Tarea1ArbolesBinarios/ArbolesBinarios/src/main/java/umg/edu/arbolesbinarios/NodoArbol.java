package umg.edu.arbolesbinarios;

public class NodoArbol {

    int data;
    NodoArbol LeftNodo;
    NodoArbol RightNodo;

    public NodoArbol(int dataNodo) {
        this.data = dataNodo;
        LeftNodo = null;
        RightNodo = null;
    }

    public int getData() {
        return data;
    }

    public NodoArbol getLeftNodo() {
        return LeftNodo;
    }

    public NodoArbol getRightNodo() {
        return RightNodo;
    }

    public void setData(int data) {
        this.data = data;
    }
    
    public void insert(int insert_data)
    {
        if(insert_data < this.data)
        {
           if(LeftNodo == null){
               LeftNodo = new NodoArbol(insert_data);
           }else{
               LeftNodo.insert(insert_data);
           }
        }else
        {
            if(RightNodo == null){
                RightNodo = new NodoArbol(insert_data); 
            }else{
                RightNodo.insert(insert_data);
            }
            
            }
        }
    }

}
