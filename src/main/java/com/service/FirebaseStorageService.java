/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.service;

import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author natha
 */
public interface FirebaseStorageService {
    
    public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id);

    //El BuketName es el <id_del_proyecto> + ".appspot.com"
    
    
    ////////////////////////////////////////////////////////
    final String BucketName = "proyectog1-c7dc7-firebase-adminsdk-fbsvc-5d89ec44c1";
    ////////////////////////////////////////////////////////
    ///
    ///
    //Esta es la ruta básica de este proyecto Techshop
    final String rutaSuperiorStorage = "ProyectoG1/nathanaelCaballero";

    //Ubicación donde se encuentra el archivo de configuración Json
    final String rutaJsonFile = "firebase";
    
    //El nombre del archivo Json
    
    //////////////////////////////////////////////////////////
    final String archivoJsonFile = "proyectog1-c7dc7-firebase-adminsdk-fbsvc-5d89ec44c1";
    /////////////////////////////////////////////////////////
}
