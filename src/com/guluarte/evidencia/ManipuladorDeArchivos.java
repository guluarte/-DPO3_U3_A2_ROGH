/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guluarte.evidencia;

import java.awt.List;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/**
 *
 * @author rodolfo
 */
class ManipuladorDeArchivos {
    
    private byte[] privateKey = "1234123412341234".getBytes();
    private SecretKey llaveSecreta = new SecretKeySpec(privateKey, "AES");
    private IvParameterSpec iv = new IvParameterSpec(new byte[]{ 0x00, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 
         0x07, 0x08, 0x09, 0x0a, 0x0b, 0x0c, 0x0d, 0x0e, 0x0f });

    
    File archivoActual = null;
    public ManipuladorDeArchivos() throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, InvalidAlgorithmParameterException {
        
        
    }

    boolean borrarArchivo(File archivo) {
        return archivo.delete();
    }

    public String leer(File archivo) throws Exception {
        
        if(archivo == null) {
            throw new IOException("Por favor selecciona un archivo");
        }
        
        this.archivoActual = archivo;
        String linea = null;
        String texto = null;

        int caracter;
        int position = 0;

        ByteArrayOutputStream byteStream = new ByteArrayOutputStream();

        try(FileInputStream fi = new FileInputStream(archivo)) {
            while( (caracter = fi.read()) != -1) {
                byteStream.write(caracter);
            }
        }

        final Cipher encripdator;
        encripdator = Cipher.getInstance("AES/CFB8/NoPadding");
        encripdator.init(Cipher.DECRYPT_MODE, llaveSecreta, iv);
        texto = new String(encripdator.doFinal(byteStream.toByteArray()), "UTF-8").trim();

       return texto;
    }

    boolean crear(File archivo) throws IOException {
        boolean resultado =  archivo.createNewFile();
        this.archivoActual = archivo;
        return resultado;
    }
    
    public String getNombreArchivoActual() {
        if(archivoActual != null) {
            return archivoActual.getAbsolutePath().toString();
        }
        return "";
    }

    void escribir(File archivo, String texto) throws IOException, InvalidKeyException, InvalidAlgorithmParameterException, NoSuchAlgorithmException, NoSuchPaddingException {
        this.archivoActual = archivo;
        
        FileOutputStream  fw = new FileOutputStream (archivo);
        
        final Cipher encripdator;
        encripdator = Cipher.getInstance("AES/CFB8/NoPadding");
        encripdator.init(Cipher.ENCRYPT_MODE, llaveSecreta, iv);
        
        CipherOutputStream cstream = new CipherOutputStream(fw, encripdator);
        
        OutputStreamWriter os = new OutputStreamWriter(cstream);
        os.write(texto);
        os.close();
    }

    boolean renombrarArchivo(File archivo, File destino) {
        if(!archivo.exists() || destino.exists()) {
            return false;
        }
        
        boolean resultado =  archivo.renameTo(destino);
        archivoActual = destino;
        return resultado;
    }

}
