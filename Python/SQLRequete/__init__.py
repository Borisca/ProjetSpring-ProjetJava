# -*- coding: utf-8 -*-
import sqlite3
connexion=sqlite3.connect("jobs.db")
curseur=connexion.cursor()
requete="SELECT major FROM recent_grads Order by major desc;"
curseur.execute(requete)
resultat=curseur.fetchall()
names=[description[0] for description in curseur.description]
print(names[0])
for x in resultat:
    print(x[0])

connexion.close()