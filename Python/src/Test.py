# -*- coding: utf-8 -*-
'''
Created on 19 mars 2018

@author: bden
'''

def testAge(): 
    try :
        b=input("Entre votre age")
        b=int(b)
    except:
        print("Age invalide")  
        b=testAge()
    return b

films = {}
films["IT"]=[4,18]
films["STAR WARS"]=[3,10]
films["MICKEY"]=[3,0]
films["HUNGER GAMES"]=[1,150]
test=True
c=[]

#print (films["it"][0])
while True:
    test=True
    for key in films:
        print(key)
    while test:
        a=input("Quel film voulez vous voir").upper();
        for key in films:
            if (a==key):
                test=False
        if test==True:
            print("Le film ne fait pas parti de la liste")
            
   
    c.append(testAge())
    
    if  c[len(c)-1]<films[a][1]:
        print("Trop jeune reviens dans",end=" ")
        print (films[a][1]-c[len(c)-1],end="")
        print ("ans")
    else:
        if films[a][0]-1>=0:
            films[a][0]= films[a][0]-1
            print ("Vous avez bien achet� la place pour ",end=" ")
            print(a)
        else:
            print("Il n'y a plus de place pour",end=" ")
            print(a)
