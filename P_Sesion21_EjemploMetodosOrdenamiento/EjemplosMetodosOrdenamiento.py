from random import random
import timeit
from pip._vendor.distlib.compat import raw_input
from _overlapped import NULL

class MetodosOrdenamiento:
    
    aux = 0;
    
    

     


#=====================================================================================================================================
#=====================================================================================================================================


mo = MetodosOrdenamiento

lista = [6, 4, 1, 10, 5, 9, 7, 2, 8, 3]

mo.mostrarVector(None, mo.vector1000(None).copy())
#mo.mostrarVector(None, lista)

opcion = 0

while(opcion != 10):
    
    print("\n                          M E N U")
    print()
    print("1) Ordenamiento Burbuja.")
    print("2) Ordenamiento Por Seleccion.")
    print("3) Ordenamiento Por Insercion.")
    print("10) Salir.")
    print()
    opcion = int(raw_input("Elija una opcion: "))
    
    if(opcion == 1):
        
        print()
        print("=========== ORDENAMIENTO CON BURBUJA 1 ===========")
        #mo.ordenamientoBurbuja1(None, lista)
        mo.ordenamientoBurbuja1(None, mo.vector1000(None).copy())
        mo.ordenamientoBurbuja1(None, mo.vector10000(None).copy())
        mo.ordenamientoBurbuja1(None, mo.vector100000(None).copy())
        mo.ordenamientoBurbuja1(None, mo.vector1000000().copy())
        #mo.ordenamientoBurbuja1(None, lista)
                    
        print()
        print("---------------------------------------------------------------------------------")
        print()
                 
        print("=========== ORDENAMIENTO CON BURBUJA 2 ===========")
        mo.ordenamientoBurbuja2(None, mo.vector1000(None).copy())
        mo.ordenamientoBurbuja2(None, mo.vector10000(None).copy())
        mo.ordenamientoBurbuja2(None, mo.vector100000(None).copy())
        mo.ordenamientoBurbuja2(None, mo.vector1000000(None).copy())
        #mo.ordenamientoBurbuja2(None, lista)
                
        print()
        print("---------------------------------------------------------------------------------")
        print()
                  
        print("=========== ORDENAMIENTO CON BURBUJA 3 ===========")   
        mo.ordenamientoBurbuja3(None, mo.vector1000(None).copy())
        mo.ordenamientoBurbuja3(None, mo.vector10000(None).copy())
        mo.ordenamientoBurbuja3(None, mo.vector100000(None).copy())
        mo.ordenamientoBurbuja3(None, mo.vector1000000(None).copy())
        #mo.ordenamientoBurbuja3(None, lista)
                
        print()
        print("---------------------------------------------------------------------------------")
        print()
    elif(opcion == 2):
        
        print()
        print("---------------------------------------------------------------------------------")
        print()
                    
        print("=========== ORDENAMIENTO POR SELECCION ===========")  
        mo.ordenamientoPorSeleccion(None, mo.vector1000(None).copy())
        mo.ordenamientoPorSeleccion(None, mo.vector10000(None).copy())
        mo.ordenamientoPorSeleccion(None, mo.vector100000(None).copy())
        mo.ordenamientoPorSeleccion(None, mo.vector1000000(None).copy())
        #mo.ordenamientoPorSeleccion(None, lista)
        
        print()
        print("---------------------------------------------------------------------------------")
        print()
        
    elif(opcion == 3):
        
        print()
        print("---------------------------------------------------------------------------------")
        print()
                
        print("=========== ORDENAMIENTO POR INSERCION ===========")
        mo.ordenamientoPorInsercion(None, mo.vector1000(None).copy())
        mo.ordenamientoPorInsercion(None, mo.vector10000(None).copy())
        mo.ordenamientoPorinsercion(None, mo.vector100000(None).copy())
        mo.ordenamientoPorInsercion(None, mo.vector1000000(None).copy())
        #mo.ordenamientoPorInsercion(None, lista)
        
        print()
        print("---------------------------------------------------------------------------------")
        print()         
    
    elif(opcion == 0):
        print("S A L I E N D O . . .")
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    