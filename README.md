-Actividad 2. Programa multi-flujo
Esta actividad tiene la finalidad de crear un programa en el cual se creen diferentes hilos para 
realizar un programa con múltiple flujo de ejecución. 

Propósito: Crear y manipular hilos en un programa que muestre diferentes flujos de ejecución 
de un programa.
Instrucciones:


1.  Identifica la estructura algorítmica (pasos) y sintáctica (código) para la creación de hilos, 
esto lo encontrarás en el material referenciado en la unidad 2, Tema 2.2. Programas de flujo 
múltiple, puedes identificarlo también en los ejemplos de código presentados en dicha 
unidad, analizando el código y los comentarios con que este cuenta.  

Crea un proyecto en el IDE NetBeans, dentro del proyecto debes crear las clases 
correspondientes a un programa, donde crees al menos dos diferentes hilos y se muestre el 
múltiple flujo de ejecución del programa con una impresión del resultado en pantalla.

----
Actualmente proteger la información es esencial por lo que se creó un programa que utilizando streams puede guardar  información cifrada en archivos.
Utilización de streams al escribir la información en un archivo:
1.	Se crea una clase FileOutputStream y se inicializa con un objeto del tipo File.
2.	Se conecta FileOutputStream a CipherOutputStream para cifrar la información.
3.	CipherOutputStream se conecta con OutputStreamWriter y se escribe la información.

![1](http://i.imgur.com/MAkzCjc.png)

Para leer la información cifrada:
1.	Se crea un objeto de la clase ByteArrayOutputStream
2.	Con FileInputStream se leen los bytes del archivo y se escriben a ByteArrayOutputStream.
3.	Se pasan los bits al descifrador.
4.	Se descifra el texto guardado.

![2](http://i.imgur.com/vvnSfiB.png)