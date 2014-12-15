-Actividad 2. Programa multi-flujo
Esta actividad tiene la finalidad de crear un programa en el cual se creen diferentes hilos para 
realizar un programa con m�ltiple flujo de ejecuci�n. 

Prop�sito: Crear y manipular hilos en un programa que muestre diferentes flujos de ejecuci�n 
de un programa.
Instrucciones:


1.  Identifica la estructura algor�tmica (pasos) y sint�ctica (c�digo) para la creaci�n de hilos, 
esto lo encontrar�s en el material referenciado en la unidad 2, Tema 2.2. Programas de flujo 
m�ltiple, puedes identificarlo tambi�n en los ejemplos de c�digo presentados en dicha 
unidad, analizando el c�digo y los comentarios con que este cuenta.  

Crea un proyecto en el IDE NetBeans, dentro del proyecto debes crear las clases 
correspondientes a un programa, donde crees al menos dos diferentes hilos y se muestre el 
m�ltiple flujo de ejecuci�n del programa con una impresi�n del resultado en pantalla.

----
Actualmente proteger la informaci�n es esencial por lo que se cre� un programa que utilizando streams puede guardar  informaci�n cifrada en archivos.
Utilizaci�n de streams al escribir la informaci�n en un archivo:
1.	Se crea una clase FileOutputStream y se inicializa con un objeto del tipo File.
2.	Se conecta FileOutputStream a CipherOutputStream para cifrar la informaci�n.
3.	CipherOutputStream se conecta con OutputStreamWriter y se escribe la informaci�n.

![1](http://i.imgur.com/MAkzCjc.png)

Para leer la informaci�n cifrada:
1.	Se crea un objeto de la clase ByteArrayOutputStream
2.	Con FileInputStream se leen los bytes del archivo y se escriben a ByteArrayOutputStream.
3.	Se pasan los bits al descifrador.
4.	Se descifra el texto guardado.

![2](http://i.imgur.com/vvnSfiB.png)