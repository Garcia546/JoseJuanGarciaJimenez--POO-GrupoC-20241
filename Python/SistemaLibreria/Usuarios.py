import random
class Usuarios:
    __id = 0
    __name = ""
    __age = 0
    __librosRentados = []

    def __init__(self, name, age, id ):
        self.__id = random.randint(1,1000)
        self.__name = name
        self.__age = age
        self.__librosRentados = []
    
    def getId(self):
        return self.__id
    
    def setId(self, id):
        self.__id =id
    
    def getName(self):
        return self.__name
    
    def setName(self, name):
        self.__name = name
    
    def getAge(self):
        return self.__age
    
    def setAge(self, age):
        self.__age =age
    
    def getLibrosRentados(self):
        return self.__librosRentados
    
    def rentarLibro(self, nuevoLibro):
         self.__librosRentados.append(nuevoLibro)

    

