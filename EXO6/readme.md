# Pour compiler ce exo

1. make
2. Lancez le serveur de noms CORBA grâce à la commande :
	* ns -Djacorb.naming.ior_filename=/chemin/xxx/ns.ref
3. Dans un autre terminale lancez le serveur par :
	* jaco tpcorba.exo6.Serveur -ORBInitRef NameService=file:///home/xxx/ns.ref
4. Dans un 3 terminale lancez le serveur par :
        * jaco tpcorba.exo6.INIT -ORBInitRef NameService=file:///home/xxx/ns.ref
5. Dans le même terminale avec la commande :
	$> nmg -ORBInitRef NameService=file:///home/xxx/ns.ref
	ou la commande :
	$> lsns -ORBInitRef NameService=file:///home/xxx/ns.ref 



