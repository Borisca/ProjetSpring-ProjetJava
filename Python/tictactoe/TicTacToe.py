# -*- coding: utf8 -*-
'''
Created on 20 mars 2018

@author: bden
'''


#Tuple creer une liste figée. Si elle est modifiée elle se range dans une autre adresse
a="o"
a=a+"n"
b="on"
o=0
index=[[0,0,0],[1,0,0],[2,0,0],[3,0,0],[4,0,0],[5,0,0],[6,0,0],[7,0,0],[8,0,0]]
#print(a is b)

horizontal=[[" "] * 6 for i in range(6)]


#tuple1=tuple(horizontal)
#print(hex(id(tuple1)))
#print(hex(id(horizontal)))

for i in range(0,len(horizontal)):   
    for j in range (0,len(horizontal)):
        if j%2==0 and i%2==0 :
            horizontal[i][j]="_"
        elif i%2!=0 and j%2!=0:
            horizontal[i][j]="|"
        elif i==1 and j%2==0:
            horizontal[i][j]=index[o][0]
            index[o][1]=i
            index[o][2]=j
            o+=1
        elif i==3 and j%2==0:
            horizontal[i][j]=index[o][0]
            index[o][1]=i
            index[o][2]=j
            o+=1
        elif i==5 and j%2==0:
            horizontal[i][j]=index[o][0]
            index[o][1]=i
            index[o][2]=j
            o+=1
        else:
            horizontal[i][j]=" "
               
for a in horizontal:
    for s in a:
        print (s,end="")    
    print("")

#tuple1=tuple(horizontal)
#print(hex(id(tuple1)))
#print(hex(id(horizontal)))
a =["Paris","Marseille","La rochelle"]
joueur=True
while (True):
    place=" "
    test=True
    test2=True
    
#joueur 1    
    if joueur:
        while test:
            while test2:
                place=input("Joueur 1 choisir ou jouer")
                if place.isdigit():
                    test2=False
            place=int(place)
            if place>=0 and place <=8 and type(horizontal[index[place][1]][index[place][2]])==type(1):
                test=False 
            else:
                test2=True;   
        horizontal[index[place][1]][index[place][2]]="X"
        joueur=False
        
#joueur 2  
    else:      
        while test:
            while test2:
                place=input("Joueur 2 choisir ou jouer")
                if place.isdigit():
                    test2=False
            place=int(place)
            if place>=0 and place <=8 and  type(horizontal[index[place][1]][index[place][2]])==type(1):
                test=False 
            else:
                test2=True;
        horizontal[index[place][1]][index[place][2]]="O"
        joueur=True
        
    for a in horizontal:
        for s in a:
            print (s,end="")    
        print("")