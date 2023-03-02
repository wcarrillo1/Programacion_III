package umg.edu.arbolesbinarios;

public class ArbolesBinarios {

    NodoArbol init;

    public ArbolesBinarios() {
        this.init = null;
    }
    
    public void insert(int insert_data){
        if(this.init == null){
            this.init = new NodoArbol(insert_data);
        }else{
            this.init.insert(insert_data);
        }
    }
    
    public void printPreOrden(){
        this.preOrder(this.init);
    }
    
    public void preOrder(NodoArbol nodo){
        if(nodo == null){
            return;
        }else{
           System.out.print(nodo.getData()+" ");
            preOrder(nodo.getLeftNodo());
            preOrder(nodo.getRightNodo());
           
        }
    }
    
    public void printInOrder(){
        this.inOrder(this.init);
    }
    
    public void inOrder(NodoArbol nodo){
        if(nodo == null){
            return;
        }else{
            inOrder(nodo.getLeftNodo());
            System.out.print(nodo.getData()+" ");
            inOrder(nodo.getRightNodo());
           
        }
    }
    
    
        public void printPostOrden(){
        this.postOrden(this.init);
    }
    
    public void postOrden(NodoArbol nodo){
        if(nodo == null){
            return;
        }else{
            postOrden(nodo.getLeftNodo());
            postOrden(nodo.getRightNodo());
            System.out.print(nodo.getData()+" ");      
           
        }
    }

    public static void main(String[] args) {
            
        ArbolesBinarios tree = new ArbolesBinarios();
        tree.insert(104);
        tree.insert(71);
        tree.insert(17);
        tree.insert(3);
        tree.insert(19);
        
        
        tree.insert(18);
        tree.insert(240);
        tree.insert(108);
        tree.insert(245);
        tree.insert(110);
        System.out.println("Recorrido InOrden : ");
        tree.printInOrder();
        System.out.println("");
        System.out.println("Recorrido PostOrden : ");
        tree.printPostOrden();
        System.out.println("");
        System.out.println("Recorrido Preorden : ");
        tree.printPreOrden(); 
        
    }
}
