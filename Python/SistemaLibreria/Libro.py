
import random

class Libro:
    __id = 0
    __tittle = ""
    __autor = ""
    __rentado = False

    def __init__(self, tittle, autor, id, rentado ):
        self.__id = random.randint(1,1000)
        self.__tittle = tittle
        self.__autor = autor
        self.__rentado = False
    
    def getId(self):
        return self.__id
    
    def setId(self, id):
        self.__id = id
    
    def getTittle(self):
        return self.__tittle
    
    def setTittle(self, tittle):
        self.__tittle = tittle
    
    def getAutor(self):
        return self.__autor
    
    def setAutor(self, autor):
        self.__autor = autor

    def getRentado(self):
        return self.__rentado
    
    def setRentado(self, rentado):
        self.__rentado = rentado
    
    def rentar(self):
        self.__rentado = True