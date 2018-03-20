# -*- coding: utf-8 -*-
import sqlite3
connexion=sqlite3.connect("jobs.db")
curseur=connexion.cursor()
curseur2=connexion.cursor()
requete="SELECT * FROM recent_grads ;"
curseur.execute(requete)

resultat=curseur.fetchall()
names=[description[0] for description in curseur.description]
print(names)
for x in range (0,5):
    print(resultat[x])
