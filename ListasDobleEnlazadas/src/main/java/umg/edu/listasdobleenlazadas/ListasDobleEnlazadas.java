/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package umg.edu.listasdobleenlazadas;

/**
 *
 * @author Admin
 */


public class ListasDobleEnlazadas {
    
        Nodo firstNodo;
	Nodo lastNodo;
	ListasDobleEnlazadas()
	{
		firstNodo=null;
		lastNodo=null;
	}

	public boolean estavacio()
	{
		if(firstNodo==null) return true;
		else return false;
	}

	public ListasDobleEnlazadas alta(int dat)
	{
		if(estavacio())
		{
			Nodo nuevo=new Nodo(dat);
			firstNodo=nuevo;
			lastNodo=nuevo;
		}
		else
		{
			Nodo nuevo=new Nodo(dat);
			lastNodo.next=nuevo;
			nuevo.ant=lastNodo;
			lastNodo=nuevo;
		}
		return this;
	}

	public ListasDobleEnlazadas borrar(int a)
	{
		Nodo w=firstNodo;
		Nodo y;
		for(int i=0;i<a;i++)
		{
			y=w.ant;
			w=w.next;
		}
		y=w.ant;
		return this;
	}

	public boolean delete(int num)
	{
		Nodo anterior=null;
		Nodo actual=firstNodo;
		while(actual!=lastNodo)
		{
			if(actual.dato==num)
			{
				if(anterior==null)
				{
					firstNodo=actual.next;
					firstNodo.ant=null;
				}
				else{
					anterior.next=actual.next;
					Nodo temporal;
					temporal=actual.next;
					temporal.ant=anterior;
				}
				return true;
			}
			anterior=actual;
			actual=actual.next;
		}
		if(num==lastNodo.dato)
		{
			lastNodo=actual.ant;
			return true;
		}
		return false;
	}

        public void imprimir2()
	{
		Nodo actual;
		actual=lastNodo;
		while(actual!=firstNodo)
		{
			System.out.println(actual.dato);
			actual=actual.ant;
		}
                System.out.println(actual.dato);

	}
        public void imprimir()
	{
		Nodo actual;
		actual=firstNodo;
		while(actual!=lastNodo)
		{
			System.out.println(actual.dato);
			actual=actual.next;
		}
                System.out.println(actual.dato);
                
	}


    public static void main(String[] args) {
       ListasDobleEnlazadas listaDoble =new ListasDobleEnlazadas();
       
       int b=5; int c=10; int d=15; int e=20; int f=25;
       
       listaDoble.alta(b);
       listaDoble.alta(c);
       listaDoble.alta(d);
       listaDoble.alta(e);
       listaDoble.alta(f);
       listaDoble.imprimir2();
       listaDoble.delete(25);
       listaDoble.imprimir2();
    }
}
